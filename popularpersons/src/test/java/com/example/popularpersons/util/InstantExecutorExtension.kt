package com.example.popularpersons.util

import androidx.arch.core.executor.ArchTaskExecutor
import androidx.arch.core.executor.TaskExecutor
import org.junit.jupiter.api.extension.AfterEachCallback
import org.junit.jupiter.api.extension.BeforeEachCallback
import org.junit.jupiter.api.extension.ExtensionContext

class InstantExecutorExtension : AfterEachCallback, BeforeEachCallback {

    @Throws(Exception::class)
    override fun afterEach(context: ExtensionContext) {
        ArchTaskExecutor.getInstance().setDelegate(null)
    }

    @Throws(Exception::class)
    override fun beforeEach(context: ExtensionContext) {
        ArchTaskExecutor.getInstance()
            .setDelegate(object : TaskExecutor() {
                override fun executeOnDiskIO(runnable: Runnable) { runnable.run() }

                override fun postToMainThread(runnable: Runnable) { runnable.run() }

                override fun isMainThread(): Boolean { return true }
            })
    }
}