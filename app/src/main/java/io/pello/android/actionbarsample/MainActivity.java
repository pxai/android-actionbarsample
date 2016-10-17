package io.pello.android.actionbarsample;

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

    public void openActivity1 (View view) {
        Intent activity1Intent = new Intent(MainActivity.this, Activity1.class);
        startActivity(activity1Intent);
    }

    public void openActivity2 (View view) {
        Intent activity2Intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(activity2Intent);
    }

    public void openActivity3 (View view) {
        Intent activity3Intent = new Intent(MainActivity.this, Activity3.class);
        startActivity(activity3Intent);
    }
}
