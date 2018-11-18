package com.linzihao.lx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LeaveMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_message);
        TextView textView = (TextView) findViewById(R.id.textView5);
        textView.setVisibility(View.INVISIBLE);
    }

    public void onClick(View view) {
        EditText editText = (EditText) findViewById(R.id.editText4);
        String message = editText.getText().toString();
        TextView textView = (TextView) findViewById(R.id.textView4);
        TextView textView1 = (TextView) findViewById(R.id.textView5);
        textView.setText(message);
        textView1.setVisibility(View.VISIBLE);
    }
}
