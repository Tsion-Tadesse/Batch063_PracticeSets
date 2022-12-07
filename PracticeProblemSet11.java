package com.practiceSet;
import java.util.*;
/*
 * Author: Tsion Tadesse
 * Date: 12-07-2022
 */
public class PracticeProblemSet11 {

	public static void main(String[] args) {
		System.out.println("Practie Set 11");
		String s = " Hi hello world how are you";
		String rev = reverseStr("Cogent");
		System.out.println("Reversed String: " + rev);
		
		int count = countNumOfWords(s);
		System.out.println("\nThe Number of word in a string is: " + count);
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Michigan");
		m.put(2, "Cali");
		m.put(3, "New York");
		System.out.println("\nThe key, Value pair:");
		iterateHashMap(m);
		
		duplicateChars(s);
		
		removeWhiteSpace(s);
		
		removeVowels(s);	
	}
//1) Write a Java Program to reverse a string without using String inbuilt function.
	public static String reverseStr(String str) {
		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			newStr += c;
		}
		return newStr;
	}
//2) Write a Java Program to count the number of words in a string using HashMap.
		public static int countNumOfWords(String str) {
			str = str.trim();
			  String[] sArray = str.split(" ");
			   Map<Integer, String> map = new HashMap<Integer, String>();
			for(int i=0; i<sArray.length; i++ ){
			  map.put(i, sArray[i]);
			}
			  return map.size();
		}
	
// 3) Write a Java Program to iterate HashMap using While and advance for loop
	public static void iterateHashMap(Map<Integer, String> m) {
		for(Map.Entry<Integer, String> e: m.entrySet()) {
			System.out.println("Key: " + e.getKey() +  " Value: " + e.getValue());
		}
	}
//4) Write a Java Program to find the duplicate characters in a string.
	public static void duplicateChars(String str) {
		Set<Character> c = new LinkedHashSet<Character>();
		str = str.trim();
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i) == ' ' || str.charAt(j) == ' ') {
					continue;
				}else if(str.charAt(i) == str.charAt(j)) {
					c.add(str.charAt(i));
				}
			}
		}
		System.out.println("\nDuplicate characters in a string: " + c);
	}
	
//5) Write a Java Program to remove all white spaces from a string without using replace().	
	public static void removeWhiteSpace(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				continue;
			}else {
				newStr += str.charAt(i);
			}
		}
		System.out.println("\nThe string after the whitespace is removed: " + newStr);
	}
	
//6 Java Program to Remove Vowel from Given String
	public static void removeVowels(String s) {
		String newStr = "";
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				continue;
			} else {
				newStr += s.charAt(i);
				// System.out.print(s.charAt(i));
			}
		}
		System.out.println("\nThe string after the vowels are removed: "+ newStr);
	}
}
