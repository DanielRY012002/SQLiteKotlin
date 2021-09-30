package com.example.kotlinsqlite

import java.util.*

data class TeacherModel(
    var id:Int=getAutoId(),
    var name: String="",
    var lastname:String="",
    var code:String="",
    var dni:String="",
    var phone:String="",
    var email:String="",
){
    companion object{
        fun getAutoId():Int{
            val random= Random()
            return random.nextInt(100)
        }
    }
}