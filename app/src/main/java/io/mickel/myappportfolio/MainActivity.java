package io.mickel.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button buttonMovie = (Button) findViewById(R.id.button_movie_app);
        buttonMovie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This button will launch my popular movies app!",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button buttonScores = (Button) findViewById(R.id.button_scores_app);
        buttonScores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This button will launch my scores app!",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button buttonLibrary = (Button) findViewById(R.id.button_library_app);
        buttonLibrary.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This button will launch my library app!",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        Button buttonBigger = (Button) findViewById(R.id.button_bigger_app);
        buttonBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This button will launch my build it bigger app!",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        Button buttonXYZ = (Button) findViewById(R.id.button_xyz_app);
        buttonXYZ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This button will launch my XYZ Reader app!",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button buttonCapstone = (Button) findViewById(R.id.button_capstone_app);
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This button will launch my capstone app!",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
