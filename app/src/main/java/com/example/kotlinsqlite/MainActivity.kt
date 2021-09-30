package com.example.kotlinsqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    private lateinit var handler:SQLiteHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler=SQLiteHelper(this)
        btnAdd.setOnClickListener(){
            handler.insertsTeacher(this.edName.text.toString(),this.edLastName.text.toString(),this.edCode.text.toString(),this.edDNI.text.toString(),this.edPhone.text.toString(),this.edEmail.text.toString())
            Toast.makeText(this, "Registro guardado con exito...",Toast.LENGTH_LONG).show()
            val intent:Intent=Intent(this, MainActivity::class.java)

        }
        btnView.setOnClickListener(){
            val intent:Intent=Intent(this, ListarProfesores::class.java)
            startActivity(intent)
        }

    }
}