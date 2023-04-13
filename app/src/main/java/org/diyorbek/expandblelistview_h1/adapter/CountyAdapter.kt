package org.diyorbek.expandblelistview_h1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ImageView
import android.widget.TextView
import org.diyorbek.expandblelistview_h1.model.CountyInfo
import org.diyorbek.expandblelistview_h1.R

class CountyAdapter(
    private val context: Context,
    private val title: MutableList<String>,
    private val subtitle: MutableList<MutableList<CountyInfo>>
):BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return title.size
    }

    override fun getChildrenCount(p0: Int): Int {
        return subtitle[p0].size
    }

    override fun getGroup(p0: Int): Any {
        return title[p0]
    }

    override fun getChild(p0: Int, p1: Int): Any {
        return subtitle[p0][p1]
    }

    override fun getGroupId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getChildId(p0: Int, p1: Int): Long {
        return p1.toLong()
    }

    override fun hasStableIds(): Boolean = false

    override fun getGroupView(p0: Int, p1: Boolean, p2: View?, p3: ViewGroup?): View {
        var myConverterView = p2
        if (myConverterView == null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            myConverterView = inflater.inflate(R.layout.title, null)
        }
        val title: TextView = myConverterView!!.findViewById(R.id.countyName)
        title.text = getGroup(p0).toString()
        return myConverterView
    }

    override fun getChildView(p0: Int, p1: Int, p2: Boolean, p3: View?, p4: ViewGroup?): View {
        var myConverterView = p3
        if (myConverterView == null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            myConverterView = inflater.inflate(R.layout.subtitle, null)
        }

        val subTitleImage: ImageView = myConverterView!!.findViewById(R.id.countryImage)
        val title: TextView = myConverterView.findViewById(R.id.countyName)
        //val text = getChild(p0,p1).toString()

        title.text = getGroup(p0).toString()
        val afw = getGroup(p0) as CountyInfo
        subTitleImage.setImageResource(afw.image)
        title.text = afw.name
        return myConverterView
    }

    override fun isChildSelectable(p0: Int, p1: Int): Boolean = false
}