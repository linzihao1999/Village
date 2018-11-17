package com.linzihao.lx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton_1(View view) {
        Intent intent = new Intent(this, LeaveMessage.class);
        startActivity(intent);
    }

    public void onClickButton_2(View view) {
        Intent intent = new Intent(this, ShowMessage.class);
        startActivity(intent);
    }
}
