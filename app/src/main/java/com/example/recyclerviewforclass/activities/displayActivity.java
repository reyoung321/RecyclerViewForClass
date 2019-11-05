package com.example.recyclerviewforclass.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.recyclerviewforclass.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class displayActivity extends AppCompatActivity {
CircleImageView circImg;
TextView tvFullName, tvPhoneNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        circImg = findViewById(R.id.circImg);
        tvFullName = findViewById(R.id.tvFullName);
        tvPhoneNo = findViewById(R.id.tvPhoneNo);
        Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
            circImg.setImageResource(bundle.getInt("image"));
            tvFullName.setText(bundle.getString("name"));
            tvPhoneNo.setText(bundle.getString("phone"));


        }
    }
}
