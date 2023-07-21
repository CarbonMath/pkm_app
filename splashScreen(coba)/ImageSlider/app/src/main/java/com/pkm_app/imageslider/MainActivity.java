package com.pkm_app.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSlider = findViewById(R.id.image_slider);
        ArrayList<SlideModel>slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.banner1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.banner2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.banner3, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

    }
}