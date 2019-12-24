package com.example.pruebaweb

import android.os.Bundle
import android.webkit.WebSettings
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        web.loadUrl("https://mi.psa.com.ar/")

        val webSettings: WebSettings = web.settings
        webSettings.javaScriptEnabled = true
        web.webViewClient = myWebViewClient()

    }
}
