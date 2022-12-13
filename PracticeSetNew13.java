package com.practiceSet;

import java.util.*;
public class PracticeSetNew13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//1
		double avg = aveNum();
		System.out.println("The average num of taken from user: "+ avg);
		
		//2
		 int fact = factorialIterative(5);
		    System.out.println("Iterative way " + fact);
		
		//3
		int fact2 = factorial(5);
		System.out.println("Factorial is: " + fact2);
		
		//4 
		System.out.println("Enter a number to evalute if it's Even/odd");
		int num = in.nextInt();
		boolean result = isEven(num);
		System.out.println("Is " + num + " Even number? " + result);
		
		//5
		firstNPrimeNums(9);
		
		//6
		boolean anyPrime=  anyPrimeInRange(3, 9);
	    System.out.println(anyPrime);
	     boolean anyPrime2=  anyPrimeInRange(8, 10);
	    System.out.println(anyPrime2);
	    System.out.println("Put a range to find if any prime in that range,"
	    		+ "The first num must be smaller than the second");
	    System.out.println();
	    int firNum = in.nextInt();
	    System.out.println();
	    int secNum = in.nextInt();
	    boolean anyPrimeNum=  anyPrimeInRange(firNum, secNum);
	    System.out.println(anyPrimeNum);
	    
	    
	    int max = smallestNum(3, 5, 2);
	    System.out.println(max);
	    
	    
	    System.out.println("Enter a number for power operation (base)");
	    double n = in.nextDouble();
	    System.out.println("Enter a number for power operation (exponent)");
	    double exp = in.nextDouble();
	    double res = powerOfNum(num,exp);
	    System.out.println(res);
	    
	    System.out.println("Enter a number for power operation (base)");
	    int base = in.nextInt();
	    System.out.println("Enter a number for power operation (exponent)");
	    int expo = in.nextInt();
	    int reslt= powerOperation(base,expo);
	    System.out.println(reslt);
	    
	    System.out.println("Enter a num to compute the square of that num");
	    int number = in.nextInt();
	    int r = computeSquare(number);
	    System.out.println("The square of " + number + " is= " + r );
	}
	
	//Q1).Java Program to calculate the Average of number taken from user.
public static double aveNum() {
	int sum=0, count=0;
	int num;
	double avg =0;
	Scanner in = new Scanner(System.in);
	do {
		num = in.nextInt();
		sum+=num;
		count++;
	}while(num!=0);
	avg = (double)sum/(double)count-1;
	return avg;
}
//Q2). Java Program to calculate factorial using iterative method.
public static int factorialIterative(int n){
	  int fact =1;
	  for(int i=1; i<=n; i++){
	    fact*=i;
	  }
	  return fact;
	}
//Q3). Java Program to calculate factorial using recursion.
public static int factorial(int n) {
	int fac=0;
	if(n==1) {
		return n;
	}
	
	return factorial(n-1) * n;
}
//Q4). Java Program to check a given number is even or odd.
public static boolean isEven(int n){
    if(n%2==0){
      return true;
    }else {
      return false;
    }
  }

// Q5). Java program to print first n Prime Number with explanation.
/*
 * I used a helper function to evaluate a  number if it's prime or not
 * then used a for loop to iterate through the numbers from 1 to 100
 *  and decrease the n by 1 every time when the number is a prime number
 */
public static boolean isPrimeNum(int n){
    int count = 0;
       for(int i=1; i<n; i++){
         if(n<=2){
          return false;
        }else if (n%i==0){     
           count++;
       }
      }
    return count<=1; 
    }
  public static void firstNPrimeNums(int num){
    int n=1;
      for(int i=1; i<100; i++){
         if(isPrimeNum(i)){
        System.out.println(i);
           num--;
      }
        if(num <=0){
          break;
        }
      }
}
  //Q6). Java Program to print Prime Number in a given range
  /*
   * Here also I used a helper function isPrimeNum to evaluate if the number 
   * is prime or not in that range if there is any prime it returns true and breaks
   */
  public static boolean anyPrimeInRange(int minRange, int maxRange) {
	  boolean anyPrime =false;
	  for(int i=minRange; i<=maxRange; i++) {
		  if(isPrimeNum(i)) {
			  anyPrime = true;
			  break;
			  
		  }
	  }
	  return anyPrime;
  }
  
  //Q7). Java Program to find Smallest number among three.
  public static int smallestNum(int num1, int num2, int num3) {
	  if(num1>num2 && num1>num3 ) {
		  return num1;
	  }else if(num2>num1 && num2>num3) {
		  return num2;
	  }else {
		  return num3;
	  }
  }
  //Q8). Java program to calculate the power using the POW method.
  public static double powerOfNum(double num, double exponent) {
	  return Math.pow(num, exponent);
  }
  
  //Q9). Java Program to calculate the power without using POW function.
  public static int powerOperation(int num, int exponent) {
	  int res=1;
	  for(int i=0; i<exponent; i++) {
		  res*=num;
	  }
	  return res;
  }
  //Q10). Java Program to calculate the square of a given number.
  public static int computeSquare(int n) {
	  int res = (int) Math.pow(n, 2);
	  return res;
  }
  
}

