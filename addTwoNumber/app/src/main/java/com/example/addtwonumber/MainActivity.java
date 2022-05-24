package com.example.addtwonumber;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android .view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText edt_1,edt_2;
    TextView tv_2;
    Button btn_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_1=(EditText)findViewById(R.id.edt_1);
        edt_2=(EditText) findViewById(R.id.edt_2);
        tv_2=(TextView) findViewById(R.id.tv_2);
        btn_1=(Button) findViewById(R.id.btn_1);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View arg0) {
                int i,j;
                i=Integer.parseInt(edt_1.getText().toString());
                j=Integer.parseInt(edt_2.getText().toString());
                tv_2.setText(""+(i+j));
            }
        });
    }
}