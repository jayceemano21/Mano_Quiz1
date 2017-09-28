package com.mano.mano_quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BtnActivity3 extends AppCompatActivity {

    Button btn1, btn2, btn3, btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn3);

        btn1 = (Button) findViewById(R.id.btOne);
        btn2 = (Button) findViewById(R.id.btTwo);
        btn3 = (Button) findViewById(R.id.btThree);
        btnHome = (Button) findViewById(R.id.btHome);
    }

    public void callHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void callOne(View view) {
        Intent intent = new Intent(this, BtnActivity1.class);
        startActivity(intent);

    }

    public void callTwo(View view) {
        Intent intent = new Intent(this, BtnActivity2.class);
        startActivity(intent);

    }

    public void callThree(View view) {
        Intent intent = new Intent(this, BtnActivity3.class);
        startActivity(intent);
    }
}
