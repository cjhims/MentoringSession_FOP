package com.greatlearning.test;

import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.service.BankingOperations;

public class BankingTest {
//	{
//		System.out.println("Bye");
//	}
//	
//	static
//	{
//		System.out.println("Hello1");
//	}
//	
//	static
//	{
//		System.out.println("Hello2");
//	}

	public static void main(String[] args) {
		BankingTest bt=new BankingTest();
		Scanner sc =new Scanner(System.in);
		BankingOperations bo=new BankingOperations();
		Customer customer1=new Customer("A12345","password");
		
		System.out.println("!!!Welcome to Indian Bank!!!");
		System.out.println("Please enter your account number: ");
		String acctNo=sc.nextLine();
		System.out.println("Please enter the password: ");
		String password=sc.nextLine();
		
		if(customer1.getBankAccountNo().equals(acctNo) && customer1.getPassword().equals(password))
		{
			int option=0;
			do
			{
				System.out.println("Please select one of the operations below: ");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Transfer");
				System.out.println("4. Logout");
				
				option=Integer.parseInt(sc.nextLine());
				int amount=0;
				switch(option)
				{
				case 1:
						System.out.println("Please enter amount: ");
						amount=Integer.parseInt(sc.nextLine());
						bo.deposit(amount);
						break;
				case 2:
						System.out.println("Please enter amount: ");
						amount=Integer.parseInt(sc.nextLine());
						bo.withdraw(amount);
						break;
				case 3:
					System.out.println("Please enter receiver's account number:");
					String toAccountNumber=sc.nextLine();
					System.out.println("Please enter amount: ");
					amount=Integer.parseInt(sc.nextLine());
					bo.transfer(amount, toAccountNumber);
					break;
				case 4:
					option=-1;
					break;
				}
			}while(option!=-1);
			System.out.println("Thank you for banking with us..A1");
		}
		else
		{
			System.out.println("Invalid Credentials!!!");
		}

		sc.close();
	}

}