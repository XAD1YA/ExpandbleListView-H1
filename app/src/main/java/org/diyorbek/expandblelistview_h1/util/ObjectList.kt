package org.diyorbek.expandblelistview_h1.util

import org.diyorbek.expandblelistview_h1.R
import org.diyorbek.expandblelistview_h1.model.CountyInfo

object ObjectList {
    val title: MutableList<String> = ArrayList()
    val subTitle: MutableList<MutableList<CountyInfo>> = ArrayList()
    fun countryesList(): MutableList<CountyInfo>{
        val list = mutableListOf<CountyInfo>()
        list.add(CountyInfo(R.drawable.afghanistan,"Afghanistan"))
        list.add(CountyInfo(R.drawable.afghanistan,"China"))
        list.add(CountyInfo(R.drawable.afghanistan,"India"))
        list.add(CountyInfo(R.drawable.afghanistan,"Pakistan"))
        list.add(CountyInfo(R.drawable.afghanistan,"Afghanistan"))
        list.add(CountyInfo(R.drawable.afghanistan,"Afghanistan"))
        return list
    }
    fun countryesLisSecond(): MutableList<CountyInfo>{
        val list = mutableListOf<CountyInfo>()
        list.add(CountyInfo(R.drawable.afghanistan,"South Africa"))
        return list
    }
    fun countryesLisThird(): MutableList<CountyInfo>{
        val list = mutableListOf<CountyInfo>()
        list.add(CountyInfo(R.drawable.afghanistan,"Canada"))
        return list
    }
    fun countryesLisFour(): MutableList<CountyInfo>{
        val list = mutableListOf<CountyInfo>()
        list.add(CountyInfo(R.drawable.afghanistan,"Argentina"))
        return list
    }

}