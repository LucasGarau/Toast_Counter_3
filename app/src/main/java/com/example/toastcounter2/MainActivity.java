package com.example.toastcounter2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView showcount;
    private int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=0;
        showcount = findViewById(R.id.showcount);
    }

    public void showToast(View view) {
        Toast toast=Toast. makeText(getApplicationContext(),Integer.toString(num),Toast. LENGTH_SHORT);
        toast.show();
    }

    public void increase(View view){
        num++;
        showcount.setText(Integer.toString(num));

    }
}
