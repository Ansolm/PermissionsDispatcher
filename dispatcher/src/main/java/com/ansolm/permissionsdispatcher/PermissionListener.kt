package com.ansolm.permissionsdispatcher

interface PermissionListener {
    fun onPermissionResult(result: Map<String, Boolean>)
}