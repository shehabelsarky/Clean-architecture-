package com.example.popularpersons.ui.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.Window
import android.view.WindowManager
import android.widget.EditText
import android.widget.TextView
import com.example.popularpersons.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by Shehab Elsarky.
 */
class AddCityDialog(val onAddCityClickListener:(String) -> Unit) {

    private lateinit var dialog: Dialog
    private lateinit var etCity: EditText
    private lateinit var btnOk: TextView
    var isShown = false

     fun showDialog(context: Context) {
        if (isShown)
            return

        dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.dialog_add_city)
        dialog.setCancelable(true)
        dialog.setCanceledOnTouchOutside(false)

        initViews()

        dialog.window?.apply {
            setLayout(
                WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT
            )
            setFlags(
                WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM,
                WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM
            )
            setGravity(Gravity.CENTER)
            setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }

        dialog.show()
    }


    fun dismiss(withDelay: Boolean = true) {
        if (withDelay) CoroutineScope(Dispatchers.Main).launch {
            delay(1000)
            dialog.dismiss()
        }
        else dialog.dismiss()
    }

    private fun initViews() {
        btnOk = dialog.findViewById(R.id.btn_ok)
        etCity = dialog.findViewById(R.id.etCity)
        btnOk.setOnClickListener {
            onAddCityClickListener(etCity.text.toString())
            dismiss(false)
        }
    }
}