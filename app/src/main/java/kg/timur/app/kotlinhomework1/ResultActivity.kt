package kg.timur.app.kotlinhomework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val intent = intent
        val data = intent.getStringExtra("Text")

        val resultTv = findViewById<TextView>(R.id.tv_result)
        resultTv.text = data
    }
}