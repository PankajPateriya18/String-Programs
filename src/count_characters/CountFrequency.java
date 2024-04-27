package count_characters;

import java.util.Scanner;

public class CountFrequency {
	
	static void printFrequency(String s) {
		int i, j, count;
		char ch1, ch2;
		char[] ch = new char[s.length()];
		for(i=0; i<ch.length; i++) {
			ch[i] = s.charAt(i);
		}
		int[] f = new int[ch.length];
		for(i=0; i<ch.length; i++) {
			count=0;
			ch1 = ch[i];
			if(ch1 != '#') {
				count=1;
				for(j=i+1; j<ch.length; j++) {
					ch2 = ch[j];
					if(ch1 == ch2) {
						count++;
						ch[j] = '#';
					}
				}
			}
			f[i] = count;
		}
		System.out.println("Character\tFrequency");
		for(i=0; i<ch.length; i++) {
			if(f[i]!=0) {
				System.out.println("    "+ch[i] + " \t\t   " + f[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s1 = sc.nextLine();
		
		printFrequency(s1);
	}
}
