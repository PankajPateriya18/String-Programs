package remove_duplicates;

import java.util.Scanner;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Line : ");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		int i, j, len = ch.length;
		
		for(i=0; i<len; i++) {
			for(j=i+1; j<len; j++) {
				if(ch[i] == ch[j]) {
					ch[j] = ch[len-1];
					len--;
					j--;
				}
			}
		}
		
		String res = "";
		for(i=0; i<len; i++) {
			res += ch[i];
		}
		System.out.println(res);
	}
}
