/*
   Programmer: Derek Will
   Date: 5/5/2017
   Program Name: Cylinder.java
   Purpose: Create an external Cylinder class of constructors
*/




public class Cylinder {
	
	double radius = 1.0;
	double height = 1.0;
	
	
	public Cylinder() {
		getVolume();
	}
	
	
	
	public Cylinder(double newRadius, double newHeight) {
		radius = newRadius;
		height = newHeight;
		
		getVolume();
	}
	
	
	
	
	public double getVolume() {
		double radiusSquared = Math.pow(radius, 2);
		double area = Math.PI * radiusSquared;
		double cylinderVolume = area * height;		
		
		return cylinderVolume;
	}

}
