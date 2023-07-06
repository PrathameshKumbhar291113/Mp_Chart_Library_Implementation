package com.prathameshkumbhar.mpchartlibimpl

import android.content.Intent
import android.os.Bundle
import android.security.identity.CredentialDataResult.Entries
import androidx.appcompat.app.AppCompatActivity
import com.prathameshkumbhar.mpchartlibimpl.databinding.ActivityMainBinding
import splitties.activities.start


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.barChart.setOnClickListener {
            start<BarChartActivity>()
        }

        binding.lineChart.setOnClickListener {
            start<LineChartActivity>()
        }

        binding.donoutChart.setOnClickListener {
            start<DonoutChartActivity>()
        }

        binding.pieChart.setOnClickListener {
            start<PieChartActivity>()
        }

    }
}