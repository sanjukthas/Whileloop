import java.util.Scanner;
public class Whatifcompl {

	public static void main(String[] args) {
		
     int num1, num2;
     int sum, prod, avg;
				
				Scanner keyboard = new Scanner(System.in);
				
				System.out.print( "First Number? :" );
				num1 = keyboard.nextInt();
				
				System.out.print( "Last Number?  :" );
				num2 = keyboard.nextInt();
				
				sum = num1 +num2;
				System.out.println( "sum = " + sum);
								
				prod = num1* num2;
				System.out.println( "Prod = " + prod);
				
				
				avg = (num1 +num2)/2;
				System.out.println( "avg= " + avg);
				
				
				
			}
}



