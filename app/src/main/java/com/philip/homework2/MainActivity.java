package com.philip.homework2;

import android.graphics.Bitmap;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import org.opencv.android.OpenCVLoader;
import org.opencv.android.Utils;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        final int[] count = {1};
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!OpenCVLoader.initDebug()) {
                    Log.d("philip", "Error OpenCV");
                } else {
                    Log.d("philip", "OpenCV OK");
                }
                Point first = new Point(100,200);
                Point second = new Point(100, 400);
                Point third = new Point(300,400);
                Point fourth = new Point(300, 200);
                Scalar lineColor = new Scalar(255,0,0,255);
                int lineWidth = 3;
                Mat img = null;
                if (count[0] == 1){
                    try{
                        img = Utils.loadResource(MainActivity.this,R.drawable.lol, CvType.CV_8UC4);
                        Imgproc.line(img, first, second, lineColor, lineWidth);
                        Bitmap bitmap = Bitmap.createBitmap(img.width(), img.height(), Bitmap.Config.ARGB_8888);
                        Utils.matToBitmap(img, bitmap);
                        ImageView imgView = findViewById(R.id.imageView);
                        imgView.setImageBitmap(bitmap);
                        count[0]++;
                        Log.d("philip",""+count[0]);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
                else if (count[0] == 2){
                    try{
                        img = Utils.loadResource(MainActivity.this,R.drawable.lol, CvType.CV_8UC4);
                        Imgproc.line(img, first, second, lineColor, lineWidth);
                        Imgproc.line(img, second, third, lineColor, lineWidth);
                        Bitmap bitmap = Bitmap.createBitmap(img.width(), img.height(), Bitmap.Config.ARGB_8888);
                        Utils.matToBitmap(img, bitmap);
                        ImageView imgView = findViewById(R.id.imageView);
                        imgView.setImageBitmap(bitmap);
                        count[0]++;
                        Log.d("philip",""+count[0]);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
                else if (count[0] == 3){
                    try{
                        img = Utils.loadResource(MainActivity.this,R.drawable.lol, CvType.CV_8UC4);
                        Imgproc.line(img, first, second, lineColor, lineWidth);
                        Imgproc.line(img, second, third, lineColor, lineWidth);
                        Imgproc.line(img, third, fourth, lineColor, lineWidth);
                        Bitmap bitmap = Bitmap.createBitmap(img.width(), img.height(), Bitmap.Config.ARGB_8888);
                        Utils.matToBitmap(img, bitmap);
                        ImageView imgView = findViewById(R.id.imageView);
                        imgView.setImageBitmap(bitmap);
                        count[0]++;
                        Log.d("philip",""+count[0]);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
                else if (count[0] == 4){
                    try{
                        img = Utils.loadResource(MainActivity.this,R.drawable.lol, CvType.CV_8UC4);
                        Imgproc.line(img, first, second, lineColor, lineWidth);
                        Imgproc.line(img, second, third, lineColor, lineWidth);
                        Imgproc.line(img, third, fourth, lineColor, lineWidth);
                        Imgproc.line(img, fourth, first, lineColor, lineWidth);
                        Bitmap bitmap = Bitmap.createBitmap(img.width(), img.height(), Bitmap.Config.ARGB_8888);
                        Utils.matToBitmap(img, bitmap);
                        ImageView imgView = findViewById(R.id.imageView);
                        imgView.setImageBitmap(bitmap);
                        count[0]++;
                        Log.d("philip",""+count[0]);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
                Log.d("philip",""+count[0]);
            }
        });
    }
}
