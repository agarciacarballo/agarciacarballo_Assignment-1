/**
 * Class: CMSC 
 *  Program: Assignment #1
 *  Instructor: Ashique Tanveer
 * Description: Write a program that prompts the user to enter the distance to drive, 
 * the fuel efficiency of the car in miles per gallon, and the price per gallon, and displays the cost of the trip.
 * Due: 09/22/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Alejandro Garcia Carballo
*/


package costOfDriving;
import java.util.Scanner;

public class CostOfDriving 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the distance as a double
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		// Prompt the user to enter the miles as a double
		System.out.print("Enter miles per gallon: ");
		double miles = input.nextDouble();
		
		// Prompt the user to enter the price as a double
		System.out.print("Enter price per gallon: ");
		double price = input.nextDouble();
		
		// Find the cost by doing distance / miles multiplied by the price
		double costOfDriving = (distance / miles) * price;
		
		// Display result
		System.out.println("The cost of driving is $" + costOfDriving);
	}
}
