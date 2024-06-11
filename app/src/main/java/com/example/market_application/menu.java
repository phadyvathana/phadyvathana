package com.example.market_application;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menu extends AppCompatActivity {
    public ImageView imgStr;
    public ImageView imgPhoto;
    public ImageView imgPro;
    public ImageView img_back1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imgPhoto = findViewById(R.id.imgPhoto);
        imgPhoto.setOnClickListener(v -> {
            Intent i = new Intent(menu.this, Post_product.class);
            startActivity(i);
        });

        imgStr = findViewById(R.id.imgStr);
        imgStr.setOnClickListener(v -> {
            Intent i = new Intent(menu.this, product_detail.class);
            startActivity(i);
        });

        imgPro = findViewById(R.id.imgPro);
        imgPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu.this,Profile.class);
                startActivity(i);
            }
        });
        img_back1 = findViewById(R.id.img_back1);
        img_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
