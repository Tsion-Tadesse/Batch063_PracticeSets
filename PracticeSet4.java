/*
 * Author: Tsion Tadesse
 * Date: 11-20-2022
 */
package com.practiceStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class PracticeSet4 {
	
public static void main(String[] args) {
	
	PracticeSet4 p = new PracticeSet4();
	int[] nums = {100, 2, 5, 1, 3, 4, 7};
	p.searchElement(nums, 1);
	p.largestArrayElement(nums);
	p.sortArray(nums);
	System.out.println();
	p.sortArrayDes(nums);
	System.out.println();
	int[] sorted = p.sortAscendingOrder(nums);
	System.out.println("\nSort in Ascending Order: ");
	for(int i=0; i<sorted.length; i++) {
		System.out.print(sorted[i] + " ");
	}
	System.out.println();
	int[] nums2 = {100, 2, 5, 1, 3, 4, 7, 3, 4,2,100, 11};
	int[] n = {12, 14};
	int[] n2 = {14, 12};

	p.removeDuplicate(nums2);
	p.mergeArrays(nums, n);
	
	System.out.println("\nAre the two Arrays Equal: ");
	boolean isSameArr = p.checkForEqualArrays(n2, n2);
	System.out.println(isSameArr);
	System.out.println("Array before removing duplicates");
	for(int i: nums2) {
		System.out.print(i + " ");
	}
	p.removeMultipleOccurences(nums2);
	int[] a = {1, 2, 4};
	int [] b = {1, 5,6, 3};
	System.out.print(" \nThe common elements: ");
	p.findCommonElement(a, b);
	
	p.copyArray(b);
	int [] numbers = {1, 5,6, 3, 2, 7};
	System.out.println("Origional Array before rotation");
	for(int i: numbers) {
		System.out.print(i + " ");
	}
	System.out.println("\nRotated Array");
	
	p.rotateArray(numbers, 2);
}
//1WAP to Search an Element in an Array
public void searchElement(int[] arr, int n) {
	for(int i=0; i<arr.length;i++) {
		if(arr[i] == n) {
			System.out.println(n +" is at index : " + i);
			break;
		}
	}
}
//2WAP to Find the Largest Element in an Array
//Sort in ascending order first then return the last element
public void largestArrayElement(int[] nums) {
	int minHolder=0;
	for(int i=0; i<nums.length-1; i++) {
		for(int j=i+1; j<nums.length; j++) {
			if(nums[i] > nums[j]) {
				minHolder = nums[j];
				nums[j] =nums[i];
				nums[i] = minHolder;
				
			}
		}
	}
	System.out.println("\nMax Element from the array is: " + nums[nums.length-1]);
}
//sort using selection sort
public void sortArray(int[] nums) {
	
	for(int i=0; i<nums.length-1; i++) {
		int min_index=i;
		for(int j=i+1; j<nums.length; j++) {
			if(nums[j] < nums[min_index]) {
				min_index = j;
			}
			int temp=nums[min_index];
			nums[min_index] = nums[i];
			nums[i] = temp;
			
				
		}
	}
	System.out.print("Sorted array: ");
	for(int k=0; k<nums.length; k++) {
	System.out.print(nums[k] + "  ");
}	
}
//sort using selection sort
public void sortArrayDes(int[] nums) {
	
	for(int i=0; i<nums.length-1; i++) {
		int max_index=i;
		for(int j=i+1; j<nums.length; j++) {
			if(nums[j] > nums[max_index]) {
				max_index = j;
			}
			int temp=nums[max_index];
			nums[max_index] = nums[i];
			nums[i] = temp;		
		}
	}
	System.out.print("Sorted array in descending order: ");
	for(int k=0; k<nums.length; k++) {
	System.out.print(nums[k] + "  ");
}
	
}
//5WAP to Sort the Elements of an Array in Ascending Order
public int[] sortAscendingOrder(int[] nums) {

		int minVal=0;
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] > nums[j]) {
					minVal = nums[j];
					nums[j] =nums[i];
					nums[i] = minVal;	
				}
			}
		}
		return nums;
	}	
//6WAP to Remove Duplicate Elements From an Array
public void removeDuplicate(int[] nums) {
	Set<Integer> noDuplicate = new TreeSet<Integer>();
	for(int i: nums) {
		noDuplicate.add(i);
	}
	System.out.println(noDuplicate);
}

//merge two arrays
/*
 * List<String> streamConact = Stream.concat(stream1, stream2).collect(Collectors.toList());
 */
public void mergeArrays(int[] arr1, int[] arr2) {
	//  first convert it to collection 
	// -> then Collection to stream 
	// -> then use concat() method to combine
	List<Integer> list1 = new ArrayList<Integer>();
	for(int i: arr1) {
		list1.add(i);
	}
	List<Integer> list2 = new ArrayList<Integer>();
	for(int i: arr2) {
		list2.add(i);
	}
	
	Stream stream1 = list1.stream();
	Stream stream2 = list2.stream();
	
	List<Integer> intConcat = (List<Integer>) Stream.concat(stream1, stream2).collect(Collectors.toList());
	System.out.println(intConcat);
	int[] combinedArr = new int[intConcat.size()];
	combinedArr = intConcat.stream().mapToInt(i->i).toArray();
	System.out.println("Combined array: ");
	for(int i: combinedArr) {
		System.out.print(i + " ");
	}
}
public boolean checkForEqualArrays(int[] arr1, int[] arr2) {
	//check if the size o the two arrays is the same
	//sort and then check for each element equality (will use helper function sortAscendingOrder
	boolean isEqual = true;
	if(arr1.length == arr2.length) {
		 //arr1.sortAscendingOrder();
		int[] a1 = sortAscendingOrder(arr1);
		int[] a2 = sortAscendingOrder(arr2);
		
		for(int i=0; i<arr1.length; i++) {
			if(a1[i] != a2[i]) {
				isEqual = false;
				break;
			}
		}
		
	}else {
		isEqual = false;
	}
	return isEqual;
}
//9WAP to Remove All Occurrences of an Element in an Array
public void removeMultipleOccurences(int[] arr) {
	//Here i'll put to it to hashset, 
	Set<Integer> setVals = new HashSet<Integer>();
	for(int i: arr) {
		setVals.add(i);
	}
	System.out.println("\nArray without duplicate: \n" + setVals);
	
	
}
//find common array element
public void findCommonElement(int[] arr1, int[] arr2) {
	
	for(int i=0; i<arr1.length; i++) {
		for(int j=0; j<arr2.length; j++) {
			if(arr1[i] == arr2[j]) {
				System.out.print(arr1[i] + " ");
			}
			
		}
	}
}
//11WAP to Copy All the Elements of One Array to Another Array
public void copyArray(int[] arr1) {
	int[] arr2 = new int[arr1.length];
	arr2 = arr1;
	System.out.println("The copied array");
	for(int i: arr2) {
		System.out.print(i + " ");
	}
}
// 12WAP For Array Rotation 
public void rotateArray(int[] arr, int d) {
	int[] newArr = new int[arr.length];
	int l = 0;
	for(int i=d; i<arr.length; i++) {
		newArr[l] = arr[i];
		l++;
	}
	for(int j=0; j<d; j++) {
		newArr[l] = arr[j];
		l++;
	}
	for(int i=0; i<arr.length; i++) {
		arr[i] =newArr[i];	
	}
	for(int i: arr) {
		System.out.print(i + " ");
	}
	
	
		
	
}
@Override
public String toString() {
	return "PracticeSet4 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}

}
/*
 * 11WAP to Copy All the Elements of One Array to Another Array
        12WAP For Array Rotation
 */
