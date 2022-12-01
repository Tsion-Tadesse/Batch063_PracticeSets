package com.practiceStream;

import java.util.*;
public class ProblemSet5 {

	public static void main(String[] args) {
		ProblemSet5 p= new ProblemSet5();
	int[][] arr = {{1, 2, 3, 4}, {4, 5, 6, 4}, {7, 8, 9, 5}, {10, 20, 30, 40}};
	int[][] arr2 ={{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
	int[][] arr3 ={{1, 1, 1}, {1, 2, 1}, {1, 1, 1}};
	System.out.println(arr.length);
	p.printArray(arr);
	
	p.addMatixes(arr, arr2);
	
	 p.transpose(arr);
	
	 //checking both cases for matrices equality check
	boolean check =  p.areMaticesEqual(arr, arr2);
	System.out.println("Are the two matrices equal: " + check);
	boolean check2 =  p.areMaticesEqual(arr2, arr2);
	System.out.println("Are the two matrices equal: " + check2);
	
	
	p.sumDiagonals(arr3);
	int[][] arr4={{1, 1, 1}, {1, 2, 1}, {1, 1, 9}};
	System.out.println("Origonal Matrix");
	
	for(int i=0; i<arr4.length; i++) {
		for(int j=0; j<arr4[0].length; j++) {
			System.out.print(arr4[i][j] + " ");
		}
		System.out.println("");
	}
	System.out.println("After interchanging first - last");
	p.interchangeFirstLasr(arr4);
	
	int[][] arr5={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	System.out.println("Origonal Matrix");
	for(int i=0; i<arr5.length; i++) {
		for(int j=0; j<arr5[0].length; j++) {
			System.out.print(arr5[i][j] + " ");
		}
		System.out.println("");
	}
	System.out.println("After interchanging first - last Across column");
	p.interchangeAcross(arr5);
	int[][]  a = {{1,3,5}, {4, 2, 6}, {5, 9, 2}};
	p.CalcTraceNormal(a);
	}
//1. WAP to print a 2d array
	public void printArray(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
//2. Add two matrixes
	public void addMatixes(int[][] m1, int[][]m2) {
		int[][] sum = new int[m1.length][m1[0].length];
		if(m1.length == m2.length && m1[0].length == m2[0].length) {
			for(int i=0; i<m1.length; i++) {
				for(int j=0; j<m2[0].length; j++) {
				sum[i][j] = m2[i][j] + m1[i][j];
				}
				}
			System.out.println("The Sum of the two arrays is: ");
			for(int i=0; i<sum.length; i++) {
				for(int j=0; j<sum[0].length; j++) {
					System.out.print(sum[i][j] + " ");
				}
				System.out.println("");
			}
		}else {
			System.out.println("The size of the array is not same, can't be added");
		}
			
	}
//4. Check if two matrices are equal or not
	public boolean areMaticesEqual(int[][] m1, int[][]m2) {
		boolean areEqual=true;
		if(m1.length == m2.length && m1[0].length == m2[0].length) {
			for(int i=0; i<m1.length; i++) {
				for(int j=0; j<m2[0].length; j++) {
					if(m1[i][j] != m2[i][j]) {
						areEqual = false;
						break;
					}
				}
				}
		}else {
			areEqual = false;
		}
		return areEqual;
	}
//5. FInd the 
public void transpose(int[][] arr) {
	int[][] transpose = new int[arr[0].length][arr.length];
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr.length; j++) {
			transpose[i][j] = arr[j][i];
		}
		}
	for(int i=0; i<transpose.length; i++) {
		for(int j=0; j<transpose[0].length; j++) {
			System.out.print(transpose[i][j] + " ");
		}
		System.out.println("");
	}

}
//10. find the sum of diagnosis of a matrix
public void sumDiagonals(int[][] arr) {
	int sum =0;
	if(arr.length == arr[0].length) {
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[0].length; j++) {
			
			if(i==j) {
				sum += arr[i][j];
			}
		}
		}
	System.out.println("The sum of the diagonal element is: " + sum);
		}else {
			System.out.println("The matrix is not square, so can't determine the sum of the diagonals");
			
		}
	
}
//7. find the Normal and Trace of a matrix
	//Normal is a the square root of the sum of all entity square
	// Trace is the sum of the diagonal element
public void CalcTraceNormal(int[][] arr) {
	int trace =0;
	double sumOfElements = 0.0;
	double normalResult;
	if(arr.length == arr[0].length) {
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[0].length; j++) {
			sumOfElements += Math.pow(arr[i][j], 2);
			System.out.println(sumOfElements);
			if(i==j) {
				trace +=  arr[i][j];
			}
		}
		}
	normalResult = Math.sqrt(sumOfElements);
	System.out.println("The Trace is: " + trace);
	System.out.println("The Normal is: " + normalResult);
		}else {
			System.out.println("The matrix is not square, so can't determine the trace and normal");
			
		}
}

//11. Interchange the first and last elements of a matrix
public void interchangeFirstLasr(int[][] arr) {
	int firstElement = 0;
	int lastElement = 0;
	firstElement = arr[0][0];
	lastElement = arr[arr.length-1][arr[0].length-1];
	arr[arr.length-1][arr[0].length-1] = firstElement;
	arr[0][0] = lastElement;
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[0].length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println("");
	}
		
		
		}


//12 Interchange the first and last elements in a matrix across the column
public void interchangeAcross(int[][] arr) {
	int firstElement = 0;
	int lastElement = 0;
	for(int i=0; i<arr.length; i++) {
		firstElement = arr[i][0];
		for(int j=0; j<arr[0].length; j++) {
			lastElement = arr[i][arr[0].length-1];
		}
		arr[i][0] = lastElement;
		arr[i][arr[0].length-1] = firstElement;
		}
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[0].length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println("");
	}
}

}

//6. FInd the determinant
//public void calcDeterminat(int[][] arr) {
//	int determinant=0;
//	//check if the matrix is square
//	if(arr.length == arr[0].length) {
//		if(arr.length == 2) {
//			for(int i=0; i<arr.length; i++) {
//				
//				}
//		}else {
//			
//		}
//		
//	}else {
//		System.out.println("The matrix is not square, so can't determine the Determinant");
//	}
//}



