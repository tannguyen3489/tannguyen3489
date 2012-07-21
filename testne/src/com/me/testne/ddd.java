package com.me.testne;

import java.io.IOException;

import com.me.util.LoadProperties;

public class ddd {
	public static void main(String[] args) {
		try {
			LoadProperties loadProperties = new LoadProperties();
			
			System.out.println(LoadProperties.target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
