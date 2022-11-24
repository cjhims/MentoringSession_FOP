package com.greatlearning.service;

import java.util.Scanner;

public class BankingOperations {
	
	private int bankBalance=1000;

	Scanner sc=new Scanner(System.in);
	
	public void deposit(int amount)
	{
		bankBalance+=amount;
		System.out.println("Deposit done successfully.");
		System.out.println("Balance: "+bankBalance);
	}
	
	public void withdraw(int amount)
	{
		if(amount<=bankBalance)
		{
			bankBalance-=amount;
			System.out.println("Withdraw done successfully.");
			System.out.println("Balance: "+bankBalance);
		}
		else
		{
			System.out.println("Insufficient Funds!!!");
		}
	}
	
	public void transfer(int amount, String toAccountNumber)
	{
		int otp=OtpGenerator.generateOtp();
		System.out.println("Otp: "+otp);
		System.out.println("Please enter the otp: ");
		int inputOtp=Integer.parseInt(sc.next());
		if(inputOtp==otp)
		{
			if(amount<=bankBalance)
			{
				bankBalance-=amount;
				System.out.println("Transfer of Rs."+amount+" done successfully to "+toAccountNumber);
				System.out.println("Balance: "+bankBalance);
			}
			else
			{
				System.out.println("Insufficient Funds!!!");
			}
		}
		else
		{
			System.out.println("Invalid OTP!!!");
		}
	}

}