
package oper;
import Function.Function;
import Function.Function2;


public class Plus extends Function2 {

public Plus(Function ff1,Function ff2) {
	super(ff1,ff2);
}

public double getValue() {
	
	return x1.getValue() + x2.getValue() ;
	
}


public String toString() {
	
	return x1+"+"+x2;
	
}



	
	
}



