import java.util.*;

public class Problem2 {
    public static int[] calculateSeats(int[][] bookings, int n) {
        int[] seats = new int[n];

        for (int[] booking : bookings) {
            int start = booking[0] - 1;
            int end = booking[1] - 1;
            int seatsCount = booking[2];

            seats[start] += seatsCount;
            if (end + 1 < n) {
                seats[end + 1] -= seatsCount;
            }
        }

        for (int i = 1; i < n; i++) {
            seats[i] += seats[i - 1];
        }

        return seats;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] bookings = {
            {1, 2, 10},
            {2, 3, 20},
            {2, 5, 25}
        };

        int[] result = calculateSeats(bookings, n);
        System.out.println(Arrays.toString(result));
    }
}  
    
    

