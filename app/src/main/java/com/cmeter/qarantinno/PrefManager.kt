package com.cmeter.qarantinno

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity

class PrefManager {

    lateinit var cont: Context

    lateinit var pref: SharedPreferences

    constructor(context: Context) {
        this.cont = context
        getSharedPreferences()
    }

    private fun getSharedPreferences() {
        pref = cont.getSharedPreferences(
            cont.getString(R.string.preference_name),
            Context.MODE_PRIVATE
        )
    }

    fun writeSharedPrefrences() {
       var editor : SharedPreferences.Editor = pref.edit()
        editor.putString(cont.getString(R.string.preference_key), "NEXT")
        editor.commit()
    }

    fun checkPreference() : Boolean{
        var status = false
        if(pref.getString(cont.getString(R.string.preference_key), "null").equals("null")){
            status = false
        }
        else {
            status = true
        }
        return status
    }

    fun clearPreference(){
        pref.edit().clear().commit()
        cont.startActivity(Intent(cont, MainActivity::class.java))
        (cont as AppCompatActivity).finish()
    }

}