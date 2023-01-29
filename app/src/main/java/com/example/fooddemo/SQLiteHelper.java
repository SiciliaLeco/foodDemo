package com.example.fooddemo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {
    public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public void queryData(String sql){
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(sql);
    }

    // todo: finish these database operation functions
    public void insertData(String name, String price, byte[] image){}
    public void updateData(String name, String price, byte[] image, int id){}
    public void deleteData(int id){}
    public Cursor getData(String sql){SQLiteDatabase database = getReadableDatabase();
        return database.rawQuery(sql, null);}

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //todo: override required function
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //todo: override required function
    }
}
