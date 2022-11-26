package com.practice;

import java.util.*;

public class PracticeQuestionsSet3 {
	public static void main(String[] args) {
		PracticeQuestionsSet3 p = new PracticeQuestionsSet3();
		
		//Test the methods
		String s = p.substringOfString("Tsion", 1);
 	   System.out.println(s);
 	   String s1 = p.reverseString("Tsion");
    	System.out.println(s1);
		boolean s2 = p.isPalindrome("poopy");
		System.out.println(s2);
		boolean s3 = p.isNumPalindrome(101);
		System.out.println(s3);
		int[][] arr1 = {{2,3}, {4,5}};
		System.out.print(arr1.length);
		System.out.print(arr1[0].length);
		int[][] arr2 = {{3,2}, {6,7}};
		p.addMatrix(arr1, arr2);
		System.out.println("Multiplication");
		int[][] a = {{2,4}, {3,5}};
		int[][]b = {{1,2}};
		p.multiplyMatrix(arr1, arr2);
		
		// Method Overriding program in java A is parent class, B is child class
		ParentClass aa = new ParentClass();
		aa.display(); //if we make an obj of parent class, we can get the method from parent
		
		ChildClass bb = new ChildClass();
		bb.display();//if we make an obj of child class, we can get the method from child class
		
		System.out.println("");
		p.replaceString("Tsion", "Meron");
		System.out.println("");
		
		 p.randomNum(10);
		
		 int[] arr4 = {2, 4, 7, 9, 11, 16, 34};
		 int last = arr4.length-1;
		 p.binarySearch(arr4, 0, last, 11);
	}
	//1. Find All substring of string in java Program
	public String substringOfString(String str, int index) {
		str = str.substring(index);
		return str;
	}
	//2. Print reverse string in java Program
	public String reverseString(String str) {
		String newStr="";
		char ch;
		for(int i=str.length()-1; i>=0; i--) {
			ch = str.charAt(i);
			newStr += ch;
		}
		return newStr;
	}
	//Check Given String is palindrome or Not in java Program (for practicing purposes)
	//Used reverseString method of question two to check for palindrome
	public boolean isPalindrome(String str) {
		
		PracticeQuestionsSet3 p2 = new PracticeQuestionsSet3();
		if(p2.reverseString(str).toLowerCase().equals(str.toLowerCase())) {
			return true;
		}else {
			return false;
		}	
	}
	// 3. Check Given No is palindrome or Not in java Program
		public boolean isNumPalindrome(int n) {
			Integer num = new Integer(n);
			String str = num.toString();
			PracticeQuestionsSet3 p2 = new PracticeQuestionsSet3();
			if(p2.reverseString(str).toLowerCase().equals(str.toLowerCase())) {
				return true;
			}else {
				return false;
			}	
		}
		
		// 4. How to add two matrix in java program
		public void addMatrix(int[][] arr1, int[][] arr2) {
			if(arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
				int[][] sumArr = new int[arr1.length][arr1[0].length];
				for(int i=0; i<arr1.length; i++) {
					for(int j=0; j<arr2.length; j++) {
						sumArr[i][j] = arr1[i][j] + arr2[i][j];
					}
				}
				for(int i=0; i<arr1.length; i++) {
					for(int j=0; j<arr2.length; j++) {
						System.out.print(sumArr[i][j] + "  ");
					}
					System.out.println("");
				}
				
			}else {
				System.out.println("The two arrays aren't the same size");
			}
			
		}
		// 5. Multiplying two matrix (fix for it wo work with all sizes not only square matrix
		public void multiplyMatrix(int[][] arr1, int[][] arr2) {
			int[][] productResult = new int[arr1.length][arr2[0].length];
			for(int i=0; i<arr1.length; i++) {
				for(int j=0; j<arr2[0].length; j++) {
					for(int k=0; k<arr2[0].length; k++) {
						productResult[i][j] += (arr1[i][k] * arr2[k][j]);
					}
					
				}
				
			}
			for(int i=0; i<arr1.length; i++) {
				for(int j=0; j<arr2[0].length; j++) {
					System.out.print(productResult[i][j] + "  ");
				}
				System.out.println("");
			}
		}
		// 6. How to replace string with another string in java Program
		public void replaceString(String str, String replaceStr) {
			str = str.replace(str, replaceStr);
			System.out.println(str);
			
			//if we want to replace a specific string from the given string
			// Hello world to hi world
			
			String eg = "Hello, World!";
			eg = eg.replace("Hello", "Hi");
			System.out.println(eg);
		}
		
		//7. Generate random number
		public void randomNum(int n) {
			Random r = new Random();
			
			int random = r.nextInt(n);
			System.out.println(random);
		}
		
		//8. Binary search Program in java
		public void binarySearch(int[] arr, int first, int last, int key) {
			int mid = (first + last)/2;
			
			while(first <= last) {
				if(arr[mid] < key) {
					first = mid  + 1;
				}else if(arr[mid] == key) {
					System.out.println("Found at index: " + mid);
					break;
				}else {
					last = mid-1;
				}
				mid = (first + last)/2;
			}
			if(first > last) {
				System.out.println("Elt not found");
			}
		}
		
		
}

// 9. How to create Method Overriding program in java
class ParentClass{
	public void display() {
		System.out.println("I am from class A, Parent class");
	}
}
class ChildClass extends ParentClass{
	public void display() {
		System.out.println("I am from class B, Child  class");
	}
}

