package com.ansolm.permissionsdispatcher.compiler

import com.ansolm.permissionsdispatcher.annotation.PermissionDispatcherRationale
import com.ansolm.permissionsdispatcher.annotation.PermissionsDispatcherDenied
import com.ansolm.permissionsdispatcher.annotation.PermissionsDispatcherNeeds
import com.ansolm.permissionsdispatcher.annotation.PermissionsDispatcherRationale

/**
 * @author ansolm
 * @since 2024/8/21
 */
val PermissionsDispatcherNeeds.values: Pair<List<String>, Int> get() = value.toList().map { it.value }.sorted() to identity
val PermissionsDispatcherRationale.values: Pair<List<String>, Int> get() = value.toList().sorted() to identity
val PermissionDispatcherRationale.values: Pair<List<String>, Int> get() = value.toList().sorted() to identity
val PermissionsDispatcherDenied.values: Pair<List<String>, Int> get() = value.toList().sorted() to identity