package reverse;

import java.util.Scanner;

public class Reverse_Word {

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
		String[] st = s1.split(" ");
		String s2 = "";
		for(int i=0; i<st.length; i++) {
			s2 += reverse(st[i]) + " ";
		}
		System.out.println("After Reversed Word : " + s2);
	}
}
