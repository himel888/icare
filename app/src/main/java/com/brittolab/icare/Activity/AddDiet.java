package com.brittolab.icare.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.brittolab.icare.R;

public class AddDiet extends AppCompatActivity {

    ArrayAdapter dietTypeAdapter;
    Spinner spnDietType;
    String[] dietTypeList;

    TextView txtDate;
    TextView txtTime;
    EditText etxtMenu;
    CheckBox chkDailyAlarm;
    CheckBox chkReminder;

    String dietType,menu, date, time;
    Boolean isAlarmDaily = false;
    Boolean isremind = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_diet);

        initialize();

        dietTypeList = getResources().getStringArray(R.array.diet_type);
        dietTypeAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,dietTypeList);
        spnDietType.setAdapter(dietTypeAdapter);
    }

    public void initialize(){
        txtDate = (TextView) findViewById(R.id.txtDate);
        txtTime = (TextView) findViewById(R.id.txtTime);
        etxtMenu = (EditText) findViewById(R.id.etxtMenu);
        chkDailyAlarm = (CheckBox) findViewById(R.id.chkDailyAlarm);
        chkReminder = (CheckBox) findViewById(R.id.chkReminder);
        spnDietType = (Spinner) findViewById(R.id.spnDietTypeList);
    }



    public void btnSaveOnClick(View v){

    }
}
