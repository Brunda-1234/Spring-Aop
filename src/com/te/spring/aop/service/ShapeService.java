package com.te.spring.aop.service;

import com.te.spring.aop.aspects.Loggable;
import com.te.spring.aop.model.Circle;
import com.te.spring.aop.model.Triangle;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	
	@Loggable
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
//	@Loggable
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	

}
