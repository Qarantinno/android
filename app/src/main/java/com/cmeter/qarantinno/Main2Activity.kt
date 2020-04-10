package com.cmeter.qarantinno

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        setBarChart()
    }
    private fun setBarChart() {
        val entries = ArrayList<BarEntry>()
        entries.add(BarEntry(5f, 0))
        entries.add(BarEntry(20f, 1))
        entries.add(BarEntry(5f, 2))
        entries.add(BarEntry(20f, 3))
        entries.add(BarEntry(15f, 4))
        entries.add(BarEntry(10f, 5))
        entries.add(BarEntry(11f, 6))
        entries.add(BarEntry(90f, 7))
        entries.add(BarEntry(15f, 8))
        entries.add(BarEntry(20f, 9))
        entries.add(BarEntry(10f, 10))
        entries.add(BarEntry(16f, 11))
        entries.add(BarEntry(17f, 12))
        entries.add(BarEntry(18f, 13))
        entries.add(BarEntry(19f, 14))
        entries.add(BarEntry(20f, 15))
        entries.add(BarEntry(15f, 16))
        entries.add(BarEntry(14f, 17))
        entries.add(BarEntry(60f, 18))
        entries.add(BarEntry(10f, 19))
        entries.add(BarEntry(9f, 20))
        entries.add(BarEntry(8f, 21))
        entries.add(BarEntry(1f, 22))
        entries.add(BarEntry(15f, 23))

        val barDataSet = BarDataSet(entries, "People in shop")

        val labels = ArrayList<String>()
        labels.add("0:00")
        labels.add("1:00")
        labels.add("2:00")
        labels.add("3:00")
        labels.add("4:00")
        labels.add("5:00")
        labels.add("6:00")
        labels.add("7:00")
        labels.add("8:00")
        labels.add("9:00")
        labels.add("10:00")
        labels.add("11:00")
        labels.add("12:00")
        labels.add("13:00")
        labels.add("14:00")
        labels.add("15:00")
        labels.add("16:00")
        labels.add("17:00")
        labels.add("18:00")
        labels.add("19:00")
        labels.add("20:00")
        labels.add("21:00")
        labels.add("22:00")
        labels.add("23:00")
        val data = BarData(labels, barDataSet)
        barChart.data = data // set the data and list of lables into chart

        barChart.setDescription("Load chart")  // set the description

        //barDataSet.setColors(ColorTemplate.COLORFUL_COLORS)
        barDataSet.color = resources.getColor(R.color.colorAccent)

        barChart.animateY(5000)
    }
}