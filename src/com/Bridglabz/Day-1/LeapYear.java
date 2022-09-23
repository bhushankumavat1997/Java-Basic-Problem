package com.Bridglabz;
import java.util.*;
public class LeapYear {

	 public static void main (String args[]){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the year");
		 int y = sc.nextInt();
		 if(y%100==0){
		 System.out.println(y + "Leap year" );
		 }
		 else{ 
			  System.out.println(y + "Not leap Year");
		 }
		 if(y%400==0 ){
		System.out.println(y+ "its  leap Year");
		sc.close();
	}
	}
} 
