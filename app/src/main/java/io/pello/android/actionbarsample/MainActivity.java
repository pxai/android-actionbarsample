package io.pello.android.actionbarsample;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
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


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_star:
                Log.d("PELLODEBUG","Star selected");
                return true;
            case R.id.action_settings:
                Log.d("PELLODEBUG","Settings selected");
                return true;
          /*  case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;*/
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
