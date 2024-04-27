//  first String : AGGTAB
//  second String : GXTXAYB = 4

// KTEURFJS
// TKWIDEUJ = 4

package longest_comman_subsequence;

import java.util.Scanner;

public class LongestCommanSubsequence {
	
	static int commanSubsequence(String s1, String s2) {
		int i, j, count=0, lSub=0;
		char ch1, ch2;
		String s="";
		for(i=0; i<s1.length(); i++) {
			ch1 = s1.charAt(i);
			s :for(j=count; j<s2.length(); j++) {
				ch2 = s2.charAt(j);
				if(ch1 == ch2) {
					count=j;
					lSub++;
					s += ch2;
					break s;
				}
			}
		}
		System.out.println(s);
		return lSub;
	} 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Word : ");
		String f = sc.next();
		System.out.print("Enter Second Word : ");
		String s = sc.next();
		int count = commanSubsequence(f, s);
		System.out.println("Longest Comman Subsequence is : " + count);
	}
}
