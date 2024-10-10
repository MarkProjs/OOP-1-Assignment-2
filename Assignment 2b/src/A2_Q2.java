//-----------------------------------
//Assignment 2
//Written by: Mark Benedict Agluba , Student ID: 40294956
//For COMP 248 Section S - Fall 2024
//-----------------------------------

//This progrma is used for Montreal Currency Exchange Shop Program. What it does is you can either buy or sell 
//currency for CAD and foreign currencies like USD, EUR, GBP, JPY and AUD.

import java.util.Scanner;
public class A2_Q2 {

	public static void main(String[] args) {
		//Scanner class initialization
		Scanner sc = new Scanner(System.in);

		System.out.println("******************************");
		System.out.println("Montreal Currency Exchange Shop!");
		System.out.println("******************************");
		System.out.println();
		System.out.println("Welcome to the Montreal Currency Exchange Shop!");
		System.out.print("Do you want to buy foreign currency (B) or sell foreign currency (S)? ");
		String choice = sc.nextLine();
		buyOrSell(choice);
		System.out.println("Thank you for visiting!");

	}

	private static void buyOrSell(String choice) {
		Scanner sc = new Scanner(System.in);
		
		if (choice.equalsIgnoreCase("B")) {
			System.out.print("Enter the currency you want to buy (USD, EUR, GBP, JPY, AUD): ");
			String currency = sc.nextLine();
			String realCurrency = currency.toUpperCase();
			buySwitchStatement(realCurrency, sc);
		} else if (choice.equalsIgnoreCase("S")) {
			System.out.print("Enter the CAD amount you would like to receive: ");
			double amount = sc.nextDouble();
			sc.nextLine();
			System.out.print("Enter the currency you want to receive (USD, EUR, GBP, JPY, AUD): ");
			String currency = sc.nextLine();
			String realCurrency = currency.toUpperCase();
			sellSwitchStatement(amount, realCurrency, sc);
		} else {
			System.out.println("Invalid choice!");
		}

		sc.close();
	}

	private static void sellSwitchStatement(double amount, String realCurrency, Scanner sc) {
		switch (realCurrency) {
			case "USD":
				System.out.println("You will need to spend " + String.format("%.2f", amount / 1.30) + " USD to receive "+ String.format("%.2f", amount) + " CAD.");
				break;

			case "EUR":
				System.out.println("You will need to spend " + String.format("%.2f", amount / 1.55) + " EUR to receive "+ String.format("%.2f", amount) + " CAD.");
				break;

			case "GBP":
				System.out.println("You will need to spend " + String.format("%.2f", amount / 1.80) + " GBP to receive "+ String.format("%.2f", amount) + " CAD.");
				break;

			case "JPY":
				System.out.println("You will need to spend " + String.format("%.2f", amount / 0.012) + " JPY to receive "+ String.format("%.2f", amount) + " CAD.");
				break;

			case "AUD":
				System.out.println("You will need to spend " + String.format("%.2f", amount / 1.00) + " AUD to receive "+ String.format("%.2f", amount) + " CAD.");
				break;
		
			default:
				System.out.println("Invalid currency!");
				break;
		}
	}

	private static void buySwitchStatement(String realCurrency, Scanner sc) {
		double amount = 0;
			switch (realCurrency) {
				case "USD":
					System.out.print("Enter the amount of USD that you want to buy: ");
					amount = sc.nextDouble();
					sc.nextLine();
					System.out.println("You need to spend " + String.format("%.2f", amount * 1.25) + " CAD to receive "+ String.format("%.2f", amount) + " USD.");
					break;
				case "EUR":
					System.out.print("Enter the amount of EUR that you want to buy: ");
					amount = sc.nextDouble();
					sc.nextLine();
					System.out.println("You need to spend " + String.format("%.2f", amount * 1.50) + " CAD to receive "+ String.format("%.2f", amount) + " EUR.");
					break;
				case "GBP":
					System.out.print("Enter the amount of GBP that you want to buy: ");
					amount = sc.nextDouble();
					sc.nextLine();
					System.out.println("You need to spend " + String.format("%.2f", amount * 1.75) + " CAD to receive "+ String.format("%.2f", amount) + " GBP.");
					break;
				case "JPY":
					System.out.print("Enter the amount of JPY that you want to buy: ");
					amount = sc.nextDouble();
					sc.nextLine();
					System.out.println("You need to spend " + String.format("%.2f", amount * 0.01) + " CAD to receive "+ String.format("%.2f", amount) + " JPY.");
					break;
				case "AUD":
					System.out.print("Enter the amount of AUD that you want to buy: ");
					amount = sc.nextDouble();
					sc.nextLine();
					System.out.println("You need to spend " + String.format("%.2f", amount * 0.95) + " CAD to receive "+ String.format("%.2f", amount) + " AUD.");
					break;
				default:
					System.out.println("Invalid currency!");
					break;
			}
	}

}
