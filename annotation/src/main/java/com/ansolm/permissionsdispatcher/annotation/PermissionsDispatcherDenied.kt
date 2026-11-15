package com.ansolm.permissionsdispatcher.annotation
/**
 * author : ansolm
 * e-mail : ansolm@outlook.com
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.BINARY)
annotation class PermissionsDispatcherDenied(vararg val value: String, val identity: Int = 0)