package cn.cxy.exec;

import java.util.Random;
import java.util.Scanner;

public class TestShape {
	public static void main(String[] args) {
		System.out.println("按回车继续");
		while(true) {
			int r = new Random().nextInt(4);
			switch(r) {
			case 0: f(new Shape()); break;
			case 1: f(new Line()); break;
			case 2: f(new Square()); break;
			case 3: f(new Circle()); break;
			}
		}
	}

	
	static void f(Shape s) {
		System.out.println("----------------");
		new Scanner(System.in).nextLine();
		s.draw();
		
		
		
		
		if(s instanceof Line) {
			
			Line line = (Line) s;
			line.length();
		}
		new Scanner(System.in).nextLine();
		s.clear();
	}
}
