package com.homeWork;

public class Dog {
	
	String name;
	String breed;
	String color;
	int age;
	double height;
	char gender;
	
	void aggression() {
		System.out.println(name + " is from " + breed + " is aggression toward Other dogs.");
	}
	void notAggression() {
		System.out.println(name + " is from " + breed + " mostly is not aggression toward Other dogs.");
	}
	void jump() {
		System.out.println(name + " is from " + breed + " they jumps high.");
	}
	void dig() {
		System.out.println(name + " is from " + breed + " they like diging.");
	}
	void friendly() {
		System.out.println(name + " is from " + breed + " and friendly dog.");
	}
	void Chew() {
		System.out.println(name + " is from " + breed + " loves chewing");
	}

	public static void main(String[] args) {
		Dog husky = new Dog();
		husky.name = "Barud";
		husky.breed = "Husky";
		husky.color = "Black";
		husky.age = 8;
		husky.gender = 'M';
		husky.aggression();
		husky.jump();
		husky.dig();
		System.out.println("******************************************");
		Dog bulldog = new Dog();
		bulldog.name = "Lucy";
		bulldog.breed = "Bulldog";
		bulldog.color = "Brown";
		bulldog.age = 12;
		bulldog.gender = 'F';
		bulldog.notAggression();
		bulldog.friendly();
		System.out.println("******************************************");
		Dog labrador = new Dog();
		labrador.name = "Bobi";
		labrador.breed = "Labrador";
		labrador.color = "Gray";
		labrador.age = 6;
		labrador.gender = 'M';
		labrador.dig();
		labrador.Chew();
	}
}
