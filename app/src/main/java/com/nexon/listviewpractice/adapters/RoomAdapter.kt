package com.nexon.listviewpractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nexon.listviewpractice.R
import com.nexon.listviewpractice.datas.Room

class RoomAdapter (context : Context, resID:Int, list:ArrayList<Room>)  : ArrayAdapter<Room>(context, resID, list)  {
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }
        val row = tempRow!!

        return  row

    }

}