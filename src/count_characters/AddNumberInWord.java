/*Write a method which accepts a string with 
 the combination of characters and digits, 
 find out 
sum of digits in string
Method Name sumOfDigits
Argument String 
Return Type Int
Example Input1:
ca21
Output:
2+1=3*/
package count_characters;

import java.util.Scanner;

public class AddNumberInWord {
	
	static int add(String s) {
		int i, ad=0;
		char ch;
		for(i=0; i<s.length(); i++) {
			ch = s.charAt(i);
			if(48 <= ch && ch <= 57) ad += (ch-48);
		}
		return ad;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Word : ");
		String s = sc.next();
		int addition = add(s);
		System.out.println("Addition is : " + addition);
	}
}
