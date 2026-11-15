package com.ansolm.permissionsdispatcher.annotation
/**
 * author : ansolm
 * e-mail : ansolm@outlook.com
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.BINARY)
annotation class PermissionsDispatcherNeeds(vararg val value: Permission, val identity: Int = 0)