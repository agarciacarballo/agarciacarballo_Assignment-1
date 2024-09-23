/**
 * Class: CMSC 
 *  Program: Assignment #1
 *  Instructor: Ashique Tanveer
 * Description: Write a program that prompts the user to enter a temperature between 
 * − 58  ºF and 41ºF and a wind speed greater than or equal to 2 and displays the 
 * wind-chill temperature. Use Math.pow(a, b) to compute v 0.16 .
 * Due: 09/22/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Alejandro Garcia Carballo
*/

package windChillTemperature;
import java.util.Scanner;

public class WindChillTemperature {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the temperature as a double
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double temperature = input.nextDouble();
		
		// Prompt the user to enter the wind speed as a double
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double speed = input.nextDouble();
		
		// Declare 4 constant doubles that will be used in the equation to find the wind chill
		final double FIRST_COEFFICIENT = 35.74;
		final double SECOND_COEFFICIENT = 0.6215;
		final double THIRD_COEFFICIENT = 35.75;
		final double FOURTH_COEFFICIENT = 0.4275;
		
		// Calculate the wind chill
		double windChill = FIRST_COEFFICIENT + SECOND_COEFFICIENT * temperature - THIRD_COEFFICIENT * Math.pow(speed, 0.16) + FOURTH_COEFFICIENT * temperature * Math.pow(speed, 0.16);
		
		// Display the result
		System.out.println("The wind chill index is " + windChill);

	}

}
