package com.java.study.java;

/**
 * @Author:HuoYaJing
 * @Description:面向过程的方案
 * @Date: Create in 6:22 PM 2018/11/28
 */
public class Geometry {
	public final double PI=3.141592653589793;
	public double area(Object shape) throws NoSuchFieldException {
		if (shape instanceof Square){
			Square s= (Square) shape;
			return s.size*s.size;
		} else if (shape instanceof Rectangle) {
			Rectangle r= (Rectangle) shape;
			return r.height*r.width;
		}else if (shape instanceof Circle){
			Circle c= (Circle) shape;
			return PI*c.radius*c.radius;
		}
		throw new NoSuchFieldException();
	}
}
