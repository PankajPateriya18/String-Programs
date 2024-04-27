/*Write a method which accepts two string parameters, 
 * find out the count the number of 
occurrence of second parameter in the first parameter
Method Name countWord
Argument String and String
Return Type Int
Example First parameter: hello world, world is wonderful
Second parameter: world*/

package count_words;

import java.util.Scanner;

public class CountWord {
	
	static int count(String s1, String s2) {
		int i, j, c=0, count=0, s2l = s2.length();
		char ch1, ch2;
		for(i=0; i<s1.length(); i++) {
			ch1 = s1.charAt(i);
			ch2 = s2.charAt(0);
			count=0;
			if(ch1 == ch2) {
				
				for(j=0; j<s2l; j++, i++) {
					ch1 = s1.charAt(j);
					ch2 = s2.charAt(j);
					if(ch1 == ch2) count++;
				}
			}
			if(count == s2l) c++;
		}
		return c;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s1 = sc.nextLine();
		System.out.print("Enter Word : ");
		String s2 = sc.next();
		int count = CountWord.count(s1, s2);
		System.out.println("Total Times Are : " + count);
		
	}
}
