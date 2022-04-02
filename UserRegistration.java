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
		String email = scanner.next();
		if (emailValidation(email)) {
			System.out.println("valid email");
		} else {
			System.out.println("invalid email");
		}
		System.out.println("Enter phone number");
		String phoneNumber = scanner.next();
		if (phoneValidation(phoneNumber)) {
			System.out.println("valid phonenumber");

		} else {
			System.out.println("invalid phone Number");
		}
		System.out.println("Enter password");
		String password = scanner.next();
		if (passwordValidation(password)) {
			System.out.println("valid password");
		} else {
			System.out.println("invalid password");
		}emailTesting();
	}

	private static boolean passwordValidation(String password) {
		String passwordValidation = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
		return Pattern.matches(passwordValidation, password);
	}

	private static boolean phoneValidation(String phoneNumber) {
		String phoneValidation = "91\\s[0-9]{10}";
		return Pattern.matches(phoneValidation, phoneNumber);
	}

	private static boolean emailValidation(String email) {
		String emailValidation = "abc(\\.[a-z]+)?\\@bl\\.co(\\.in)?";
		return Pattern.matches(emailValidation, email);

	}

	private static boolean validateName(String firstName) {
		String nameValidation = "^[A-Z][A-Za-z]{2,}$";
		return Pattern.matches(nameValidation, firstName);
	}

	public static void emailTesting() {
		System.out.println("Email testing");
		String[] emails = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc",
				"abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
				"abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a",
				"abc@gmail.com.aa.au" };
		for (int i = 0; i < emails.length; i++) {
			if (emailValidation(emails[i]))
				System.out.println(emails[i] + " valid");

			else
				System.out.println(emails[i] + " not valid");
		}
	}
}