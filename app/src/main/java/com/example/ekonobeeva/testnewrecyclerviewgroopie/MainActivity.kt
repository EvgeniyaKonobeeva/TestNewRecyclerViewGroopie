package com.example.ekonobeeva.testnewrecyclerviewgroopie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.example.ekonobeeva.testnewrecyclerviewgroopie.models.PreviewModel
import com.example.ekonobeeva.testnewrecyclerviewgroopie.struct_announsements.Announcement
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
//        var adapterMy = GroupAdapter<ViewHolder>()
//
//        activity_main_recycler_view.layoutManager = LinearLayoutManager(this)
//        activity_main_recycler_view.adapter = adapterMy
//
//
//        adapterMy.clear()
////        adapterMy.addAll(generateTestList())
//        adapterMy.notifyDataSetChanged()

    }


    private fun generateTestList() : List<Announcement>{
        var mutableList = mutableListOf<Announcement>()

        mutableList.apply {
            for (i in 0..10){
                Log.d(TAG, "generateTestList $i")

            }
        }

        return mutableList

    }

//    private
}
