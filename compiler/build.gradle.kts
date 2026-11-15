plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
    }
}



dependencies {
    implementation(libs.symbol.processing.api)
    implementation(libs.kotlinsymbolprocessor)
    implementation(project(":annotation"))
}


val sourcesJar by tasks.creating(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.getByName("main").allSource)
    from("README.md") {
        into("META-INF")
    }
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.ansolm.permissionsdispatcher"
            artifactId = "compiler"
            from(components["java"])
            artifact(sourcesJar)
        }
    }
}
