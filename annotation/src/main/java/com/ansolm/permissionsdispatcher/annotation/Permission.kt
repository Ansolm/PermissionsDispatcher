package com.ansolm.permissionsdispatcher.annotation

/**
 * author : ansolm
 * e-mail : ansolm@outlook.com
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.BINARY)
annotation class Permission(val value: String, val min: Int = 23, val max: Int = Int.MAX_VALUE)
