package com.educards.nuts.demo

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.inflate
import com.educards.nuts.demo.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private val model: MainActivityModel by viewModels()

    private val binding: ActivityMainBinding by lazy {
        inflate(layoutInflater, R.layout.activity_main, null, false) as ActivityMainBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun fetchSampleData(view: View) {
        model.fetchSampleData()
    }

}
