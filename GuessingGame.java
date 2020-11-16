package BinarySearch;

public class GuessingGame {
    public static void main(String[] args) {
        int answer = 78; // user's number that they're thinking of

        int lo = 1;
        int hi = 100; // guessing a number between 1 and 100

        while (lo <= hi) {
            int mid = (lo + hi) / 2; // mid is the guess our program is making
            System.out.println(mid);
            if (mid == answer) {
                System.out.println("Found " + mid);
                break;
            } else if (mid < answer) {
                // our guess was too small
                lo = mid + 1;
            } else {
                // guess was too high
                hi = mid - 1;
            }
        }

    }
}
