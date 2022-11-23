package com.practice;

import java.util.*;
import java.util.Map.*;

public class PracticeQuestionsSet2 {
	
public static void main(String[] args) {
	//Test 
String str = " Hello World! how are you doing? "; 
System.out.println(removeMultileOcc(str)); //remove multiple occurrence of a string

System.out.println(removeWhiteSpace(str)); // remove whitespace
	
 int[] a = {2, 3, 5};
 int[] b= {5, 3, 2};
System.out.println(sameElement(a,b)); //checking  if two arrays contains same elts

	//Third largest int
  int[] nums = {2, 3, 11, 5, 12, 6,9};
  thirdLargest(nums);
  
    SwapNums(3,2); //Swap numbers
	
	sortHashMap(); //sort hash map
	
}
//Remove multiple occurrence 
//Remove All occurrences of given character from String?(Assume Accordingly)
public static String removeMultileOcc(String str) {
	char[] charStr = str.toLowerCase().toCharArray();
	for(int i=0; i<charStr.length -1; i++) {
		for(int j=i+1; j<charStr.length; j++) {
			if(charStr[i] == charStr[j]) {
				charStr[j]=' ';		
			}}}
  String newStr = String.valueOf(charStr);
  String newS = newStr.replaceAll("\\s", "");
  return newS;
}
//2 Swap Numbers
//Swap Two numbers without third variable
public static void SwapNums(int n1, int n2) {
	n1 = n1 + n2;
	n2 = n1-n2;
	n1= n1-n2;
	System.out.println("n1: " + n1 + " &  n2: " + n2);
}
//3. Remove whitespace form a string
public static String removeWhiteSpace(String str) {
	//str = str.trim();
	String newStr = str.replaceAll("\\s", "");
	return newStr;
}
//4. Check if two arrays contains the same elements
public static boolean sameElement(int[] arr1, int[] arr2) {
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	return Arrays.equals(arr1, arr2);
}
//5. Find the 3rd largest element in an integer array
public static void thirdLargest(int[] nums){
    int min=0;
    for(int i=0; i<nums.length-1; i++){
      for(int j=i+1; j<nums.length; j++){
        if(nums[i] > nums[j]){
          min = nums[j];
          nums[j] = nums[i];
          nums[i] = min;
        }
        
      }
    }
  System.out.println("The third largest number is: " + nums[nums.length-3]);
  }
// 6. Sort HashMap
public static void sortHashMap() {
	/*
	 * Steps: 1st Convert the map to entrySet
	 * 		  2nd Then to list
	 * 		  3rd use Collections.sort and pass list and comparator as arg
	 * 		  4th use compareTo method to compare the two objects
	 */
	 Map<Integer, String> map = new HashMap<Integer, String>();
     map.put(1, "Dan");
     map.put(2, "Ananda");
     map.put(3, "Sam");
     map.put(4, "Rijo");
     map.put(4, "Tsion");
     //The map before
     System.out.print("Unsorted Hashmap");
     for(Map.Entry<Integer, String> e: map.entrySet()){
         System.out.println("Key " + e.getKey() + " Value "  + e.getValue());
     }
//Convert HashMap to list
//Or  List<Entry<Integer, String>> l = new LinkedList<Entry<Integer, String>>(map.entrySet());
    
     Set<Entry<Integer, String>> entrySet = map.entrySet();
     List<Entry<Integer, String>> l = new ArrayList(entrySet);
     System.out.println("List"+ l);
  //Collections method that takes list and comparator as an argument
     Collections.sort(l, new Comparator<Entry<Integer, String>>(){
    	 public int compare(Entry<Integer, String> l1, Entry <Integer, String> l2) {	 
    			//compare two object
    			 return l1.getValue().compareTo(l2.getValue());   		 
     }
     });
     System.out.println("Sorted List");
     l.forEach(sl -> System.out.println(sl)); 
}
//Write a java code to check balanced parentheses in an expression using stack.
}
