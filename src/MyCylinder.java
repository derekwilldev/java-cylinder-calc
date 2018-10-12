/*
   Programmer: Derek Will
   Date: 5/5/2017
   Program Name: MyCylinder.java
   Purpose: Create a driver class to find volume of various cylinders
*/



import java.util.Scanner;


public class MyCylinder {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		
		Cylinder cylinder1 = new Cylinder();
		System.out.println("The volume of a cylinder with a radius of " + cylinder1.radius + " and a height of " + cylinder1.height + " is " + cylinder1.getVolume());
		
		
		
		Cylinder cylinder2 = new Cylinder(4.0, 6.0);
		System.out.println("The volume of a cylinder with a radius of " + cylinder2.radius + " and a height of " + cylinder2.height + " is " + cylinder2.getVolume());
		
		
		
		
			// user inputs radius
		System.out.print("Enter the cylinder radius: ");
		double myRadius = userInput.nextDouble();
		
			// user inputs height
		System.out.print("Enter the cylinder height: ");
		double myHeight = userInput.nextDouble();
		
		
		
		Cylinder cylinder3 = new Cylinder(myRadius, myHeight);
		System.out.println("The volume of a cylinder with a radius of " + cylinder3.radius + " and a height of " + cylinder3.height + " is " + cylinder3.getVolume());

	}

}
