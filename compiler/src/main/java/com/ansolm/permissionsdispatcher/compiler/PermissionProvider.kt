package com.ansolm.permissionsdispatcher.compiler

import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider

/**
 * author : ansolm
 * e-mail : ansolm@outlook.com
 */
class PermissionProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return PermissionProcessor(environment)
    }
}