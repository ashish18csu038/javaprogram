import java.util.*;
class program3
{
	public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	float a;
	float b;
	System.out.println("enter floating point no. : ");
	a = s.nextFloat();
	System.out.println("enter floating point no. : ");
	b = s.nextFloat();
	a = Math.round(a*1000);
	b=b/1000;
	if(a==b)
	{
		System.out.println("Same");
	}
	else
		{System.out.println("Not same");
}
	}
}