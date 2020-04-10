package com.cmeter.qarantinno

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity

class PrefManager {

    lateinit var context: Context

    lateinit var pref: SharedPreferences

    constructor(context: Context) {
        this.context = context
        getSharedPreferences()
    }

    private fun getSharedPreferences() {
        pref = context.getSharedPreferences(
            context.getString(R.string.preference_name),
            Context.MODE_PRIVATE
        )
    }

    fun writeSharedPrefrences() {
       var editor : SharedPreferences.Editor = pref.edit()
        editor.putString(context.getString(R.string.preference_key), "NEXT")
        editor.commit()
    }

    fun checkPreference() : Boolean{
        var status = false
        if(pref.getString(context.getString(R.string.preference_key), "null").equals("null")){
            status = false
        }
        else {
            status = true
        }
        return status
    }

    fun clearPreference(){
        pref.edit().clear().commit()
        context.startActivity(Intent(context, MainActivity::class.java))
        (context as AppCompatActivity).finish()
    }

}