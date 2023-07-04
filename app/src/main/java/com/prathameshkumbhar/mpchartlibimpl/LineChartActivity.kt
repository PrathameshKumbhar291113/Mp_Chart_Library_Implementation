package com.prathameshkumbhar.mpchartlibimpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.prathameshkumbhar.mpchartlibimpl.databinding.ActivityLineChartBinding

class LineChartActivity : AppCompatActivity() {
    lateinit var binding : ActivityLineChartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityLineChartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var entries: ArrayList<Entry> = ArrayList()

        entries.add(Entry(1f,2f))
        entries.add(Entry(2f,4f))
        entries.add(Entry(3f,6f))
        entries.add(Entry(4f,8f))
        entries.add(Entry(5f,10f))
        entries.add(Entry(6f,12f))
        entries.add(Entry(7f,14f))
        entries.add(Entry(8f,16f))
        entries.add(Entry(9f,18f))
        entries.add(Entry(10f,20f))
        entries.add(Entry(11f,1f))
        entries.add(Entry(12f,2f))
        entries.add(Entry(13f,3f))
        entries.add(Entry(14f,4f))
        entries.add(Entry(15f,5f))
        entries.add(Entry(16f,6f))
        entries.add(Entry(17f,7f))

        var lineDataSet = LineDataSet(entries,"Line Data Set")
        var lineData = LineData(lineDataSet)

        with(binding.lineChartLayout){
            data = lineData
            animateXY(2000,2000)
            description.text =  "Line Chart"
            xAxis.setDrawGridLines(false)
            axisLeft.setDrawGridLines(false)
            axisRight.setDrawGridLines(false)
        }

        with(lineDataSet){
            axisDependency = YAxis.AxisDependency.LEFT
        }



    }
}