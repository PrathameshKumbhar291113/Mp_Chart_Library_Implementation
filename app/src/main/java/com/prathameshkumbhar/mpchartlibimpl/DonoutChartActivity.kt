package com.prathameshkumbhar.mpchartlibimpl

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate
import com.prathameshkumbhar.mpchartlibimpl.databinding.ActivityDonoutChartBinding

class DonoutChartActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDonoutChartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonoutChartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list: ArrayList<PieEntry> = ArrayList()

        list.add(PieEntry(100f,""))
        list.add(PieEntry(101f,""))
        list.add(PieEntry(102f,""))

        val pieDataSet = PieDataSet(list,"list")

        pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS,255)

        pieDataSet.valueTextSize = 13f

        pieDataSet.valueTextColor = Color.WHITE

        val pieData = PieData(pieDataSet)

        binding.pieChart.data = pieData

        binding.pieChart.centerText = "list"

        binding.pieChart.description.text = "Pie Chart"

        binding.pieChart.animateY(1000)


    }
}