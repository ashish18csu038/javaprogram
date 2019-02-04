import java.util.*;
import java.lang.*;
class program1{
    public static void main(String args[]){
		double d;
	    double r1;
		double r2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the coffecients of quadratic equation starting with x^2");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		d=num2*num2-4*num1*num3;
		if(d<0){
			System.out.println("Real roots do not exist");}
			r1=(-num2+ Math.sqrt(d))/2*num1;
			r2=(-num2- Math.sqrt(d))/2*num1;
			System.out.println("Roots of the equation are:");
			System.out.println(r1);
			System.out.println(r2);
			
			
		
	} 
}
