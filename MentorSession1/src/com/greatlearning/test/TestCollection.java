package com.greatlearning.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.service.BankingOperations;

public class TestCollection {

	public static void main(String[] args) {
		BankingTest bt=new BankingTest();
		Scanner sc =new Scanner(System.in);
		BankingOperations bo=new BankingOperations();
		
		List<Customer> customerList = new ArrayList<>();
		for(int i = 0;i<5;i++) {
			System.out.println("Enter account number for customer "+(i+1)+": ");
			String acctNumber=sc.nextLine();
			System.out.println("Enter password for customer "+(i+1)+": ");
			String password=sc.nextLine();
			Customer customer=new Customer(acctNumber,password);
			customerList.add(customer);
		}
		Iterator<Customer> it = customerList.iterator();
		int i = 1;
		while(it.hasNext()) {
			Customer cust = (Customer)it.next();
			System.out.println("Username: "+cust.getBankAccountNo());
			System.out.println("Username: "+cust.getPassword());
			i++;
		}
		
		System.out.println("!!!Welcome to Indian Bank!!!");
		System.out.println("Please enter your account number: ");
		String acctNo=sc.nextLine();
		System.out.println("Please enter the password: ");
		String password=sc.nextLine();

		//for each loop
		for(Customer cust: customerList) {
			if(cust.getBankAccountNo().equals(acctNo)&&cust.getPassword().equals(password))
				System.out.println("User Validated!!!");
		else
			System.out.println("Not a valid user!!!");
		}
	}

}
