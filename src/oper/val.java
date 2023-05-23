package oper;

import Function.Function0;

public class val extends Function0 {
	
	double vall;
	public val(double x) {
		vall=x;
	}
	
	public double getValue() {
		return vall;
	}
	
	public String toString() {
		
		return ""+vall;
		
	}

}
