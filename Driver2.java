package com.greatlearning.main;

import java.util.Scanner;
public class Driver2 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out println("Enter the size of currency denomination array");
		int size = sc. nextInt();
	
		int[] demos = new int[size];
	    System.out.println("Enter the currency denomination");
	    for (int i = 0; i < size; i++) {
	    	demos[i] = sc.nextInt();
	    	
	    }
	    System.out.println("Enter the amountyou want to pay");
	    int amount = sc.nextInt();
	    
	    Min_Denom ob = new min_Denom();
	    ob.compute(denoms,amount);
	    sc.close();

}
