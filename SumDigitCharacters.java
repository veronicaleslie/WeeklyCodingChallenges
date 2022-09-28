////// Problem statement
////// Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.
////
////// Input
////
////
////
////// The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
////
////// Each test case is described with a single line containing a string S, the alphanumeric string.
////
////// Output
////
////
////
////// For each test case, output a single line containing the sum of all the digit characters in that string.
////
////// Constraints
////
////
////
////// 1 ≤ T ≤ 1000
////
////// 1 ≤ |S| ≤ 1000, where |S| is the length of the string S.
////
////// Example
////// Input:
////// 1
////// ab1231da
////// Output:
////// 7
////
////// Explanation
////// The digits in this string are 1, 2, 3 and 1. Hence, the sum of all of them is 7.
////
////
////import java.util.Scanner;
////
////class SumDigitCharacters {
////
////
////    public SumDigitCharacters(String A) {
////    }
////
////    private static int findSum(String A)
////    {
////
////        char num;
////        int a = 1;
////        String temp = "";
////
////
////        int sum = 0;
////
////
////        for (int i = 0; i < A.length(); i++) {
////            num = A.charAt(i);
////
////
////            if (Character.isDigit(num)) {
////                a = Character.getNumericValue(num);
////                sum += a;
////
////            } else {
////                temp += A.charAt(i);
////                sum += Integer.parseInt(temp);
////                temp = "";
////            }
////        }
////
////
////        return sum;
////    }
////
////
//////    public static void main(String[] args)
//////    {
//////
//////
//////        String str = "ab1231da";
//////
//////
//////        System.out.println(findSum(str));
//////    }
//////}
//
//import java.util.Scanner;
//
//public class SumDigitCharacters {
//
//    private static int sumOfDigits(String A) {
//
//        int sum = 0;
//        char num ;
//        int a;
//
//
//        for(int i=0; i<A.length(); i++) {
//
//           a = A.charAt(i);
//
//
//            if(Character.isDigit(num)){
//                a= Character. getNumericValue(num);
//
//                sum += a;
//            }
//        }
//
//
//        return sum;
//    }
//
//    public static void main(String[] args) {
//
//
//        String A = null;
//        int sum = 0;
//
//
//        Scanner scan =  new Scanner(System.in);
//
//
//        System.out.print("Enter String: ");
//        A = scan.next();
//        sum = sumOfDigits(A);
//
//        System.out.println("The sum of "
//                +" digits in the string "+A
//                +" = "+ sum);
//
//
//        scan.close();
//    }
//}