import java.util.*;
class program1{
	public static void main(String[] args) {
		int num[] = new int[10];
		int rowcounter;
		int searchElement;
		boolean flag;
        Scanner in = new Scanner(System.in);     
		
		for(rowcounter=0;rowcounter<num.length;rowcounter++){
			System.out.print("Enter the element [ " + (rowcounter+1) + "] : ");
			num[rowcounter] = in.nextInt();
			System.out.println();
		}

		
		System.out.print("Enter the Element to be searched : ");
		searchElement = in.nextInt();

		
		System.out.println("Element in the array are : ");
		for(rowcounter=0;rowcounter<num.length;rowcounter++){

		System.out.println(num[rowcounter]);
		}

		
		flag  = false;
		for(rowcounter=0;rowcounter<num.length;rowcounter++){
			if(num[rowcounter] == searchElement){
				flag = true;
				break;
			}
		}
		if (flag){
			System.out.print("Element found at loction : " + rowcounter);
		}
		else{
			System.out.println("-1");
		}
	}
}