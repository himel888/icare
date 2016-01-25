package com.brittolab.icare.Database;

        import android.content.ContentValues;
        import android.content.Context;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;

        import java.util.ArrayList;
        import java.util.List;


public class DietInfoCRUD  {
    private DBHandler handler;

    private SQLiteDatabase database;
    private DietInfoTable dietInfoTable;

    public DietInfoCRUD(Context context) {

        handler = new DBHandler(context);
    }
    
    private void open(){
    database=handler.getWritableDatabase();
    }
    
    private void close(){
        handler.close();
    }
    
    public boolean insert(DietInfoTable dietInfoTable){

        this.open();

        ContentValues values = new ContentValues();
        values.put(DBHandler.COL_DIET_ID,dietInfoTable.getDietId());
        values.put(DBHandler.COL_DIET_TYPE, dietInfoTable.getDietType());
        values.put(DBHandler.COL_FOOD_MENU, dietInfoTable.getFoodMenu());
        values.put(DBHandler.COL_ALERM_DATE, dietInfoTable.getAlermDate());
        values.put(DBHandler.COL_ALERM_TIME, dietInfoTable.getAlermTime());
        values.put(DBHandler.COL_DI_REF_USER_ID,dietInfoTable.getRefUserId());

        long inserted=database.insert(DBHandler.TABLE_DIET_INFO,null,values);
        this.close();
        if(inserted>0){
            return true;
        }else{
            return false;
        }
    }
    public boolean update(int dietId,DietInfoTable dietInfoTable){
        this.open();
        ContentValues values=new ContentValues();
        values.put(DBHandler.COL_DIET_TYPE,dietInfoTable.getDietType());
        values.put(DBHandler.COL_FOOD_MENU,dietInfoTable.getFoodMenu());
        values.put(DBHandler.COL_ALERM_DATE,dietInfoTable.getAlermDate());
        values.put(DBHandler.COL_ALERM_TIME,dietInfoTable.getAlermTime());
        int updated=database.update(DBHandler.TABLE_DIET_INFO, values, DBHandler.COL_DIET_ID + " = " + dietId, null);
        database.close();
        if (updated > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean delete(int dietId){
        this.open();
        int deleted=database.delete(DBHandler.TABLE_DIET_INFO, DBHandler.COL_DIET_ID + " = " + dietId, null);
        database.close();
        if(deleted>0){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<DietInfoTable> getAllDietInfo(){

        ArrayList<DietInfoTable> dietList=new ArrayList<>();

        Cursor cursor=database.query(DBHandler.TABLE_DIET_INFO, null, null, null, null, null, null);
        if(cursor!=null && cursor.getCount()>0){
           cursor.moveToFirst();
            for(int i=0;i<cursor.getCount();i++){
                int dietId=cursor.getInt(cursor.getColumnIndex(DBHandler.COL_DIET_ID));
                String dietType=cursor.getString(cursor.getColumnIndex(DBHandler.COL_DIET_TYPE));
                String foodMenu=cursor.getString(cursor.getColumnIndex(DBHandler.COL_FOOD_MENU));
                String alarmDate=cursor.getString(cursor.getColumnIndex(DBHandler.COL_ALERM_DATE));
                String alarmTime=cursor.getString(cursor.getColumnIndex(DBHandler.COL_ALERM_TIME));
                dietInfoTable=new DietInfoTable(dietId,dietType,foodMenu,alarmDate,alarmTime);
                dietList.add(dietInfoTable);
                cursor.moveToNext();

            }
        }
        database.close();

        return dietList;

    }
    public DietInfoTable oneDietInfo(int dietId){
        this.open();

        Cursor cursor=database.query(DBHandler.TABLE_DIET_INFO,new String []{DBHandler.COL_DIET_ID,DBHandler.COL_DIET_TYPE,DBHandler.COL_FOOD_MENU},DBHandler.COL_DIET_ID+"= "+dietId,null,null,null,null);
        cursor.moveToFirst();

        int mId=cursor.getInt(cursor.getColumnIndex(DBHandler.COL_DIET_ID));
        String dietType=cursor.getString(cursor.getColumnIndex(DBHandler.COL_DIET_TYPE));
        String foodMenu=cursor.getString(cursor.getColumnIndex(DBHandler.COL_FOOD_MENU));
        String alarmDate=cursor.getString(cursor.getColumnIndex(DBHandler.COL_ALERM_DATE));
        String alarmTime=cursor.getString(cursor.getColumnIndex(DBHandler.COL_ALERM_TIME));

        dietInfoTable=new DietInfoTable(mId,dietType,foodMenu,alarmDate,alarmTime) ;
        database.close();
        return dietInfoTable;
    }



}
