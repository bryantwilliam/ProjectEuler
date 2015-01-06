package Page1;
//Problem 9
public class SpecialPythagoreanTriplet {
    public static void main(String args[]) {
        int a = 3;
        int b = 4;
        System.out.println(getC(a, b));
    }

    public static int getC(int a, int b) {
        int c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        return c;
    }
}
