package com.mustafauyar.farkliaktivitelerprojesi
import com.mustafauyar.farkliaktivitelerprojesi.databinding.ActivityMainBinding


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun aktiviteDegistir(view:View){
        val kullaniciVerisi = binding.nameText.text.toString()
        val intent = Intent(applicationContext,IkinciAktivite::class.java)
        intent.putExtra("yollananVeri",kullaniciVerisi)
        startActivity(intent)
    }
}