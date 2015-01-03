package Page1;
//Problem 3
import java.util.ArrayList;
import java.util.List;

class LargestPrimeFactor {
	static long N = 600851475143L;

	public static void main(String a[]) {
		System.out.println("the prime factors of " + N + " are:");
		List<Long> f = new ArrayList<Long>();
		for (long i = 2; i <= N; i++) {
			while (N % i == 0) {
				f.add(i);
				N /= i;
			}
		}
		if (f.isEmpty()) {
			System.out.println("No prime factors");
			return;
		}
		long l = f.get(0);
		for (long i : f) {
			System.out.println(i);
			if (i > l) {
				l = i;
			}
		}
		System.out.println("the largest prime factor is " + l);
	}
}