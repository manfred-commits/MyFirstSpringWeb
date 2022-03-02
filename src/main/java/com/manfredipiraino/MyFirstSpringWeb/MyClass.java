package com.manfredipiraino.MyFirstSpringWeb;

import java.util.HashMap;
import java.util.Map;

public class MyClass {
	private String myString;
	
	static final public String[] myArray = { 
			"MyClass.myArray value 1", 
			"MyClass.myArray value 2", 
			"MyClass.myArray value 3" 
	};
	
	private Map<Integer, String> myMap;
	
	// Costruttore
	public MyClass() {
		myString = "MyClass.myString value dos";		
		myMap = new HashMap<Integer, String>();
		myMap.put(3, "MyClass.myMap value A");
		myMap.put(1,"MyClass.myMap value B");
		myMap.put(2, "MyClass.myMap value C");
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

	public Map<Integer, String> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<Integer, String> myMap) {
		this.myMap = myMap;
	}

	public static String[] getMyarray() {
		return myArray;
	}
	
}
