import java.util.Scanner;

//********************************************************************
//
//  Author:        Madeline Weber
//
//  Program :	   Employee Payment Calculator
//
//  File Name:     Employee Pay.java
//
//  Description:   This program computes the weekly gross pay of 
//  employees, entering the employee ID number, hourly rate of pay, and the
//  number of hours worked for the week. Calculate the net pay and overtime
//  pay, including deductions. Originally completed for a homework assingment.
//
//********************************************************************
public class EmployeePay {

	public static void main (String[] args){
		 //***************************************************************
	    //
	    //  Method:       main
	    // 
	    //  Description:  The main method of the program
	    //
	    //  Parameters:   String array
	    //
	    //  Returns:      N/A 
	    //
	    //**************************************************************
		Scanner input = new Scanner(System.in);
		
		//  declare and initalize variables
		int idNumber;
		double PayRate = 0;
		double RegularHours = 0;
		double OvertimeHours = 0;
		double TotalHours = 0;
		double RegularPay = 0;
		double OvertimePay = 0;
		double GrossPay = 0;
		double Tax = 0;
		double Deductions = 0;
		double NetPay = 0;
		double ParkingFee = 30;
	
		//  get input for employee information
		System.out.println("Enter employee ID number: ");
		idNumber = input.nextInt();
		System.out.println("Enter employee payrate: ");
		PayRate = input.nextDouble();
		System.out.println("Enter hours worked: ");
		TotalHours = input.nextDouble();
		
		//  see if there are overtime hours
		if ( TotalHours > 40 ) {
			OvertimeHours = TotalHours - 40;
			RegularHours = TotalHours - OvertimeHours;
		}
		else {
			RegularHours = TotalHours;
			OvertimeHours = 0;
		}
		
		//  calculate pay
		RegularPay = RegularHours * PayRate;
		OvertimePay = OvertimeHours * (PayRate * 1.5);
		GrossPay = RegularPay + OvertimePay;
		
		//  calculate deductions
		if (GrossPay > 600) {
			Tax = (GrossPay * .125); 
		}		
		Deductions = (Tax + ParkingFee);
		NetPay = (GrossPay - Deductions);
		
		//  output
		System.out.println("Program 4");
		System.out.printf("ID Number:		%s%n" , idNumber);
		System.out.printf("Pay Rate:		$%.2f%n" , PayRate);
		System.out.printf("Regular Hours:		%.2f%n" , RegularHours);
		System.out.printf("Overtime Hours:		%.2f%n", OvertimeHours);
		System.out.printf("Total Hours:		%.2f%n", TotalHours);
		System.out.printf("Regular Pay:		$%.2f%n",RegularPay);
		System.out.printf("Overtime Pay:		$%.2f%n", OvertimePay);
		System.out.printf("Gross Pay:		$%.2f%n", GrossPay);
		System.out.printf("Tax:			$%.2f%n", Tax);
		System.out.printf("Deductions:		$%.2f%n", Deductions);
		System.out.printf("Net Pay:		$%.2f%n", NetPay);
		
	}
} // End Program
