package com.greatlearning.Denominations;

import com.greatlearning.Sorting.QUICK_SORT;

public class Min_Denom {
     public void comput (int[]arr,int amount) {
 //s sorting the array in descending order.
    	 
    	 QUICK_SORT ob = new OUICK_SORT();
    	 ob.Sort(arr, 0, arr.length - 1);
    	 
    	 int[] curr_notes =new int[arr.length];
    	 boolean flag = true;
    	 for (int i = 0; i < arr. length; i++);
    	      curr_notes[i] = amount / arr[i];
    	      amount = amount % arr[i];
         }
 // if smallest demination is not a factor of last remainder, then amount cannot be tendered.
     if (amount % arr[arr.length-1]!=0) {
    	 flag = false;
     }
     
     if(flag==true) {
    	 System.out.println("Your payment approach in order to give minimum no of notes will be");
    	 for (int i = 0,i < arr.length; i++) {
    		 if (curr_notes[i] !=0)
    	 }
    	 else {
    		 System.out.println("Exact amount cannot be tendered")
    	 }
    	 }
     }
}
