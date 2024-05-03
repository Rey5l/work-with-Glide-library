package com.reysl.glidelibrary;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.LazyHeaders;
import com.reysl.glidelibrary.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.imageButton);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String url = "https://kartinki.pics/uploads/posts/2022-03/1646733389_2-kartinkin-net-p-priroda-letom-kartinki-2.jpg";

               Glide.with(MainActivity.this).load(url).fitCenter().into(imageView);
           }
       });

    }
}
