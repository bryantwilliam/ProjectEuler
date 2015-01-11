package Page1;

//Problem 2
class EvenFibonacciNumbers {
	public static void main(String[] r) {
		int a = 1, b = 2, c, s = 0;
		while (b < 4000000) {
			s += b;
			c = a + b;
			a = b + c;
			b = a + c;
		}
		System.out.println(s);
	}
}