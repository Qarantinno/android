package com.cmeter.qarantinno

class MonthData {
    lateinit var month:String
    var values:Int = 0

    constructor(month: String, values: Int) {
        this.month = month
        this.values = values
    }


}