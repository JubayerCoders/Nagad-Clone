package com.coders.mynagad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout balance_check;
    RelativeLayout mainlayout;
    TextView tap_balance;

    String default_text = "Tap for Balance";
    String temporaryText = "50,000";
    boolean showingTemporaryText = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        balance_check = findViewById(R.id.balance_check);
        tap_balance = findViewById(R.id.tap_balance);
        mainlayout = findViewById(R.id.mainlayout);



        balance_check.setOnClickListener(view -> {

            if (!showingTemporaryText) {
                showingTemporaryText = true;
                tap_balance.setText(temporaryText);

                new Handler().postDelayed(new Runnable() {
                    @Override
                        public void run() {

                        tap_balance.setText(default_text);
                        showingTemporaryText = false;

                        }
                    }, 4000); // 3000 milliseconds (3 seconds) delay
            }



        });













        //-----------Auto Image Slider Code------------//
        ArrayList<SlideModel> imageList = new ArrayList<>(); // Create image list
        // imageList.add(new SlideModel("String Url" or R.drawable)
        // imageList.add(new SlideModel("String Url" or R.drawable, "title")); // You can add title
        imageList.add(new SlideModel("https://nagad.com.bd/uploads/slider/EtSE6MI4JqPFMtfoRhk6tBWcIra9bA0EH9ASjWBc.jpg",  ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://nagad.com.bd/uploads/SSL-23/SSL-Web-PC_EN_1440x540.jpg", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://nagad.com.bd/uploads/AM_iPad/WB_Web-PC_EN_1440x540.jpg", ScaleTypes.CENTER_CROP));

        imageList.add(new SlideModel("https://nagad.com.bd/uploads/slider/i38vHZ6N9ZLpUeInWM44KMRdFNfLAJxCcnkqxWR2.jpg", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://nagad.com.bd/uploads/Pension/Pension-Web-PC_EN_1440x540.jpg", ScaleTypes.CENTER_CROP));

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);
        

    }


}