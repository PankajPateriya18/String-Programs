package sorting;

import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Line : ");
		
		String s = sc.nextLine();
		
		s = s.trim();
		
		String[] st = s.split(" ");
		
		String tp;
		int i, j;
		for(i=0; i<st.length; i++) {
			
			for(j=i+1; j<st.length; j++) {
				
				if(st[i].charAt(0) > st[j].charAt(0)) {				
					tp = st[i];
					st[i] = st[j];
					st[j] = tp;
				}
			}
		}
		System.out.print("Sorted String is : ");
		for(i=0; i<st.length; i++) {
			System.out.print(st[i] + " ");
		}
	}
}
