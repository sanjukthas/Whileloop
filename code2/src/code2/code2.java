package code2;
import java.util.Scanner;

public class code2 {
 
 public static void main(String[] args) {
 
 Scanner keyboard = new Scanner(System.in);
 double loan = 0;
 double interestRate = 0;
 double monthlyPayment = 0;
 double balance = 0;
 int compoundPeriod = 0;
 int term;
 
 /*to enter the loan amount*/
 
 System.out.printf("Enter the loan amount: ");
 loan = keyboard.nextDouble();
 /*to enter the interest rate*/
 System.out.printf("Enter the interest rate on the loan: ");
 interestRate = keyboard.nextDouble();
 /* to enter the number of years*/
 System.out.printf("Enter the term(years) for the loan payment: ");
 term = keyboard.nextInt();
 
 System.out.printf("===============================================================\n");
 keyboard.close();
/*calculation*/
 monthlyPayment = getMonthlyPayment(loan, interestRate, term);
 balance = -(monthlyPayment * (term * 12));
 System.out.format("%-30s$%-+10.2f%n", "Amount owed to bank:", balance);
 System.out.format("%-30s$%-10.2f%n", "Minimum monthly payment:", monthlyPayment);
 }

 /**
 * Calculate the monthly payment of a loan.
 * 
 * @param amt: Amount borrowed for Load
 * @param interestRate: Interest rate on the loan
 * @param term: Repayment term in years 
 * @returns The monthly payment of a loan given the interest rate, amount and term (years) 
 */
 public static double getMonthlyPayment(double amt, double interestRate, double term) {
 double rate = (interestRate / 100) / 12;/*To know the rate using interest rate*/
 double base = (rate + 1);/*to calculate the base*/
 double months = term * 12;
 double result = 0;
 result = amt * (rate * (Math.pow(base, months)) / ((Math.pow(base, months)) - 1)); 
  return result;
 }
}