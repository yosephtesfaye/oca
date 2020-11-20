package oca;

import java.util.*;
class SwapUsing2var{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int num1= input.nextInt();

		System.out.println("Enter the second Number:");
		int num2= input.nextInt();

		System.out.println("Before swap: "+ num1 + " "+ num2);

		System.out.println("After swap: "+ swap(num1,num2));

	}

	public static String swap(int a, int b){
		a= a + b;
		b=a-b;
		a=a-b;
		return a +" "+b; 
	}
}