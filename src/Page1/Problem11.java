package Page1;

import java.util.ArrayList;
import java.util.List;

public class Problem11 {
    private static final char[] NUMBER_CHARS = "08022297381500400075040507785212507791084949994017811857608717409843694804566200814931735579142993714067538830034913366552709523046011426924685601325671370236912231167151676389419236542240402866331380244732609903450244753353783684203517125032988128642367102638406759547066183864706726206802621220956394396308409166499421245558056673992697177878968314883489637221362309750076442045351400613397343133957817532822753167159403800462161409535692163905429635314755588824001754243629855786560048357189070544443744602158515417581980816805944769287392138652177704895540045208839735991607975732162626793327986688366887576220720346336746551232639353690442167338253911249472180846293240627636206936417230238834629969826759857404361620733529783190017431497148868116235705540170547183515469169233486143520189196748"
            .toCharArray();
    private static final List<Integer> PAIRS;
    private static final int SQUARE_SIDE_LENGTH = 40;

    static {
        PAIRS = new ArrayList<>();
        for (int index = 0; index < NUMBER_CHARS.length - 1; index+=2) {
            String first = Character.toString(NUMBER_CHARS[index]);
            String second = Character.toString(NUMBER_CHARS[index + 1]);

            PAIRS.add(Integer.parseInt(first + second));
        }
    }

    public static void main(String[] args) {
        // WARNING, for all values of 3 used, if it isn't correct change to 4.

        // 8*2*22*97 = 34144 (the first 4 pairs' product).
        int greatestProductSoFar = 34144;

        System.out.println(greatestProductSoFar);

        for (int pairIndex = 0; pairIndex < PAIRS.size() - 1.; pairIndex++) {
            System.out.println("pairTest: " + PAIRS.get(pairIndex));

            // Left pairs
            if (!(pairIndex - 4 < 0)) {
                greatestProductSoFar = getGreatestProductSoFar(greatestProductSoFar, getLeft4Pairs(pairIndex));
            }

            // Right pairs
            if (!(pairIndex + 4 > PAIRS.size())) {
                greatestProductSoFar = getGreatestProductSoFar(greatestProductSoFar, getRight4Pairs(pairIndex));
            }

            // Up pairs
            if (!(pairIndex - (40 * 4) < 0)) {
                greatestProductSoFar = getGreatestProductSoFar(greatestProductSoFar, getUp4Pairs(pairIndex));
            }

            // Down pairs
            if (!(pairIndex + (40 * 4) > PAIRS.size())) {
                greatestProductSoFar = getGreatestProductSoFar(greatestProductSoFar, getDown4Pairs(pairIndex));
            }

            // Up/Left Diagonal pairs
            if (!(pairIndex - ((40 + 1) * 4) < 0)) {
                greatestProductSoFar = getGreatestProductSoFar(greatestProductSoFar, getUpLeftDiagonal4Pairs(pairIndex));
            }

            // Up/Right Diagonal pairs
            if (!(pairIndex - ((40 - 1) * 4) < 0)) {
                greatestProductSoFar = getGreatestProductSoFar(greatestProductSoFar, getUpRightDiagonal4Pairs(pairIndex));
            }

            // Down/Left Diagonal pairs
            if (!(pairIndex + ((40 - 1) * 4) > PAIRS.size())) {
                greatestProductSoFar = getGreatestProductSoFar(greatestProductSoFar, getDownLeftDiagonal4Pairs(pairIndex));
            }

            // Down/Right Diagonal pairs
            if (!(pairIndex + ((40 + 1) * 4) > PAIRS.size())) {
                greatestProductSoFar = getGreatestProductSoFar(greatestProductSoFar, getDownLeftDiagonal4Pairs(pairIndex));
            }

            System.out.println(greatestProductSoFar);
        }
    }

    private static int getGreatestProductSoFar(int greatestProductSoFar, List<Integer> pairs) {
        int product = 1;
        for (int pair : pairs) product *= pair;

        if (product > greatestProductSoFar) return product;
        else return greatestProductSoFar;
    }

    private static List<Integer> getLeft4Pairs(int pairIndex) {
        List<Integer> pairs = new ArrayList<>();
        for (int index = pairIndex; index > pairIndex - 4; index--) pairs.add(PAIRS.get(index));
        return pairs;
    }

    private static List<Integer> getRight4Pairs(int pairIndex) {
        List<Integer> pairs = new ArrayList<>();
        for (int index = pairIndex; index < pairIndex + 4; index++) pairs.add(PAIRS.get(index));
        return pairs;
    }

    private static List<Integer> getUp4Pairs(int pairIndex) {
        List<Integer> pairs = new ArrayList<>();
        return pairs;
    }

    private static List<Integer> getDown4Pairs(int pairIndex) {
        List<Integer> pairs = new ArrayList<>();
        return pairs;
    }

    private static List<Integer> getUpLeftDiagonal4Pairs(int pairIndex) {
        List<Integer> pairs = new ArrayList<>();
        return pairs;
    }

    private static List<Integer> getUpRightDiagonal4Pairs(int pairIndex) {
        List<Integer> pairs = new ArrayList<>();
        return pairs;
    }

    private static List<Integer> getDownRightDiagonal4Pairs(int pairIndex) {
        List<Integer> pairs = new ArrayList<>();
        return pairs;
    }

    private static List<Integer> getDownLeftDiagonal4Pairs(int pairIndex) {
        List<Integer> pairs = new ArrayList<>();
        return pairs;
    }
}