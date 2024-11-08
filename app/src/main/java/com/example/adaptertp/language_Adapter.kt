package com.example.adaptertp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class LanguageAdapter(val ctx : Context, val listLanguages: List<Languages>) : BaseAdapter(){
    override fun getCount(): Int {
        return listLanguages.size
    }

    override fun getItem(p0: Int): Any {
        return listLanguages[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var v1 = p1?: LayoutInflater.from(ctx) .inflate(R.layout.languages_layout,p2,false)

        var name = v1.findViewById<TextView>(R.id.name)
        var img = v1.findViewById<ImageView>(R.id.img)


        val objt = getItem(p0) as Languages
        name.text = objt.name
        img.setImageResource(objt.img)
        return v1
    }

}