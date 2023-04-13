package org.diyorbek.expandblelistview_h1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import org.diyorbek.expandblelistview_h1.adapter.CountyAdapter
import org.diyorbek.expandblelistview_h1.util.ObjectList

class MainActivity : AppCompatActivity() {
    private lateinit var expandableAdapter: CountyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val expandableListView: ExpandableListView = findViewById(R.id.listView)
        ObjectList.title.add("Asia")
        ObjectList.title.add("Africa")
        ObjectList.title.add("North America")
        ObjectList.title.add("South America")

        ObjectList.subTitle.add(ObjectList.countryesList())
        ObjectList.subTitle.add(ObjectList.countryesLisSecond())
        ObjectList.subTitle.add(ObjectList.countryesLisThird())
        ObjectList.subTitle.add(ObjectList.countryesLisFour())

        expandableAdapter = CountyAdapter(
            this, ObjectList.title, ObjectList.subTitle
        )
        expandableListView.setAdapter(
            expandableAdapter
        )
    }
}