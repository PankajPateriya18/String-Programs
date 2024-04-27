/*Write a method which accepts an email in a form of String 
and validate that email values based on the following rules
1) There should be only one @
2) There should be one com
3) There should be only 5 characters between @ and .
Method Name validateEmail
Argument String 
Return Type Boolean 
 * */

package email_validation;

import java.util.Scanner;

public class CheckEmail {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Email : ");
		String s1 = sc.next();
		
		int i, count=0, ati=0, at=0, dec=0;
		char ch;
		for(i=0; i<s1.length(); i++) {
			ch = s1.charAt(i);
			if(ch == '@') {
				at++;
				ati=i;
			}
			else if(ch == '.')  dec=i;
		}
		for(i=ati+1; i<dec; i++) {
			count++;
		}
		String co = s1.substring(dec+1, s1.length());
		if(at == 1 && count == 5 && co.equals("com")) {
			System.out.println("Email is Valid");
		}else {
			System.out.println("Email is Not Valid");
		}
		
		
	}
}
