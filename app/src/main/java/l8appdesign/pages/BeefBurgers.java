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
import android.widget.Gallery.LayoutParams;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;






public class BeefBurgers extends Activity implements ViewSwitcher.ViewFactory {

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
                    R.drawable.classicbeef,
                    R.drawable.beefcheese,
                    R.drawable.camembert,
                    R.drawable.elpaso,
                    R.drawable.beef_hawaiian_sunset,
                    R.drawable.beef_meat_lovers,
                    R.drawable.burgerdeluxe





            };
    private ImageSwitcher imageSwitcher;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beefburgers);
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
        name="Classic Beef";
        label = "Classic Beef";
        bio = "“Char grilled ground prime beef, fresh tomato, kettuce, onions, tomato sauce and japanese mayo” \n" +
                "\n" ;
        email = "$13";
        instagram = "";
        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);

        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        gallery.setAdapter(new ImageAdapter(this));
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
                        name = "Classic Beef";
                        label = "Classic Beef";
                        bio = "“Char grilled ground prime beef, fresh tomato, lettuce, onions, tomato sauce and japanese mayo” \n" +
                                "\n" ;
                        email = "13";
                        instagram = "";
                        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);
                        break;
                    case 1:
                        name = "Beef Cheese";
                        label = "Beef Cheese";
                        bio = "“Char grilled ground prime beef, tasty cheese, fresh tomato, lettuce, onion, tomato sauce and Japanese mayo” \n" +
                                "\n" ;
                        instagram = "";
                        email = "13.00";
                        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);
                        break;
                    case 3:
                        name = "Camembert";
                        label = "Camembert";
                        bio = "“Char grilled ground prime beef, camembert cheese, fresh tomato, lettuce, onions, tomato sauce and Japanese mayo”” \n" +
                                "\n" ;
                        instagram = "";
                        email = "15.00" +
                                "";
                        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);
                        break;
                    case 2:
                        name = "Elpaso";
                        label = "Elpaso";
                        bio = "“Char grilled ground prime beef, tasty cheese, fresh tomato, lettuce, onions, tomato sauce and Japanese mayo and sour cream...” \n" +
                                "\n" ;
                        instagram = "";
                        email = "15.00";
                        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);
                        break;
                    case 4:
                        name = "Beef Hawaiian Sunset";
                        label = "Beef Hawaiian Sunset";
                        bio = "“Char grilled ground prime beef, tasty cheese, golden pineapple, fresh tomato, lettuce, onions, tomato sauce and Japanese mayo ...” \n" +
                                "\n" ;
                        instagram = "";
                        email = "$14.00";
                        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);
                        break;
                    case 5:
                        name = "Beef Meat Lovers";
                        label = "Beef Meat Lovers";
                        bio = "“Char grilled ground prime beef, bacon, tasty cheese, fresh tomato, lettuce, onions, tomato sauce and Japanese mayo ....” \n" +
                                "\n" ;
                        instagram = "";
                        email = "$14.00";
                        studentName.setText(name); studentBio.setText(bio); studentInstagram.setText(instagram); studentEmail.setText(email); studentLabel.setText(label);
                        break;
                    case 6:
                        name = "Romma Beef Deluxe";
                        label = "Romma Beef Deluxe";
                        bio = "“Char grilled ground prime beef, bacon, tasty cheese, egg, beetroot, fresh tomato, lettuce, tomato sauce and Japanese mayo ....” \n" +
                                "\n" ;
                        instagram = "";
                        email = "$17.00";
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
        imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
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



