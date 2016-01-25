package com.brittolab.icare.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DoctorInfoCURD {

    private DBHandler handler;
    private SQLiteDatabase database;
    private DoctorInfoTable doctorInfoTable;

    public DoctorInfoCURD(Context context) {
       handler=new DBHandler(context);
    }
    public void open(){
        database=handler.getWritableDatabase();
    }
    public void close(){
        handler.close();
    }

   /* public boolean insertDoctorInfo(DoctorInfoTable doctorInfoTable){
        this.open();

        ContentValues values = new ContentValues();
       values.put(DBHandler.COL_DR_NAME,doctorInfoTable.getDrName());
        values.put(DBHandler.);
        return result;
    }*/

}
