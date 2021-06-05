package com.xe.demo.intentfilter

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    var mTv: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        mTv = findViewById(R.id.tv)
        var intent: Intent = getIntent();
        var value: String = intent.getStringExtra("key")
        if (value != null) {
            mTv!!.setText(value)
        }
    }
}
