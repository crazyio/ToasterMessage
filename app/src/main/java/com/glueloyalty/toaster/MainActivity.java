package com.glueloyalty.toaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.glueloyalty.toasterlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToasterMessage.s(this,"Hello World");
    }
}