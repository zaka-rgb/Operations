package main;
import Function.*;
import oper.*;
public class main {

	public static void main(String[] args) {
		
		
		// la fonction f(x)=x+2*y
		
	var x=new var("x");
	var y=new var("y");
	
	Function f=new Plus(x,new Mul(new val(2),y));
	
	System.out.println(f);
	
		// la fonction g(x,y,z)=x^2+y^2+z^2
	
	var xx = new var("xx");
	var yy = new var("yy");
	var zz = new var("zz");
	
	Function ff=new Plus(new sqr(xx),new Plus(new sqr(yy),new sqr(yy)));
	
	System.out.println(ff);
	
		// la fonction h(t)=sin(t)+5
	
	
	var t=new var("t");
	
	Function h=new Plus(new sin(t),new val(5));
	System.out.println(h);
	
	
		// la fonction k(z)=sin^2(z)+cos^2(z)
	
	var z= new var("z");
	z.setValue(-3);
	Function k=new Plus(new sqr(new sin(z)),new sqr(new cos(z)));
	System.out.println(k.getValue());
	
		

		
		
	}

	

}
