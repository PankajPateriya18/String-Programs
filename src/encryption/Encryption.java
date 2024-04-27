package encryption;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s1 = sc.next();
		int i, j;
		char ch;
		String s2="";
		for(i=0; i<s1.length(); i++) {
			ch = s1.charAt(i);
			if(65 <= ch && ch <= 90) {
				ch = (char)(ch+32);
				ch = (char)(ch+9);
				if(ch > 122) {
				  	ch = (char)((ch-122)+96);
				}
			}
			else if(97 <= ch && ch <= 122) {
				ch = (char)(ch-32);
				ch = (char)(ch+9);
				if(ch > 90) {
				  	ch = (char)((ch-90)+64);
				}
			}
			s2 += ch;
		}
		System.out.println("Encrypted String is : " + s2);
	}
}
