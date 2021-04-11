package kg.timur.app.kotlinhomework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textEt = findViewById<EditText>(R.id.et_text)

        btn_send.setOnClickListener {
            val data = textEt.text.toString()

            if (data.trim().isEmpty()){
                Toast.makeText(applicationContext, "Введите текст", Toast.LENGTH_SHORT).show()
            }else{
                val intent  = Intent(this, ResultActivity::class.java)
                intent.putExtra("Text", data)
                startActivity(intent)
            }

        }
    }
}