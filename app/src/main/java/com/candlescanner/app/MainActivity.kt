package com.candlescanner.app

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "Candle Scanner"
            textSize = 28f
            setPadding(40, 80, 40, 40)
        }

        setContentView(textView)
    }
}
