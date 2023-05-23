package oper;
import Function.Function0;

public class var extends Function0{
	
double vall;
String name;

public var(double x,String xx) {
	vall=x;
	name=xx;
}
public var(String xx) {
	name=xx;
}
public var(double x) {
	vall=x;
}
public double getValue() {
		return vall;
}

public String toString() {
	
	return name+"";
}

public void setValue(double x) {
	vall=x;
}
}
