import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double a, b, c;
		double temp;
	
		System.out.print( "Enter one side of the triangle: " );
	    a = keyboard.nextInt();
	    System.out.print( "Enter second side of the triangle: " );
	    b = keyboard.nextInt();
	    System.out.print( "Enter thrid side of the triangle:  " );
	    c = keyboard.nextInt();
	    
	    double arr[] ={ a,b,c};
	    
	    for ( int k=0; k<=arr.length;k++)
	    {
	        for ( int i=1; i<=arr.length-1;i++)
	        {
	        	if(arr[i-1]>arr[i])
	        	{
	        		temp=arr[i-1];
	        		arr[i-1]=arr[i];
	        		arr[i]=temp;
	        	}
	        }
	    }
	     
	      			        
	    if (arr[0]== arr[1]&&arr[0]==arr[2])
	    	 System.out.println("Its a Equilateral Triangle");
	    
	    else if ((Math.sqrt(arr[2]))== (Math.sqrt(arr[0])*Math.sqrt(arr[1])))
	    System.out.println("Its a Right angle Triangle");
	    else
	    	
	    	System.out.println("Its a Triangle");
	    	
	    
	       	
	}

}
