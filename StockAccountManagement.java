package com.bridgelabz;

import java.util.Scanner;

public class StockAccountManagement {
	static int totalValue;
	String Stock_Name;

	static int calculate(int No_Of_Shares, int Share_Price) {

		return totalValue = No_Of_Shares * Share_Price;

	}

	void print() {
		System.out.println("---------------------------------------------");
		System.out.println("Value Of The item : " + totalValue);
		System.out.println();
	}
	public void addData() {
		StockAccountManagement stockReport = new StockAccountManagement();
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the name of the item :");
		String name = sc1.next();
		
		System.out.print("Enter the number of shares :");
		int No_Of_Shares = sc1.nextInt();
		
		System.out.print("Enter the price of the share of this stock :");
		int Share_Price = sc1.nextInt();
		calculate(No_Of_Shares, Share_Price);
		
		stockReport.print();
	}
	public static void main(String[] args) {
		StockAccountManagement stockReport = new StockAccountManagement();
		stockReport.addData();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("-----------------------------------------------");
		System.out.println("Do you want to add more items Y/N");
		String str = sc.next();
		switch (str) {
		case "Y":
			stockReport.addData();
			break;
		case "N":
			System.out.println("No more item to add ");
			break;
		}
		}
}
