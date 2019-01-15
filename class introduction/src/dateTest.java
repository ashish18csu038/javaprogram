import java.util.*;
class date
{
	int date;
	int month;
	int year;
	
    date()
    {
    	month = 1;
    	date = 1;
    	year = 2000;
    }
    date(int month,int date,int year )
{
    this.month= month;
    this.date = date;
    this.year = year;
}


	void displaydate()
	{
		System.out.println(""+(date)+"/"+(month)+"/"+(year)+"" );
		

	}
}	
	public class dateTest
	{
       public static void main(String[] args)
        {
       	Scanner in= new Scanner(System.in);
       	date d1 = new date();
       	System.out.println("enter the month:");
       		int month = in.nextInt();
       	System.out.println("enter the date:");
       		int date = in.nextInt();

       	System.out.println("enter the year:");
       	int year = in.nextInt();
       
       			
       			date d2 = new date(date,month,year);
       			d2.displaydate();
      	}
	}      	