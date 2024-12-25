package com.brainsoft.surahlist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.ConsoleMessage
import android.webkit.WebChromeClient
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    lateinit var Wv: WebView

    @SuppressLint("SetJavaScriptEnabled", "AddJavascriptInterface")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wv = findViewById<WebView>(R.id.wv)
        this.Wv = wv
        val setting = wv.settings;
        setting.javaScriptEnabled = true
        setting.setSupportZoom(false)
        setting.setDomStorageEnabled(true);
        wv.setOnLongClickListener { v -> true }
        wv.isLongClickable = false
        //wv.webViewClient= WebViewClient()
        wv.webChromeClient = object : WebChromeClient() {
            override fun onConsoleMessage(consoleMessage: ConsoleMessage): Boolean {
                Log.e(
                    "MyApplication", consoleMessage.message() + " -- From line "
                            + consoleMessage.lineNumber() + " of "
                            + consoleMessage.sourceId()
                )
                return super.onConsoleMessage(consoleMessage)
            }
        }
        //wv.addJavascriptInterface(JsIface1(this), "android")

        wv.loadUrl("file:///android_asset/index.html")
    }
}