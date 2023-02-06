package com.example.android;

public class App{
	
	public String greatingMessage(){
		return "Hello World";
	}
	public static void main(String[] args){
		String message = new App().greatingMessage();
		System.out.println(message);
	}
}