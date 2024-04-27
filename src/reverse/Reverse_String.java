package reverse;

import java.util.Scanner;

public class Reverse_String {

	static String reverse(String s1) {
		String s2 = "";
		int i;
		for(i=s1.length()-1; i >= 0; i--) {
			s2 += s1.charAt(i);
		}
		return s2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s1 = sc.nextLine();
		
		String s2 = reverse(s1);
		System.out.println("\nReversed String is : " + s2);
		
	}
}
