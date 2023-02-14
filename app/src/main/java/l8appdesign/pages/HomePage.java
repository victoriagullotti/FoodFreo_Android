package l8appdesign.pages;


import android.app.Activity;
import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;

import android.view.View;

public class HomePage extends Activity {

    public void mainActive(View view)
    {
        //Intent intent = new Intent(MainActivity.this, HomePage.class);
        //startActivity(intent);
        //startActivity(new Intent("android.l8appdesign.MainActivity"));
        this.finish();
    }
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        findViewById(R.id.btnCall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phno = "0893352422";

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:0893352422"));
                startActivity(callIntent);

            }
        });
    }




}
