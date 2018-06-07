package com.bank.transaction;

	public class GeometryDriver {

	   public static void main (String[] args) {
		   TwoDGeometry twoDGeometry = new TwoDGeometry();
	       ThreeDGeometry threeDGeometry = new ThreeDGeometry();

	       System.out.println ("Area of Square of side 5 is: " + twoDGeometry.surfaceArea(5));
	       System.out.println ("Volume of Cube of side 5 is: " + threeDGeometry.volume(5));
	   }

	}