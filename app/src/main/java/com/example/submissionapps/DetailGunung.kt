package com.example.submissionapps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity


class DetailGunung : AppCompatActivity(), View.OnClickListener {

    private lateinit var detailFotoGunung : ImageView
    private lateinit var namaGunungDetail : TextView
    private lateinit var lokasiGunungDetail : TextView
    private lateinit var ketinggianDetail : TextView
    private lateinit var descGunungDetail : TextView
    private lateinit var btnGoBack : Button
    private lateinit var btnCheckMaps : Button
    private lateinit var mountainNameClass : String

    companion object {
        const val DATA_NAMA = "data_nama"
        const val DATA_GAMBAR = "data_gambar"
        const val DATA_LOKASI = "data_lokasi"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gunung)
        setActionBarTitle("Pesona Gunung Indonesia")

        mountainNameClass = intent.getStringExtra(DATA_NAMA).toString()
        val mountainLocation = intent.getStringExtra(DATA_LOKASI)
        val mountainImage = intent.getIntExtra(DATA_GAMBAR, 0)
        detailFotoGunung = findViewById(R.id.detail_foto_gunung)
        detailFotoGunung.setImageResource(mountainImage)

        if(mountainLocation != null){
            setDetailInformation(mountainNameClass, mountainLocation)

        }

        btnGoBack = findViewById(R.id.btn_back_home)
        btnCheckMaps = findViewById(R.id.btn_look_maps)

        btnGoBack.setOnClickListener(this)
        btnCheckMaps.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_back_home ->{
                finish()
            }
            R.id.btn_look_maps ->{
                val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=${mountainNameClass}"))
                mapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mapIntent)
            }
        }
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun setDetailInformation(mountainName : String, mountainLocation: String){
        namaGunungDetail = findViewById(R.id.nama_gunung_detail)
        lokasiGunungDetail = findViewById(R.id.lokasi_tabel)
        ketinggianDetail = findViewById(R.id.ketinggial_tabel)
        descGunungDetail = findViewById(R.id.desc_detail)

        namaGunungDetail.text = mountainName.toString()

        lokasiGunungDetail.text = mountainLocation.toString()

        ketinggianDetail.text = DataGunung.ketingganGunung[mountainName].toString()

        descGunungDetail.text = DataGunung.descGunung[mountainName].toString()

    }

}