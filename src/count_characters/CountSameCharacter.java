/*Write a method which accepts take two input strings 
and find whether the second input string has 
all characters within the first input string
(it should also include duplicated)
Method Name sameCharacter
Argument String and String
Return Type Boolean
Example Input:
String 1: eat
String 2: tea
Output: true
*/

package count_characters;

import java.util.Scanner;

public class CountSameCharacter {
	
	static boolean count(String s1, String s2) {
		int i, j, count=0, sl = s1.length();
		if(s1.length() != s2.length()) return false;
		char ch1, ch2;
		for(i=0; i<s1.length(); i++) {
			ch1 = s1.charAt(i);
			for(j=0; j<s2.length(); j++) {
				ch2 = s2.charAt(j);
				if(ch1 == ch2) count++;
			}
		}
		
		if(count == sl) return true;
		else return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Word : ");
		String s1 = sc.next();
		System.out.print("Enter Second Word : ");
		String s2 = sc.next();
		
		boolean r = count(s1, s2);
		System.out.print("All Characters match : " + r);
	}
}
