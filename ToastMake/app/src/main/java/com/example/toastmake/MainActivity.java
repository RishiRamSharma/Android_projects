package com.example.toastmake;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    TextView tv_1;
    EditText edt_uname,edt_pass;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_1=(TextView) findViewById(R.id.tv_1);
        edt_uname=(EditText) findViewById((R.id.edt_uname));
        edt_pass=(EditText) findViewById(R.id.edt_pass);
        btn_login=(Button) findViewById(R.id.btn_login);
        View edt_name = null;
        edt_name.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                tv_1.setText(" ");
                return false;
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                String uname= edt_uname.getText().toString();
                String pass= edt_pass.getText().toString();
                BreakIterator tv_text = null;
                if ((uname.equals("ris"))&&(pass.equals("123"))){
                    tv_text.setText("Valid User");
                    Toast.makeText(MainActivity.this,"Valid User", Toast.LENGTH_LONG).show();
                }
                else {
                    tv_text.setText("Invalid User");
                    Toast.makeText(MainActivity.this,"Invalid User",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}