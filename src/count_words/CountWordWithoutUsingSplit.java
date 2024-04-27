package count_words;

import java.util.Scanner;

public class CountWordWithoutUsingSplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s1 = sc.nextLine();
		String s2 = s1.trim();
		int count=1;
		System.out.println("String is : " + s2);
		for(int i=0; i<s2.length()-1; i++) {
			
			if(s2.charAt(i) == ' ' && s2.charAt(i+1) != ' ') count++;
		}
		System.out.println("Total Words in String is : " + count);
	}
}
