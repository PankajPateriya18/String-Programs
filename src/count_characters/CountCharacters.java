package count_characters;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Count Vowels, Consonent, Numbers, Special Characters, spaces");
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		
		int v=0, c=0, n=0, sp=0, space=0;
		char ch;
		
		for(int i=0; i<s.length(); i++) {
			ch = s.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') v++;
			else if(48 <= ch && ch <= 57) n++;
			else if(ch == 32) space++;
			else if((65 <= ch && ch <= 90) || (97 <= ch && ch <= 122)) c++;
			else sp++;
		}
		
		System.out.println("\nString is : " + s);
		System.out.println("Total Vowels : " + v);
		System.out.println("Total Consonent : " + c);
		System.out.println("Total Numbers : " + n);
		System.out.println("Total Spaces : " + space);
		System.out.println("Total Special Characters : " + sp);
	}
}
