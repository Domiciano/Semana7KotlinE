package edu.co.icesi.semana7kotline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        regBtn.setOnClickListener{

            val estudiante = Estudiante(
                nameET.text.toString(),
                emailET.text.toString(),
                userET.text.toString(),
                univET.text.toString()
            )
            val json = Gson().toJson(estudiante)
            Toast.makeText(this@MainActivity, json, Toast.LENGTH_LONG).show()

        }
    }
}