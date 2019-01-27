package com.example.felixcity.imageview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class FullscreenActivity extends AppCompatActivity {

       private  ImageView myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        myImage = findViewById(R.id.EditImageView);
             getData();  //method call

    }

    public void getData(){
        Intent intent = getIntent();
        if (intent !=null){
            Uri image = intent.getData();
          myImage.setImageURI(image);

        }
    }

}
