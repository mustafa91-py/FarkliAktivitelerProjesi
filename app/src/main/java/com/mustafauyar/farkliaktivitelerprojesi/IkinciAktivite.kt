package com.mustafauyar.farkliaktivitelerprojesi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class IkinciAktivite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_aktivite)
    }
    fun aktiviteDegistir(view: View){
        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }
}