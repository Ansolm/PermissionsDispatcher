package com.ansolm.permissionsdispatcher.example

import android.os.Bundle
import android.util.Log
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.ansolm.permissionsdispatcher.annotation.Permission
import com.ansolm.permissionsdispatcher.annotation.PermissionsDispatcher
import com.ansolm.permissionsdispatcher.annotation.PermissionsDispatcherDenied
import com.ansolm.permissionsdispatcher.annotation.PermissionsDispatcherNeeds
import com.ansolm.permissionsdispatcher.annotation.PermissionsDispatcherRationale
import com.ansolm.permissionsdispatcher.annotation.PermissionsRationale

/**
 * author : ansolm
 * e-mail : ansolm@outlook.com
 */
@PermissionsDispatcher
class MainPermissionRationaleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        captureCameraWithPermission(10, 10, null)
    }

    @PermissionsDispatcherNeeds(
        value = [
            Permission(value = android.Manifest.permission.CAMERA),
            Permission(value = android.Manifest.permission.ACCESS_FINE_LOCATION),
            Permission(value = android.Manifest.permission.WRITE_CALENDAR)
        ],
        identity = 1
    )
    fun captureCamera(width: Int, height: Int, paths: List<List<String?>?>?) {
        Log.v("dzq", "captureCamera ")
    }

    @PermissionsDispatcherDenied(
        value = [
            android.Manifest.permission.CAMERA,
            android.Manifest.permission.ACCESS_FINE_LOCATION,
            android.Manifest.permission.WRITE_CALENDAR
        ],
        identity = 1
    )
    fun denyCaptureCamera(result: Map<String, Boolean>) {
//        Log.v("dzq", "denyCaptureCamera permission:${deniedPermissions.joinToString()}\nbannedResults:${bannedResults.joinToString()}")
    }

    @PermissionsDispatcherRationale(
        value = [
            android.Manifest.permission.CAMERA,
            android.Manifest.permission.ACCESS_FINE_LOCATION,
            android.Manifest.permission.WRITE_CALENDAR
        ],
        identity = 1
    )
    fun rationaleCamera(rationale: PermissionsRationale) {
        Log.v("dzq", "rationaleCamera")
        rationale.apply()
    }
}