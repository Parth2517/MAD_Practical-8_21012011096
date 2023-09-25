package com.example.p8_mad_33

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.isVisible
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var alarm_set:MaterialButton=findViewById(R.id.Alarm_set)
        var m2:MaterialCardView=findViewById(R.id.set_alarm2);
        alarm_set.setOnClickListener(){
                m2.visibility= View.VISIBLE
            var alarm_set2:MaterialButton=findViewById(R.id.Alarm_set2);
        }
        var alarm_set2:MaterialButton=findViewById(R.id.Alarm_set2)
        alarm_set2.setOnClickListener(){
            m2.visibility=View.INVISIBLE
        }

    }
    fun set_alarm(militime:Long,action:String){
        val intent_alarm=Intent(applicationContext,AlarmBrodcastReceiver::class.java)
        intent_alarm.putExtra(AlarmBrodcastReceiver.ALARMKEY,action)
        val pendingintent=PendingIntent.getBroadcast(applicationContext,2345,intent_alarm,PendingIntent.FLAG_UPDATE_CURRENT)
        val manager=getSystemService(ALARM_SERVICE) as AlarmManager
        if(action==AlarmBrodcastReceiver.ALARM_START){
            manager.setExact(AlarmManager.RTC_WAKEUP,militime,pendingintent)
        }
    }
}