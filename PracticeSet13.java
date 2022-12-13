package com.practiceSet;

import java.util.*;

public class PracticeSet13 {

	public static void main(String[] args) {
		int result = sumRec(128);
		System.out.println(result);

		swapNums(5, 11);

		swapNumsWithVar(6, 234);

		for (int i = 1; i < 10; i++) { // test to compute primeNum check from 1-9
			boolean res = isPrime(i);
			System.out.println(res);
		}

		int sum = computeSum(4, 5);
		System.out.println(sum);

		boolean isPerf = isPerfectNum(6);
		System.out.println(isPerf);

		int[] arr = { 2, 4, 2, 4, 1 };
		double sumArr = sumArray(arr);
		System.out.println("Sum of array is: " + sumArr);
		
		double avg = averageNum();
		System.out.println("The average is: " + avg);

	}

	// Write a program in Java to find sum of digits of a number using recursion?
	public static int sumRec(int num) {
		if (num < 10) {

			return num;
		} else {
			return sumRec(num / 10) + num % 10;
		}

	}

// Write a program in Java to swap two numbers without using third variable?
	public static void swapNums(int n1, int n2) {
		System.out.println("Origionally: n1= " + n1 + " & n2 = " + n2);
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("After Swap: n1= " + n1 + " & n2 = " + n2);
	}

//Write a program in Java to swap two numbers using third variable?
	public static void swapNumsWithVar(int n1, int n2) {
		System.out.println("Origionally: n1= " + n1 + " & n2 = " + n2);
		int n3 = n1;
		n1 = n2;
		n2 = n3;
		System.out.println("After Swap: n1= " + n1 + " & n2 = " + n2);
	}

//Write a program in Java to find prime factors of a given integer.
	public static boolean isPrime(int n) {
		int count = 0;
		if (n > 1 && n != 2) {
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
		} else {
			return false;
		}
		return count <= 1;
	}

//Write a program in Java to add two integer without using arithmetic operator?
	public static int computeSum(int num1, int num2) {
		int sum = Math.addExact(num1, num2);

		return sum;
	}

	public static boolean isPerfectNum(int num) {
		boolean isPerfect = false;
		int sum = 0;
		List<Integer> listOfNums = new ArrayList<Integer>();
			for (int i = 1; i <= num/2; i++) {
					if (num % i == 0) {
						listOfNums.add(i);
					}
				}
		
		int tempSum = 0;
		for (int i = 0; i < listOfNums.size(); i++) {
			tempSum +=  listOfNums.get(i);
			if (tempSum == num) {
				isPerfect = true;
				break;
			}
			
		}
		return isPerfect;
	}

//Java Program to Calculate the Average of Integer Array.
	public static double sumArray(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += (double)arr[i];
		}
		return sum/(double)arr.length;
	}
	//calculate the Average of number taken from user.
public static double averageNum() {
	double sum = 0;
	int count = 0;
	int num;
	Scanner in = new Scanner(System.in);
	do {
		System.out.println("Enter a number: ");
		num = in.nextInt();
		sum += num;
		count++;
	}while(num!=0);
	double avg = (double)sum/(double)count-1;
	
	return avg;
}
}

