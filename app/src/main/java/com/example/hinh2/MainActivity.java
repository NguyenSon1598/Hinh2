package com.example.hinh2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgv;
    Button btnshowhinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgv = (ImageView)findViewById(R.id.imgv);
        btnshowhinh = (Button)findViewById(R.id.btnshowhinh);
        btnshowhinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //imgv.setImageResource(R.drawable.khanhtinh);
                int n = random();
                switch (n){
                    case 1:
                        imgv.setBackgroundResource(R.mipmap.hinh1);
                        break;
                    case 2:
                        imgv.setBackgroundResource(R.mipmap.hinh2);
                        break;
                    case 3:
                        imgv.setBackgroundResource(R.mipmap.hinh3);
                        break;
                    case 4:
                        imgv.setBackgroundResource(R.mipmap.hinh4);
                        break;
                    case 5:
                        imgv.setBackgroundResource(R.mipmap.hinh5);
                        break;
                    case 6:
                        imgv.setBackgroundResource(R.mipmap.hinh6);
                        break;
                    case 7:
                        imgv.setBackgroundResource(R.mipmap.hinh7);
                        break;
                }

            }
        });
    }
    public int random () {
        Random rd = new Random();
        int n = rd.nextInt(8);
        return n;
    }
}
