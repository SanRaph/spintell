package com.phyte.sanraphindustries.spintell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button_spin;
    ImageView imageView_wheel;
    TextView textview;

    Random random;

    int degree_old = 0;
    int degrees = 0;

    // 360 % 36 gives 9.7 degrees for each sector
    private static final float FACTOR = 4.86f;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_spin = findViewById(R.id.button_spin);
        imageView_wheel = findViewById(R.id.image_view_wheel);
        textview = findViewById(R.id.textview);

        random = new Random();

        button_spin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degree_old = degrees % 360;
                degrees = random.nextInt(3600) + 720;

                RotateAnimation rotate = new RotateAnimation(degree_old, degrees, RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(3600);
                rotate.setFillAfter(true);
                rotate.setInterpolator(new DecelerateInterpolator());
                rotate.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        textview.setText("");
                        textview.setTextSize(12);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        textview.setText(currentQuestion(360 - degrees % 360));


                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                imageView_wheel.startAnimation(rotate);


            }
        });





    }


    private String currentQuestion(int degrees){
        String text = "";


        if(degrees >= (FACTOR *1) && degrees < (FACTOR*3) ){
            text = getString(R.string.factor1);
        }else

        if(degrees >= (FACTOR *3) && degrees < (FACTOR*5) ){
            text = getString(R.string.factor3);
        }else

        if(degrees >= (FACTOR *5) && degrees < (FACTOR*7) ){
            text = getString(R.string.factor5);
        }else

        if(degrees >= (FACTOR *7) && degrees < (FACTOR*9) ){
            text = getString(R.string.factor7);
        }else

        if(degrees >= (FACTOR *9) && degrees < (FACTOR*11) )
        { text = getString(R.string.factor9);
        }else

        if(degrees >= (FACTOR *11) && degrees < (FACTOR*13) ){
            text = getString(R.string.factor11);
        }else


        if(degrees >= (FACTOR *13) && degrees < (FACTOR*15) ){
            text = getString(R.string.factor13);
        }else

        if(degrees >= (FACTOR *15) && degrees < (FACTOR*17) ){
            text = getString(R.string.factor15);
        }else

        if(degrees >= (FACTOR *17) && degrees < (FACTOR*19) ){
            text = getString(R.string.factor17);
        }else

        if(degrees >= (FACTOR *19) && degrees < (FACTOR*21) ){
            text = getString(R.string.factor19);
        }else

        if(degrees >= (FACTOR *21) && degrees < (FACTOR*23) ){
            text = getString(R.string.factor21);
        }else


        if(degrees >= (FACTOR *23) && degrees < (FACTOR*25) ){
            text = getString(R.string.factor23);
        }else


        if(degrees >= (FACTOR *25) && degrees < (FACTOR*27) ){
            text = getString(R.string.factor25);
        }else


        if(degrees >= (FACTOR *27) && degrees < (FACTOR*29) ){
            text = getString(R.string.factor27);
        }else

        if(degrees >= (FACTOR *29) && degrees < (FACTOR*31) ){
            text = getString(R.string.factor29);
        }else

        if(degrees >= (FACTOR *31) && degrees < (FACTOR*33) ){
            text = getString(R.string.factor31);

        }else

        if(degrees >= (FACTOR *33) && degrees < (FACTOR*35) ){
            text = getString(R.string.factor33);
        }else

        if(degrees >= (FACTOR *35) && degrees < (FACTOR*37) ){
            text = getString(R.string.factor35);
        }else

        if(degrees >= (FACTOR *37) && degrees < (FACTOR*39) ){
            text = getString(R.string.factor37);
        }else

        if(degrees >= (FACTOR *39) && degrees < (FACTOR*41) ){
            text = getString(R.string.factor39);

        }else

        if(degrees >= (FACTOR *41) && degrees < (FACTOR*43) ){
            text = getString(R.string.factor41);
        }else

        if(degrees >= (FACTOR *43) && degrees < (FACTOR*45) ){
            text = getString(R.string.factor43);
        }else

        if(degrees >= (FACTOR *45) && degrees < (FACTOR*47) ){
            text = getString(R.string.factor45);

        }else

        if(degrees >= (FACTOR *47) && degrees < (FACTOR*49) ){
            text = getString(R.string.factor47);
        }else

        if(degrees >= (FACTOR *49) && degrees < (FACTOR*51) ){
            text = getString(R.string.factor49);
        }else


        if(degrees >= (FACTOR *51) && degrees < (FACTOR*53) ){
            text = getString(R.string.factor51);
        }else


        if(degrees >= (FACTOR *53) && degrees < (FACTOR*55) ){
            text = getString(R.string.factor53);
        }else


        if(degrees >= (FACTOR *55) && degrees < (FACTOR*57) ){
            text = getString(R.string.factor55);
        }else

        if(degrees >= (FACTOR *57) && degrees < (FACTOR*59) ){
            text = getString(R.string.factor57);
        }else


        if(degrees >= (FACTOR *59) && degrees < (FACTOR*61) ){
            text = getString(R.string.factor59);
        }else

        if(degrees >= (FACTOR *61) && degrees < (FACTOR*63) ){
            text = getString(R.string.factor61);
        }else

        if(degrees >= (FACTOR *63) && degrees < (FACTOR*65) ){
            text = getString(R.string.factor63);
        }else

        if(degrees >= (FACTOR *65) && degrees < (FACTOR*67) ){
            text = getString(R.string.factor65);
        }else

        if(degrees >= (FACTOR *67) && degrees < (FACTOR*69) ){
            text = getString(R.string.factor67);
        }else

        if(degrees >= (FACTOR *69) && degrees < (FACTOR*71) ){
            text = getString(R.string.factor69);

        }else
        if((degrees >= (FACTOR *71) && degrees < 360 ) || (degrees>=0) && degrees < (FACTOR*1)){
            text = getString(R.string.factor71);
        }



        return text;
    }









}
