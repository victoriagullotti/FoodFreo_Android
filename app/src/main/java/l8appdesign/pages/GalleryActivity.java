package l8appdesign.pages;

import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;




public class GalleryActivity extends Activity{
    public void mainActive(View view)
    {
        //Intent intent = new Intent(MainActivity.this, HomePage.class);
        //startActivity(intent);
        //startActivity(new Intent("android.l8appdesign.MainActivity"));
        this.finish();
    }
    public void dunActivity(View view)
    {
        startActivity(new Intent(GalleryActivity.this, BeefBurgers.class));
    }
    public void bridgestoneActivity(View view)
    {
        startActivity(new Intent(GalleryActivity.this,ChickenBurgers.class));
    }
    public void goodyearActivity(View view)
    {
        startActivity(new Intent(GalleryActivity.this,VeggieBurger.class));


    }
    public void pirelliActivity(View view)
    {
        startActivity(new Intent(GalleryActivity.this,LambBurgers.class));


    }
    public void triangleActivity(View view)
    {
        startActivity(new Intent(GalleryActivity.this,Kebabs.class));


    }
    public void kumhoActivity(View view)
    {
        startActivity(new Intent(GalleryActivity.this,Gozleme.class));


    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);



        Button btnHome = (Button)findViewById(R.id.btnHome);
        btnHome.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                //Toast.makeText(GalleryActivity.this, "Return to main", Toast.LENGTH_SHORT).show();
                return false;

            }


        });
        Button btnDun = (Button)findViewById(R.id.btnDun);
        btnDun.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                //Toast.makeText(GalleryActivity.this, "Dunlop",Toast.LENGTH_SHORT).show();
                return false;
            }


        });
        Button btnBridgestone = (Button)findViewById(R.id.btnBridgestone);
        btnBridgestone.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                //Toast.makeText(GalleryActivity.this, "Bridgestone",Toast.LENGTH_SHORT).show();
                return false;
            }


        });

        Button btnGoodyear = (Button)findViewById(R.id.btnGoodyear);
        btnGoodyear.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                //Toast.makeText(GalleryActivity.this, "Goodyear",Toast.LENGTH_SHORT).show();
                return false;
            }


        });
        Button btnPirelli = (Button)findViewById(R.id.btnPirelli);
        btnPirelli.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                //Toast.makeText(GalleryActivity.this, "Pirelli",Toast.LENGTH_SHORT).show();
                return false;
            }


        });
        Button btnTriangle = (Button)findViewById(R.id.btnTriangle);
        btnTriangle.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                //Toast.makeText(GalleryActivity.this, "Traiangle",Toast.LENGTH_SHORT).show();
                return false;
            }


        });
        Button btnKumho = (Button)findViewById(R.id.btnKumho);
        btnKumho.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                //Toast.makeText(GalleryActivity.this, "Kumho",Toast.LENGTH_SHORT).show();
                return false;
            }


        });
        findViewById(R.id.btnCall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phno = "0477971946";

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:0893352422"));
                startActivity(callIntent);

            }
        });
    }

}
