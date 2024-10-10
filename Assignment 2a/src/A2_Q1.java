//-----------------------------------
//Assignment 2
//Written by: Mark Benedict Agluba , Student ID: 40294956
//For COMP 248 Section S - Fall 2024
//-----------------------------------

//This program is a fall adventure planner that recommends appropriate clothing 
//and safety tips based on the current temperature and weather conditions.


import java.util.Scanner;

public class A2_Q1 {

    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // Title of the program
        System.out.println("################################");
        System.out.println("    Fall Adventure Planner     ");
        System.out.println("################################");
        System.out.println();
        System.out.println("Welcome to the Fall Adventure Planner!");
        System.out.print("Enter the current temperature (°C): ");
        int temp = input.nextInt();

        // Consume the leftover newline after nextInt
        input.nextLine();  // This is important to consume the newline

        System.out.print("Enter the weather condition (sunny/rainy/snowy): ");
        String weather = input.nextLine(); 
		input.close();
        System.out.println();
        System.out.println("Recommended clothing: " + recommendClothing(temp, weather));
		System.out.println("Safety tip: " + safetyPrecautions(weather));
		System.out.println("Thank you for using the Fall Adventure Planner!");
    }

    private static String recommendClothing(int temp, String weather) {
        String clothing = "";

        if (weather.equalsIgnoreCase("rainy")) {
            clothing = "Waterproof clothing.";
        } else if (weather.equalsIgnoreCase("snowy")) {
            clothing = "Heavy winter clothing.";
        } else if (weather.equalsIgnoreCase("sunny") && temp > 20) {
            clothing = "Light clothing (t-shirt and shorts).";
        } else if (temp >= 10 && temp <= 20) {
            clothing = "A light jacket.";
        } else if (temp < 10) {
            clothing = "Warm clothing (sweater and coat).";
        }

        return clothing;
    }

	private static String safetyPrecautions(String weather) {
		String tips = "";
		if (weather.equalsIgnoreCase("rainy")) {
			tips = "Be cautious of slippery paths!";
		} else if (weather.equalsIgnoreCase("snowy")) {
			tips = "Stay warm and watch out for icy conditions!";
		} else if (weather.equalsIgnoreCase("sunny")) {
			tips = "Don't forget sunscreen and stay hydrated!";
		}
		return tips;
	}
}
