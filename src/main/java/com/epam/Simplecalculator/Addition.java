package com.epam.Simplecalculator;

public class Addition{
	double a,b;
	Addition(double a,double b){
		this.a=a;
		this.b=b;
	}
	void add() {
		System.out.println(this.a+this.b);
	}
}