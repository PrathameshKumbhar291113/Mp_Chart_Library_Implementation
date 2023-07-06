package com.prathameshkumbhar.mpchartlibimpl

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.prathameshkumbhar.mpchartlibimpl.databinding.ActivityBarChartBinding

class BarChartActivity : AppCompatActivity() {
    lateinit var binding: ActivityBarChartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBarChartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var entries : ArrayList<BarEntry> = ArrayList()

        entries.add(BarEntry(1f,2f))
        entries.add(BarEntry(2f,4f))
        entries.add(BarEntry(3f,6f))
        entries.add(BarEntry(4f,8f))
        entries.add(BarEntry(5f,10f))
        entries.add(BarEntry(6f,12f))
        entries.add(BarEntry(7f,14f))
        entries.add(BarEntry(8f,16f))
        entries.add(BarEntry(9f,18f))
        entries.add(BarEntry(10f,20f))
        entries.add(BarEntry(11f,22f))
        entries.add(BarEntry(12f,24f))
        entries.add(BarEntry(13f,26f))

        var  barDataSet= BarDataSet(entries,null)
        var barData = BarData(barDataSet)

        barDataSet.color = Color.MAGENTA

        with(binding.barChartLayout){
            data = barData
            setFitBars(false)
            animateXY(3000,3000)
            xAxis.setDrawGridLines(false)
            axisLeft.setDrawGridLines(false)
            axisRight.setDrawGridLines(false)
            description.text = "Bar Chart"
        }


    }
}