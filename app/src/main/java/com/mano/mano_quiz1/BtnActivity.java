package com.mano.mano_quiz1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by JCMANO on 28/09/2017.
 */

public class BtnActivity extends AppCompatActivity{

    ImageView logo;
    TextView name, version, api, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_one);

        logo = (ImageView) findViewById(R.id.ivMarshmallow);
        name = (TextView) findViewById(R.id.tvMarshmallow);
        version = (TextView) findViewById(R.id.tvVersion);
        api = (TextView) findViewById(R.id.tvAPI);
        year = (TextView) findViewById(R.id.Date);

    }
    public void callHome(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
