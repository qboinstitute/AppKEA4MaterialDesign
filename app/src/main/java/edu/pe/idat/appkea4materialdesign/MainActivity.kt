package edu.pe.idat.appkea4materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import edu.pe.idat.appkea4materialdesign.adapter.AndroidAdapter
import edu.pe.idat.appkea4materialdesign.databinding.ActivityMainBinding
import edu.pe.idat.appkea4materialdesign.service.DatosService

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val dataAndroid = DatosService()
        binding.rvandroid.adapter = AndroidAdapter(dataAndroid.listaVersionesAndroid(),
        this)
        binding.rvandroid.layoutManager = LinearLayoutManager(this)
        setContentView(binding.root)
    }
}