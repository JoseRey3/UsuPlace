package com.example.usuplace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainSearchSite : AppCompatActivity() {

    private val category = listOf(
        placeCategory.parque,
        placeCategory.cerros,
        placeCategory.montañas,
        placeCategory.piscina
    )

    private lateinit var populares: RecyclerView
    private lateinit var placeAdapter: placeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_search_site)
        initComponent()
        initUI()
    }

    private fun initComponent() {
        populares = findViewById(R.id.populares)
    }

    private fun initUI() {
        placeAdapter = placeAdapter(category)
        populares.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        populares.adapter = placeAdapter
    }
}
