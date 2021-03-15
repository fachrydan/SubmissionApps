package com.example.submissionapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvGunung: RecyclerView
    private var title = "Pesona Gunung Indonesia"
    private var listMain: ArrayList<Gunung> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setActionBarTitle(title)
        setContentView(R.layout.activity_main)

        rvGunung = findViewById(R.id.rv_gunung)
        rvGunung.setHasFixedSize(true)

        listMain.addAll(DataGunung.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvGunung.layoutManager = LinearLayoutManager(this)
        val listMountainAdapter = ListMountainAdapter(listMain)
        rvGunung.adapter = listMountainAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when (selectedMode){
            R.id.action_list ->{
                showRecyclerList()
            }
            R.id.action_about ->{
                startActivity(Intent(this@MainActivity, AboutDev::class.java))
            }
        }
    }

    private fun setActionBarTitle(title: String){
        if(supportActionBar != null){
            (supportActionBar as ActionBar).title = title
        }
    }

}