package com.oatrice.learnrecyclerviewviewholderoutter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataList = ArrayList<Model>()
        dataList.add(Model(Type_A, "AAA"))
        dataList.add(Model(Type_B, "BBB"))
        dataList.add(Model(Type_A, "CCC"))
        dataList.add(Model(Type_B, "DDD"))
        dataList.add(Model(Type_B, "EEE"))


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(this, dataList)

    }
}
