package Page1;

public class Problem12 {
    public static void main(String[] args) {
       for (long index = 1; true; index++) {
            int triangleNumber = 0;
            for (long next = 0; next <= index; next++) triangleNumber += next;
            System.out.print("index: " + index + ", triangle number: " + triangleNumber);
            if (getFactorAmount(triangleNumber) >= 500) break;
        }
    }

    private static long getFactorAmount(long number) {
        if (number == 0 || number == 1) return number;

        long factorAmount = 0;

        long limit = number;
        for (long possibleFactor = 1; possibleFactor <= limit; possibleFactor++) {
            if (number % possibleFactor == 0) {
                limit = number / possibleFactor;
                if (limit != number) factorAmount++;
                factorAmount++;
            }
        }
        System.out.println(", factors: " + factorAmount);
        return factorAmount;
    }

    // ANSWER: index: 12375, triangle number: 76576500, factors: 577

}



