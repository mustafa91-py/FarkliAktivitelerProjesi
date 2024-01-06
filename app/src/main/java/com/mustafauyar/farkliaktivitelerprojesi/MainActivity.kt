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
        println("onCreate çağrıldı")
    }

    override fun onStart() {
        super.onStart()
        println("onStart çağrıldı")
    }

    override fun onResume() {
        super.onResume()
        println("onResume çağrıldı")
    }

    override fun onPause() {
        super.onPause()
        println("onPause çağrıldı")
    }

    override fun onStop() {
        super.onStop()
        println("onStop çağrıldı")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy çağrıldı")
    }
    fun aktiviteDegistir(view:View){
        val kullaniciVerisi = binding.nameText.text.toString()
        val intent = Intent(applicationContext,IkinciAktivite::class.java)
        intent.putExtra("yollananVeri",kullaniciVerisi)
        startActivity(intent)//ikinci activiteyi başlat
        finish()//main aktiviteyi yani pencereyi tamamen kapatıyor geri dönemiyon
    }
}