package oper;

import Function.Function;
import Function.Function1;

public class sin extends Function1{
	
	
	public sin(Function xx) {
		super(xx);
	}
	
	
	public double getValue() {
		
		return Math.sin(x.getValue());
		
	}
	
	public String toString() {
		
		return "sin("+x+")";
	}

}
