package com.example.kotlinsqlite

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.lang.Exception

class SQLiteHelper(context:Context):SQLiteOpenHelper(context, DATABASE_NAME,null, DATABASE_VERSION){
    companion object{
        private const val DATABASE_VERSION=1
        private const val DATABASE_NAME="info.db"

    }
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE TBL_TEACHER (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT,LASTNAME TEXT,CODE TEXT,DNI TEXT,PHONE TEXT,EMAIL TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
    }
    fun insertsTeacher(name:String,lastname:String,code:String,dni:String,phone:String,email:String){
        val db:SQLiteDatabase=writableDatabase
        val values:ContentValues= ContentValues()
        values.put("NAME",name)
        values.put("LASTNAME",lastname)
        values.put("CODE",code)
        values.put("DNI",dni)
        values.put("PHONE",phone)
        values.put("EMAIL",email)
        db.insert("TBL_TEACHER",null,values)
        db.close()
    }
}