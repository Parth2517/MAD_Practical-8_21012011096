package com.example.p8_mad_33

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.isVisible
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var alarm_set:FloatingActionButton=findViewById(R.id.Alarm_set)
        alarm_set.setOnClickListener(){
            var btn:Button=findViewById(R.id.btn)
            
        }
    }
}