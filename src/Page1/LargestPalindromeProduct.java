package Page1;
//Problem 4
import java.util.ArrayList;
import java.util.List;

public class LargestPalindromeProduct {
	public static boolean isPalindrome(String str) {

		str = str.toUpperCase();
		char[] strChars = str.toCharArray();

		List<Character> word = new ArrayList();
		for (char c : strChars) {
			word.add(c);
		}

		while (true) {
			if ((word.size() == 1) || (word.size() == 0)) {
				return true;
			}
			if (word.get(0) == word.get(word.size() - 1)) {
				word.remove(0);
				word.remove(word.size() - 1);
			} else {
				return false;

			}

		}
	}
	
	static List<Long> palindromes = new ArrayList();
	
	public static void main(String[] args) {
		for (long i = 999; i > 99; i--) {
			for (long j = 999; j > 99; j--) {
				long product = i * j;
				String strProduct = Long.toString(product);
				if (isPalindrome(strProduct)) {
					System.out.println(product + " - " + i + " x " + j + " is a palindrome!!");
					palindromes.add(product);
				}
				else {
					System.out.println(product + " - " + i + " x " + j);
				}
				
			}
		}
		if (palindromes.isEmpty()) {
			System.out.println("No palindromes");
			return;
		}
		
		long largest = palindromes.get(0);
		for (long product : palindromes) {
			if (product > largest) {
				largest = product;
			}
		}
		System.out.println("answer: " + largest);
	}
}
