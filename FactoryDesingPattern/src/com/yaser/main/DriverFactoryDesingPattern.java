package com.yaser.main;

import com.yaser.domain.Shape;
import com.yaser.domain.ShapeFactory;

public class DriverFactoryDesingPattern {
	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2=shapeFactory.getShape("RECTANGLE");
		shape2.draw();

	}

}
