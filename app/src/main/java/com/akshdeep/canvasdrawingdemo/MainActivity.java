package com.akshdeep.canvasdrawingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        Bitmap b  = Bitmap.createBitmap(300, 500, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b);
        Paint paintbrush = new Paint();


        // put te canvas into the frames
        imageView.setImageBitmap(b);
    }
}
