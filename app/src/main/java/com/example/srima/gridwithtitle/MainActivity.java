package com.example.srima.gridwithtitle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView showgrid;
   String[] imgid={"cupcake","donut","eclair","gingerbred","honeycomb","icecream","jellybean","lollypop"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showgrid=(GridView)findViewById(R.id.grid);
        showgrid.setAdapter(new ImageAdapter(this,imgid));
    }
}
