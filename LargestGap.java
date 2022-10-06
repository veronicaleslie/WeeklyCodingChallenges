package WeeklyCodingChallenges;
import java.util.Arrays;

//Given an array of integers, return the largest gap between the sorted elements of the array.
//
//        For example, consider the array:
//
//
//        [9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]
//
//
//        ... in which, after sorting, the array becomes:
//
//
//        [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
//
//
//        ... so that we now see that the largest gap in the array is between 9 and 20 which is 11.
//
//
public class LargestGap {

    private static int LargestGap(int[] A, int N) {
        int result = 0;
        int max = A[1] - A[0];

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                Arrays.sort(A);
                result = A[j] - A[i];
                if (result > max) {
                    max = result;
                }

            }
            return result;

        }
        return result;
    }

        static public void main (String[]args)
        {
            int[] A = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};

            int N = A.length;
            System.out.println("Largest gap is : " +
                    LargestGap(A, N));
        }
    }


