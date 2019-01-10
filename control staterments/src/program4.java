import java.util.*;
class program4
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        int Number; 
        System.out.println("Enter Five Digit Integer : ");
        Number = s.nextInt();
         if((Number>=1000) && (Number<=99999))
         {
         	System.out.printf("%d ", (Number / 10000));
         	System.out.printf("%d ", (Number / 10000) % 10);
         	System.out.printf("%d ", (Number / 100) % 10);
         	System.out.printf("%d ", (Number / 100) / 10);;
         	System.out.printf("%d ", (Number / 10));

         }

        
    }
    }