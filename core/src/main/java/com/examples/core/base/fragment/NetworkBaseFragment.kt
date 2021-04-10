package com.examples.core.base.fragment

import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.examples.core.utils.network.ConnectivityProvider
import com.examples.core.utils.network.NetworkUtils


/**
 * Created by Shehab Elsarky
 */
open class NetworkBaseFragment : Fragment(), ConnectivityProvider.ConnectivityStateListener {

    private val TAG = NetworkBaseFragment::class.java.simpleName

    companion object {
        var isNetworkConnected = true
    }

    private val provider: ConnectivityProvider by lazy { ConnectivityProvider.createProvider(requireContext()) }


    override fun onResume() {
        super.onResume()
        provider.addListener(this)
    }

    override fun onStop() {
        super.onStop()
        provider.removeListener(this)
    }

    override fun onNetworkStateChange(state: ConnectivityProvider.NetworkState) {
        val hasInternet = NetworkUtils.isNetworkConnected(state)
        isNetworkConnected = hasInternet
        Log.d(TAG, "Is Network connected: $hasInternet")
    }
}