package oper;
import Function.*;

public class Minus extends Function2 {
	
	
	public Minus(Function ff1,Function ff2) {
		
		super(ff1,ff2);
		
	}
	
	
	public double getValue() {
		
		return x1.getValue() - x2.getValue();
	}
	
	
	public String toString() {
		return x1.toString() +"-"+x2.toString();
		
	}

}
