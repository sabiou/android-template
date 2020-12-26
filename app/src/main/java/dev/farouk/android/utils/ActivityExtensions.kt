package dev.farouk.android.utils

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Farouk on 26/12/2020.
 */
fun AppCompatActivity.goToActivity(context: Context, clss: Class<*>) {
    this.startActivity(Intent(context, clss))
}