import java.util.Scanner;
class program3 {
    static int[] arr;               
	public static void main(String[] args) {
	    arr = new int[4];           
	    
	    Scanner num = new Scanner(System.in);
	    boolean c,flag;
	    int n,i;
	    for(i=0;i<5;i++){
	        System.out.println(i+"Enter number:");
	        n = num.nextInt();
	        while(true) {
			if(n>9 && n<101){
			    break;
			}
		        System.out.println("Enter integer between 10 - 50:");  
			n = num.nextInt();
	        }
		flag=false;
		for (int k=i-1;k>=0;k--) {            
			if(n==arr[k]){                      
				System.out.println("Duplicate entry");
		            	flag=true;
			}
		}
		if(flag==true){
			i=i-1;
			continue;
		}
	        arr[i]=n;
		System.out.println("===================");
		for(int k=0;k<=i;k++){      
	        	System.out.print(arr[k]+" ");
		}
		System.out.println("\n===================");
	    }

    }
}