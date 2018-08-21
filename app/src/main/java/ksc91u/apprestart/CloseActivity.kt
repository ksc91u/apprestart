package ksc91u.apprestart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_close.*

class CloseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_close)

        close_btn.setOnClickListener {
            finishAffinity()
            DemoJobCreator.scheduleRestart()
            System.exit(0)
        }
    }
}
