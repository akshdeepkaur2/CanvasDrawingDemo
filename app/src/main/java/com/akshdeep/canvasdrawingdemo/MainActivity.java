package com.akshdeep.canvasdrawingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
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
//1. set then background
        canvas.drawColor(Color.BLUE);
        paintbrush.setColor(Color.CYAN);
// draw a line
        canvas.drawLine(10,50,200,50, paintbrush);
        paintbrush.setColor(Color.BLACK);
        // draw the rec
        canvas.drawRect(100,100,120,150,paintbrush);
        // set the text size
        paintbrush.setTextSize(40);


        //draw the text
        canvas.drawText("hi",10,30,paintbrush);

        // put te canvas into the frames
        imageView.setImageBitmap(b);
    }
}
