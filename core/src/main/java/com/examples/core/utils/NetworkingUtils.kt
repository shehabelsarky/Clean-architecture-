package com.examples.core.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.telephony.TelephonyManager

/**
 * Created by shehab on 4/17/2018.
 */

object NetworkingUtils {

    /*
     * HACKISH: These constants aren't yet available in my API level (7), but I need to handle these cases if they come up, on newer versions
     */
    val NETWORK_TYPE_EHRPD = 14 // Level 11
    val NETWORK_TYPE_EVDO_B = 12 // Level 9
    val NETWORK_TYPE_HSPAP = 15 // Level 13
    val NETWORK_TYPE_IDEN = 11 // Level 8
    val NETWORK_TYPE_LTE = 13 // Level 11
    var TYPE_NOT_CONNECTED = 0

    /** A type which indicates that the device is connected via Wi-Fi  */
    var TYPE_WIFI = 1

    /** A type which indicates that the device is connected via Mobile Data  */
    var TYPE_MOBILE = 2

    /**
     * Indicates whether the device is connected to a network, doesn't
     * necessarily mean that Internet is present
     *
     * @return True if the device is connected, false otherwise
     */
    lateinit var applicationContext: Context

    fun setNetworkingApplicationContext(context: Context) { this.applicationContext = context}

    val isNetworkConnected: Boolean
    get(){
        val connectivity = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val info = connectivity.allNetworkInfo
        if (info != null)
            for (i in info.indices)
                if (info[i].state == NetworkInfo.State.CONNECTED) {
                    return true
                }
        return false
    }

    fun isConnectedFast(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val info = cm.activeNetworkInfo
        return info != null && info.isConnected && NetworkingUtils.isConnectionFast(
            info.type,
            info.subtype
        )
    }

    fun isConnectionFast(type: Int, subType: Int): Boolean {
        if (type == ConnectivityManager.TYPE_WIFI) {
            println("CONNECTED VIA WIFI")
            return true
        } else return if (type == ConnectivityManager.TYPE_MOBILE) {
            when (subType) {
                TelephonyManager.NETWORK_TYPE_1xRTT -> false // ~ 50-100 kbps
                TelephonyManager.NETWORK_TYPE_CDMA -> false // ~ 14-64 kbps
                TelephonyManager.NETWORK_TYPE_EDGE -> false // ~ 50-100 kbps
                TelephonyManager.NETWORK_TYPE_EVDO_0 -> true // ~ 400-1000 kbps
                TelephonyManager.NETWORK_TYPE_EVDO_A -> true // ~ 600-1400 kbps
                TelephonyManager.NETWORK_TYPE_GPRS -> false // ~ 100 kbps
                TelephonyManager.NETWORK_TYPE_HSDPA -> true // ~ 2-14 Mbps
                TelephonyManager.NETWORK_TYPE_HSPA -> true // ~ 700-1700 kbps
                TelephonyManager.NETWORK_TYPE_HSUPA -> true // ~ 1-23 Mbps
                TelephonyManager.NETWORK_TYPE_UMTS -> true // ~ 400-7000 kbps
                // NOT AVAILABLE YET IN API LEVEL 7
                NetworkingUtils.NETWORK_TYPE_EHRPD -> true // ~ 1-2 Mbps
                NetworkingUtils.NETWORK_TYPE_EVDO_B -> true // ~ 5 Mbps
                NetworkingUtils.NETWORK_TYPE_HSPAP -> true // ~ 10-20 Mbps
                NetworkingUtils.NETWORK_TYPE_IDEN -> false // ~25 kbps
                NetworkingUtils.NETWORK_TYPE_LTE -> true // ~ 10+ Mbps
                // Unknown
                TelephonyManager.NETWORK_TYPE_UNKNOWN -> false
                else -> false
            }
        } else {
            false
        }
    }

    /**
     * Returns current state of the network as a type of these [
     * [NetworkingUtils.TYPE_MOBILE] or [NetworkingUtils.TYPE_WIFI]
     * or [NetworkingUtils.TYPE_NOT_CONNECTED] ]
     *
     * @return
     */
    val connectivityStatus: Int
        get() {
            val cm = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

            val activeNetwork = cm.activeNetworkInfo
            if (null != activeNetwork) {
                if (activeNetwork.type == ConnectivityManager.TYPE_WIFI)
                    return TYPE_WIFI

                if (activeNetwork.type == ConnectivityManager.TYPE_MOBILE)
                    return TYPE_MOBILE
            }
            return TYPE_NOT_CONNECTED
        }

}
