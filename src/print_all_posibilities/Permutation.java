package print_all_posibilities;

public class Permutation {
	
	static void StringPermutation(String input) {
		StringPermutation("",input);
	}
	
	static void StringPermutation(String permutation, String input) {
		if(input.length() == 0) {
			System.out.println(permutation);
		}
		else {
			for(int i=0; i<input.length(); i++) {
				System.out.println(permutation + input.charAt(i) + input.substring(0, i) + input.substring(i+1, input.length()));
			}
		}
	}

	public static void main(String[] args) {
		StringPermutation("abcde");
	}
}
