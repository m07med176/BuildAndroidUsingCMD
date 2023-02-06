package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class App extends AppCompatActivity{
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app);
		System.out.println("Hello World");
    }
	
	
}