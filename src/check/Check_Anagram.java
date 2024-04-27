/*Write a java program to check whether two given strings 
 * are anagram or not. Two strings are said to be anagram 
 * if they contain same set of characters but in different 
 * order. For example, “Mother In Law” and “Hitler Woman” 
 * are anagrams. These type of java programming questions 
 * test the coding skills of a candidate.*/

package check;

import java.util.Scanner;

public class Check_Anagram {
	
	static boolean check(String f, String s) {
		String s1="", s2="";
		f = f.toLowerCase();
		s = s.toLowerCase();
		int i, j, count=0, c;
		for(i=0; i<f.length(); i++) {
		   if(f.charAt(i) != ' ') {
			   s1 += f.charAt(i);
		   }
		}
		for(i=0; i<s.length(); i++) {
			   if(s.charAt(i) != ' ') {
				   s2 += s.charAt(i);
			   }
		}
		if(s1.length() != s2.length()) return false;
		char ch1, ch2;
		for(i=0; i<s1.length(); i++) {
			ch1 = s1.charAt(i);
			c = 0;
			for(j=0; j<s2.length(); j++) {
				ch2 = s2.charAt(j);
				if(ch1 == ch2) c++;
			}
			if(c >= 1) count++;
		}
		if(count == s1.length()) return true;
		else return false;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String : ");
		String f = sc.nextLine();
		System.out.print("Enter Second String : ");
		String s = sc.nextLine();
		boolean result = check(f, s);
		System.out.print("Strings are Anagram : " + result);
	}
}
