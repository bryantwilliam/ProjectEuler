package Page1;

//Problem 7
public class Problem7 {
	public static final int PRIME_INDEX = 10001;

	public static void main(String[] args) {
		int amountPrimesFound = 0;
		int primeGuess = 2;

		while (amountPrimesFound < PRIME_INDEX) {

			boolean testFailed = false;
			for (int i = 2; i < primeGuess; i++) {
				if (primeGuess % i == 0) {
					testFailed = true;
				}
			}
			if (testFailed == false) {
				if (amountPrimesFound == PRIME_INDEX - 1) {
					System.out.println(primeGuess);
				}

				amountPrimesFound++;

			}
			primeGuess++;
		}

	}
}
