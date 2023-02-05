package com.example.android;


import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{
	
	
	@Test
	public void testGreating(){
		App app = new App();
		assertNotNull("this function have",app.greatingMessage());
	}
}