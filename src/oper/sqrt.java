package oper;

import Function.Function;
import Function.Function1;

public class sqrt extends Function1{
	
	
	public sqrt(Function xx) {
		super(xx);
	}
	
	
	public double getValue() {
		
		return Math.sqrt(x.getValue());
		
	}
	
	public String toString() {
		
		return "sqrt"+"(x)";
	}

}
