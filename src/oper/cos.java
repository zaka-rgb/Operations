package oper;
import Function.*;
public class cos extends Function1{
	
	public cos(Function xx) {
		super(xx);
	}
	
	
	public double getValue() {
		
		return Math.cos(x.getValue());
		
	}
	
	public String toString() {
		
		return "cos("+x+")";
	}

}
