package com.ansolm.permissionsdispatcher.annotation
/**
 * author : ansolm
 * e-mail : ansolm@outlook.com
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.BINARY)
annotation class PermissionDispatcherRationale(vararg val value: String, val target:String, val identity: Int = 0)