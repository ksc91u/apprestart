package ksc91u.apprestart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_close.*
import tw.ksc91u.appphoenix.AppPhoenix

class CloseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_close)

        close_btn.setOnClickListener {
            AppPhoenix.getInstance().restart(this)
        }
    }
}
