package com.greatlearning.main; 

import java.util.Scanner;

import com. greatlearning.transaction.Paymoney 

public class Driver {
	
	public static void main(String[] args) {
		
		         Scanner sc = new Scanner(System.in);    
		         System.out.println("Enter the size of transaction array: ");

				
				int size = sc.nextInt();
				int[] arr = new int [size];
				System.out.println("Enter the values of array");
				for(int i=0; i<size; i++) {
				   arr[i] = sc.nextInt();
			}
			
				System.out.println("Enter the total number of the target to be achieved;");
				int n = sc.nextInt();
				Paymoney ob = new Paymoney();
				while (n>0) {
					System.out.println("Enter the value of target: ");
					int target = sc.nextInt();
					int sum = 0;
					ob.check(arr.target);
					n--;
					 
		         }
                 sc.close();
	}

}
