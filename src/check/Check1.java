package check;

public class Check1 {

	public static void main(String[] args) {
		
		String s1 = "NareshIT";
		
		String s2 = new String("NareshIT").intern();
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
		
	}
}
