package edu.negl.math;
import java.math.*;

public class IceCreamCone {
	
	public static final double PI = 3.14159;	
	double radius;
	double coneHeight;
	
	public IceCreamCone(double height, double radius) {
		this.radius = radius;
		this.coneHeight = height - radius;
	}
	
	/**
	 * Get the volume of the cone plus sphere
	 * V=pir2h/3
	 * V=4/3pir3
	 * @return
	 */

	public double getVolume() {
		
		return (PI * radius * 2 * (coneHeight/3)) + ((4 * Math.pow(PI, 3) * radius)/3)/2;
		
	}
}
