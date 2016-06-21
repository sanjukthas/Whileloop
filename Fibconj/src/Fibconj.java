import java.util.Scanner;

public class Fibconj {
	 
	   public static void main(String[] args) {
		   
	      System.out.println("Enter the large Integer greater than 1:?");
	      int n = new Scanner(System.in).nextInt();
	      collatz(n);
	      
	    }
	 
	   public static void collatz(int n) {
	      System.out.println(" int n= " +n);
	      if (n == 1) {
	         return;
	      } else if (n % 2 == 0) {
	          collatz(n / 2);
	      } else {
	         collatz(3*n + 1);
	      }
	   }
	}
	 