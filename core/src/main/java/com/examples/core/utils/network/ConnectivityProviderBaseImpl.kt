package com.examples.core.utils.network

import android.os.Handler
import android.os.Looper


abstract class ConnectivityProviderBaseImpl : ConnectivityProvider {
    private val handler = Handler(Looper.getMainLooper())
    private val listeners = mutableSetOf<ConnectivityProvider.ConnectivityStateListener>()
    private var subscribed = false

    override fun addListener(listener: ConnectivityProvider.ConnectivityStateListener) {
        listeners.add(listener)
        listener.onNetworkStateChange(getNetworkState()) // propagate an initial state
        verifySubscription()
    }

    override fun removeListener(listener: ConnectivityProvider.ConnectivityStateListener) {
        listeners.remove(listener)
        verifySubscription()
    }

    private fun verifySubscription() {
        if (!subscribed && listeners.isNotEmpty()) {
            subscribe()
            subscribed = true
        } else if (subscribed && listeners.isEmpty()) {
            unsubscribe()
            subscribed = false
        }
    }

    protected fun dispatchChange(state: ConnectivityProvider.NetworkState) {
        handler.post {
            for (listener in listeners) {
                listener.onNetworkStateChange(state)
            }
        }
    }

    protected abstract fun subscribe()
    protected abstract fun unsubscribe()
}