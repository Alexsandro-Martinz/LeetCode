package problems.easy.solutions;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(10));
	}
	
	public static boolean isPalindrome(int x) {
		String number = String.valueOf(x);
		String revertNumber = new StringBuilder(number).reverse().toString();
		return number.equals(revertNumber);
	}
	
}
