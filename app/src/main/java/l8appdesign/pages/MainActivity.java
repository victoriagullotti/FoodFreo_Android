package l8appdesign.pages;

import android.app.Activity;


import android.content.Intent;
import android.content.pm.ActivityInfo;

import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;




public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT);

        Button btnHome = (Button) findViewById(R.id.btnHome);
        btnHome.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                //Toast.makeText(MainActivity.this, "Home Selected",Toast.LENGTH_SHORT).show();
                return false;

            }


        });

        Button btnGallery = (Button) findViewById(R.id.btnGallery);                                     //btn gallery
        btnGallery.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                //Toast.makeText(MainActivity.this, "Gallery",Toast.LENGTH_SHORT).show();
                return false;
            }


        });


        Button btnEmail = (Button) findViewById(R.id.btnEmail);
        btnEmail.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                //Toast.makeText(MainActivity.this, "Email Us Please",Toast.LENGTH_SHORT).show();
                return false;
            }

        });

        Button btnCall = (Button) findViewById(R.id.btnCall);
        findViewById(R.id.btnCall).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String phno = "0893352422";

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:0893352422"));
                startActivity(callIntent);

            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

    }




    public void homePage(View view) {
        //Intent intent = new Intent(MainActivity.this, HomePage.class);
        //startActivity(intent);
        startActivity(new Intent(MainActivity.this, HomePage.class));
    }



    public void tyresActivity(View view) {
        startActivity(new Intent(MainActivity.this, GalleryActivity.class));
    }

    public void serviceActivity(View view)
    {
        startActivity(new Intent(MainActivity.this, Chips.class));
    }
    public void wheelActivity(View view) {
        startActivity(new Intent(MainActivity.this, Smoothies.class));
    }

    public void emailActivity(View view) {
        startActivity(new Intent(MainActivity.this, EmailActivity.class));
    }
    public void mapActivity(View view) {
        startActivity(new Intent(MainActivity.this, Juices.class));
    }

    /**
     * Called when the activity is first created.
     */



}