package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.MyAdapter
import com.example.recyclerview.models.Mymodel

class MainActivity : AppCompatActivity() {


    lateinit var recycleView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<Mymodel>
    lateinit var thisAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext , 3 , LinearLayoutManager.VERTICAL , false)
        recycleView.layoutManager = gridLayoutManager
        recycleView.setHasFixedSize(true)

        arrayList = setupData()

        thisAdapter = MyAdapter(applicationContext, arrayList)
        recycleView.adapter = thisAdapter

        



    }

    private fun setupData(): ArrayList<Mymodel> {
            var items : ArrayList<Mymodel> = ArrayList()

            items.add( Mymodel(R.drawable.p1, "Unexpected Surprise"));
            items.add( Mymodel(R.drawable.p2, "Journey Begins"));
            items.add( Mymodel(R.drawable.p3, "Hidden Secrets"));
            items.add( Mymodel(R.drawable.p4, "Eternal Mystery"));
            items.add( Mymodel(R.drawable.p5, "Whispers in the Shadows"));
            items.add( Mymodel(R.drawable.p6, "Infinite Possibilities"));
            items.add( Mymodel(R.drawable.p7, "Timeless Adventure"));
            items.add( Mymodel(R.drawable.p8, "Mystical Encounter"));
            items.add( Mymodel(R.drawable.p9, "Enigmatic Revelation"));
            items.add( Mymodel(R.drawable.p10, "Uncharted Territory"));
            items.add( Mymodel(R.drawable.p11, "Astral Awakening"));
            items.add( Mymodel(R.drawable.p12, "Celestial Wonders"));
            items.add( Mymodel(R.drawable.p13, "Forbidden Realm"));
            items.add( Mymodel(R.drawable.p14, "Lost Horizon"));
            items.add( Mymodel(R.drawable.p15, "Unseen Forces"));
            items.add( Mymodel(R.drawable.p16, "Ephemeral Dreams"));
            items.add( Mymodel(R.drawable.p17, "Parallel Realms"));
            items.add( Mymodel(R.drawable.p18, "Arcane Riddles"));
            items.add( Mymodel(R.drawable.p19, "Mythical Odyssey"));
            items.add( Mymodel(R.drawable.p20, "Emerald Enchantment"));
            items.add( Mymodel(R.drawable.p21, "Twilight Mirage"));
            items.add( Mymodel(R.drawable.p22, "Crimson Whirlwind"));
            items.add( Mymodel(R.drawable.p23, "Lunar Eclipse"));
            items.add( Mymodel(R.drawable.p24, "Stellar Convergence"));
            items.add( Mymodel(R.drawable.p25, "Sapphire Serenity"));

        return items

    }
}