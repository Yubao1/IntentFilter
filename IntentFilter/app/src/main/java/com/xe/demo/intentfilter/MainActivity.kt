package com.xe.demo.intentfilter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Created by 86188 on 2021/6/2.
 */
class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(v: View) {
        if (v.id == R.id.btn_1) {
            var intent: Intent = Intent(Intent.ACTION_VIEW);
            intent.putExtra("key","这是利用系统预定义的action启动Activity")
            startActivity(intent)
        } else if (v.id == R.id.btn_2) {
            var intent: Intent = Intent("xiaoer");
            intent.putExtra("key","这是利用自定义的action启动Activity")
            startActivity(intent)
        } else if (v.id == R.id.btn_3) {
            var intent: Intent = Intent(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_APP_BROWSER)
            intent.putExtra("key","这是利用系统预定义的category启动Activity")
            startActivity(intent)
        } else if (v.id == R.id.btn_4) {
            var intent: Intent = Intent(Intent.ACTION_VIEW);
            intent.addCategory("xiaoer_study")
            intent.putExtra("key","这是利用自定义的category启动Activity")
            startActivity(intent)
        } else if (v.id == R.id.btn_5) {
            var intent: Intent = Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("recyclemobilephones://homePage"))
            intent.putExtra("key","这是利用只含有uri的data启动Activity")
            startActivity(intent)
        } else if (v.id == R.id.btn_6) {
            var intent: Intent = Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(Uri.parse("recyclemobilephones://homePage_2"),"text/plain")
            intent.putExtra("key","这是利用含有uri和mimeType的data启动Activity")
            startActivity(intent)
        }
    }
}