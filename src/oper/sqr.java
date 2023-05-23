package oper;

import Function.Function;
import Function.Function1;

public class sqr extends Function1{
	
	public sqr(Function xx) {
		super(xx);
	}
	
	
	public double getValue() {
		
		return Math.pow(x.getValue(), 2);
		
	}
	
	public String toString() {
		
		return x+"^2";
	}

}
