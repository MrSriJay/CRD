package com.example.crd;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

import java.io.IOException;

public class Calculation extends AppCompatActivity {

    PhotoView photoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        photoView = (PhotoView) findViewById(R.id.imgView);

        Uri uri = (Uri)getIntent().getParcelableExtra("ID_uri");
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
            photoView.setImageBitmap(bitmap);
            //cropped_image.setRotation(cropped_image.getRotation() + 90);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}