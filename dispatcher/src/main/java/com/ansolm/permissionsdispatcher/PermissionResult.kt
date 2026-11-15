package com.ansolm.permissionsdispatcher

import androidx.activity.result.ActivityResultCallback

/**
 * author : ansolm
 * e-mail : ansolm@outlook.com
 */
class PermissionResult : ActivityResultCallback<Map<String, Boolean>> {
    private val listeners = mutableListOf<PermissionListener>()

    override fun onActivityResult(result: Map<String, Boolean>) {
        listeners.forEach { it.onPermissionResult(result) }
        listeners.clear()
    }

    fun registerPermissionListener(listener: PermissionListener) {
        this.listeners.add(listener)
    }
}