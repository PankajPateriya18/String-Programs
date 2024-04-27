package palindrom;

import java.util.Scanner;

public class CheckPalindrom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter String : ");
		
		String s = "madam is a racecar";
		
		String[] st = s.split(" ");
		
		String tp1, ans="";
		int i, j;
		for(i=0; i<st.length; i++) {
			tp1 = "";
			if(st[i].length() > 2) {
				for(j=st[i].length()-1; j>=0; j--) {
					char ch = st[i].charAt(j);
					tp1 += ch; 
				}
				if(tp1.equals(st[i])) ans += st[i] + ", ";
			}
		}
		System.out.println(ans);
	}
}
