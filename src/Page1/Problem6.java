package Page1;

//Problem 6
public class Problem6 {
	public static void main(String[] args) {
		int sumOfSquares = 0;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sumOfSquares += Math.pow(i, 2);
			sum += i;
		}
		System.out.println((int) Math.pow(sum, 2) - sumOfSquares);

	}
}
