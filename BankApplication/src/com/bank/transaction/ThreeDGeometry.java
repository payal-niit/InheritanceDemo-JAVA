package com.bank.transaction;

public class ThreeDGeometry extends TwoDGeometry {

	   public double surfaceArea (double side) {
	       return 6*super.surfaceArea(side);
	   }

	   public double surfaceArea (double side1, double side2, double side3) {
	       return 2*(super.surfaceArea(side1, side2) +
	                 super.surfaceArea(side2, side3) +
	                 super.surfaceArea(side3, side1));
	   }

	   public double volume (double side) {
	       return (super.surfaceArea(side)*side); 
	   }

	   public double volume (double side1, double side2, double side3) {
	       return (super.surfaceArea(side1, side2)*side3); 
	   }
	}
