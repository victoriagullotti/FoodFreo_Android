package l8appdesign.pages;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;


public class Juices extends Activity implements ViewSwitcher.ViewFactory {
    private static Typeface aileronFont;
    TextView studentName;
    TextView studentBio;
    TextView studentInstagram;
    TextView studentEmail;
    TextView studentLabel;

    public void mainActive(View view)
    {
        //Intent intent = new Intent(MainActivity.this, HomePage.class);
        //startActivity(intent);
        //startActivity(new Intent("android.l8appdesign.MainActivity"));
        this.finish();
    }

    Integer imageIDs[] =
            {
                    R.drawable.apple_fresh,
                    R.drawable.carrot_fresh,
                    R.drawable.orrange_fresh,
                    R.drawable.applecarrot_juice,
                    R.drawable.apple_orange,
                    R.drawable.carrot_orange,
                    R.drawable.watermelon





            };
    private ImageSwitcher imageSwitcher;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juices);
        findViewById(R.id.btnCall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phno = "0893352422";

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:0893352422"));
                startActivity(callIntent);

            }
        });

        studentName = (TextView) findViewById(R.id.studentName);
        studentBio = (TextView) findViewById(R.id.studentBio);
        studentInstagram = (TextView) findViewById(R.id.studentInstagram);
        studentEmail = (TextView) findViewById(R.id.studentEmail);
        studentLabel = (TextView) findViewById(R.id.studentLabel);

        imageSwitcher = (ImageSwitcher) findViewById(R.id.switcher1);
        imageSwitcher.setFactory(this);
        imageSwitcher.setAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        imageSwitcher.setAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));

        String name;
        String bio=null;
        String instagram;
        String email;
        String label;

        imageSwitcher.setImageResource(imageIDs[0]);
        name="Apple";
        label = "Apple";
        bio = "“Apple” \n" +
                "\n" ;
        email = "$8";
        instagram = "";
        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);

        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        gallery.setAdapter(new Juices.ImageAdapter(this));
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                imageSwitcher.setImageResource(imageIDs[position]);

                int variable = position;
                String name;
                String bio;
                String instagram;
                String email;
                String label;

                switch(variable){  // assign the variable below
                    case 0:
                        name="Apple";
                        label = "Apple";
                        bio = "“Apple” \n" +
                                "\n" ;
                        email = "$8";
                        instagram = "";
                        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);
                        break;
                    case 1:
                        name = "Carrot";
                        label = "Carrot";
                        bio = "“Carrot” \n" +
                                "\n" ;
                        instagram = "";
                        email = "8.00";
                        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);
                        break;
                    case 3:
                        name = "Orange";
                        label = "Orange";
                        bio = "“Orange”” \n" +
                                "\n" ;
                        instagram = "";
                        email = "$8.00" +
                                "";
                        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);
                        break;

                    case 2:
                        name = "Apple, Carrot, Celery";
                        label = "Apple, Carrot, Celery";
                        bio = "“Apple, Carrot, Celery ...” \n" +
                                "\n" ;
                        instagram = "";
                        email = "$8.00";
                        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);
                        break;
                    case 4:
                        name = "Apple & Orange";
                        label = "Apple & Orange";
                        bio = "“Apple & Orange” \n" +
                                "\n" ;
                        instagram = "";
                        email = "$8.00";
                        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);
                        break;
                    case 5:
                        name = "Carrot & Orange";
                        label = "Carrot & Orange";
                        bio = "“Carrot & Orange” \n" +
                                "\n" ;
                        instagram = "";
                        email = "$8.00";
                        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);
                        break;

                    case 6:
                        name = "Watermelon";
                        label = "Watermelone";
                        bio = "“Watermelon” \n" +
                                "\n" ;
                        instagram = "";
                        email = "$8.00";
                        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);
                        break;

                }


            }
        });
    }

    public View makeView()
    {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundColor(0x339900);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new ImageSwitcher.LayoutParams(Gallery.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return imageView;
    }


    public class ImageAdapter extends BaseAdapter
    {
        private Context context;
        private int itemBackground;

        public ImageAdapter(Context c)
        {
            context =c;

            TypedArray a = obtainStyledAttributes(R.styleable.Gallery1);
            itemBackground = a.getResourceId(R.styleable.Gallery1_android_galleryItemBackground,0);
            a.recycle();
        }


        public int getCount() {
            return imageIDs.length;
        }


        public Object getItem(int position) {
            return position;
        }


        public long getItemId(int position){
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent)
        {
            /*ImageView imageView;
            if(convertView == null) {
                imageView = new ImageView(context);
                imageView.setLayoutParams( new GridView.LayoutParams(150, 120));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(5, 5, 5, 5);
            }
            else {
                imageView = (ImageView) convertView;

            }*/
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(imageIDs[position]);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setLayoutParams(new Gallery.LayoutParams(250, 300));
            imageView.setBackgroundResource(itemBackground);

            return imageView;


        }
    }
}




