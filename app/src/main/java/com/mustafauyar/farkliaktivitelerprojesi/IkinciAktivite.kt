package com.mustafauyar.farkliaktivitelerprojesi
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mustafauyar.farkliaktivitelerprojesi.databinding.ActivityIkinciAktiviteBinding

class IkinciAktivite : AppCompatActivity() {
    private lateinit var binding:ActivityIkinciAktiviteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_aktivite)
//        val intent = intent
        val alinanveri = intent.getStringExtra("yollananVeri")
        binding = ActivityIkinciAktiviteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ikinciText.text = alinanveri
    }
    fun aktiviteDegistir(view: View){
        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }
}