package com.homeWork;

public class Phone {
	
	String name;
	String model;
	int year;
	String os;
		
	
	void security() {
		System.out.println(name + " " +  model + "  have more security.");
	}
	void lesssecurity() {
		System.out.println(name + " " +  model + "  have less security.");
	}
	void camera() {
		System.out.println(name + " " +  model + " Can take a picture.");
	}
	void ring() {
		System.out.println(name + " " +   model + " Can ring.");
	}
	void message() {
		System.out.println(name + " " +   model + " Can send and recieve text and multi media.");
	}
	void music() {
		System.out.println(name + " " +   model + " Can play audio and video files.");
	}

	public static void main(String[] args) {

		Phone iPhone = new Phone();
		iPhone.name = "iPhone";
		iPhone.model = "12";
		iPhone.year = 2020;
		iPhone.os = "IOS 14.1";
		
		iPhone.security();
		iPhone.camera();
		iPhone.ring();
		iPhone.message();
		iPhone.music();
		System.out.println("******************************************");
		Phone android = new Phone();
		android.name = "Samsung";
		android.model = "S10";
		android.year = 2020;
		android.os = "Android 9.0";
		android.camera();
		android.ring();
		android.message();
		android.music();
		android.lesssecurity();
		System.out.println("******************************************");
		Phone nokia = new Phone();
		nokia.name = "Nokia 9";
		nokia.model = "PureView";
		nokia.year = 2019;
		nokia.os = "Android 9.0";
		
		nokia.camera();
		nokia.ring();
		nokia.message();
		nokia.music();
		nokia.lesssecurity();
		
	}
	
}
		
