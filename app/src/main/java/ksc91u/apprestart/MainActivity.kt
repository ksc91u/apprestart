package ksc91u.apprestart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_text.text = "Current process id " + android.os.Process.myPid()

        btn.setOnClickListener {
            startActivity(Intent(this@MainActivity, CloseActivity::class.java))
        }
    }
}
