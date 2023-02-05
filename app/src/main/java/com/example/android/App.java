package com.example.android;

import com.google.gson.Gson;

public class App{
	
	public String greatingMessage(){
		return "Hello World";
	}
	public static void main(String[] args){
		Gson gson = new Gson();
		String message = new App().greatingMessage();
		System.out.println(message);
	}
}