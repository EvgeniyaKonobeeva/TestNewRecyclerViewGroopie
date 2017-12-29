package com.example.ekonobeeva.testnewrecyclerviewgroopie.models

import com.example.ekonobeeva.testnewrecyclerviewgroopie.R
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.list_item.view.*

/**
 * Created by e.konobeeva on 22.12.2017.
 */
data class PreviewModel(var preText : String, var iconUrl : String, var timeStartL : Long, var timeStartS : String, var idd : Int) : Item<ViewHolder>(){

    override fun getLayout() =  idd

    override fun bind(viewHolder: ViewHolder, position: Int) {
        with(viewHolder.itemView){
            list_item_text_view_1.text=preText
            list_item_text_view.text = timeStartS
        }
    }
}