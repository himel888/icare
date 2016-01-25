package com.brittolab.icare.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.brittolab.icare.R;

public class DashBoard extends AppCompatActivity {


    TextView tvProfileName;
    int userId;
    String userName;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        tvProfileName = (TextView) findViewById(R.id.tvUserName);
        intent = getIntent();
        userId = intent.getIntExtra("user_id", 0);
        userName = intent.getStringExtra("user_name");
        tvProfileName.setText(userName);
        Log.d("UserId",String.valueOf(userId));
    }

    public void btnDietChartClick(View v){
        Intent intent = new Intent(getApplicationContext(), DietChart.class);
        startActivity(intent);

    }
}
