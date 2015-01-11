package Page1;

//Problem 9
public class SpecialPythagoreanTriplet {
    public static void main(String args[]) {
        for (int a = 0; a < 499; a++) {
            for (int b = 0; b < 498; b++) {
                double c = Math.sqrt(a * a + b * b);
                if (((a < b) & (b < c)) & ((a + b + c) == 1000)) {
                    System.out.println("Product: " + a * b * (int) c);
                }
            }
        }
    }
}
