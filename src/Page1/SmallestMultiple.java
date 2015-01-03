package Page1;

//Problem 5
public class SmallestMultiple {
	public static void main(String[] args) {
		boolean solved = false;
		int num = 1;
		while (!solved) {
			int numbersTested = 0;
			for (int i = 1; i < 20; i++) {
				if (num % i != 0) {
					break;
				}
				else {
					numbersTested++;
					if (numbersTested == 19) {
						System.out.println(num);
						solved = true;
					}
				}
			}
			num++;
		}
	}
}
