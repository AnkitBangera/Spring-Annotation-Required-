package org.Spring;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	private Point pointA;

	 

	public Point getPointA() {
		return pointA;
	}


	@Required
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle [centre=" + pointA + "]");
	}
	
}
