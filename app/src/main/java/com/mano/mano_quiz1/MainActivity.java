package com.mano.mano_quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn_Home, btn_One;

    String[] name;
    String[] version;
    String[] api;
    String[] year;
    int[] logos;

    CustomAdapter adapter;
    List<AndroidOS> listAndroid;
    ListView lv_Androids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_Androids = (ListView) findViewById(R.id.lvAndroids);
        listAndroid = new ArrayList<AndroidOS>();
        name = getResources().getStringArray(R.array.Name);

        logos = new int[] {R.drawable.androidmarshmallow, R.drawable.androidnougat, R.drawable.androidkitkat};

        for (int i=0; i < name.length; i++){
            listAndroid.add(new AndroidOS(logos[i], name[i]));
        }

        adapter = new CustomAdapter(this, listAndroid);
        lv_Androids .setAdapter(adapter);


        lv_Androids.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "You clicked " + name[i];
                Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();
            }
        });
    }
    public void callHome(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
