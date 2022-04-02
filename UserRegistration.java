package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {

		System.out.println("enter first name");
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.next();
		if (validateName(firstName))
			System.out.println("valid firstName");
		else
			System.out.println("inavlid first name");
		System.out.println("enter last name");
		String lastName = scanner.next();
		if (validateName(lastName))
			System.out.println("valid lastName");
		else
			System.out.println("inavlid lastt name");
		System.out.println("enter email");
		String email=scanner.next();
		if(emailValidation(email)) {
			System.out.println("valid email");
		}
		else {
			System.out.println("invalid email");
		}
	}

	private static boolean emailValidation(String email) {
		String emailValidation="abc(\\.[a-z]+)?\\@bl\\.co(\\.in)?";
		return Pattern.matches(emailValidation, email);
		
	}

	private static boolean validateName(String firstName) {
		String nameValidation = "^[A-Z][A-Za-z]{2,}$";
		return Pattern.matches(nameValidation, firstName);
	}

}