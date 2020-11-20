package oca.fundamental;

import java.util.*;
class SwapUsing3rdVar{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = input.nextInt();

		System.out.println("Enter the second number");
		int num2 = input.nextInt();

		System.out.println("numbers before swap      "+ num1+" "+num2);
		System.out.println("numbers after swap      "+ swap(num1,num2));


	}

	public static String swap(int num1, int num2){
		int temp =num1;
		num1=num2;
		num2=temp;
		return num1+ " "+ num2;
	}
}