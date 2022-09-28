package WeeklyCodingChallenges;
// Problem Statement
// Write a program that accepts sets of three numbers and prints the second-maximum number among the three.

// Input

	
// First line contains the number of triples, N.
	
// The next N lines which follow each have three space separated integers.

// Output
// For each of the N triples, output one new line which contains the second-maximum integer among the three.

// Constraints


	
// 1 ≤ N ≤ 6
	
// 1 ≤ every integer ≤ 10000
	
// The three integers in a single triplet are all distinct. That is, no two of them are equal.

// Sample Input
// 3
// 1 2 3
// 10 15 5
// 100 999 500
// Sample Output
// 2
// 10
// 500

import java.util.Arrays;  
public class SecondLargestOfThree{
public static int getSecondLargest(int[] A, int result){
Arrays.sort(A);
for (int i =0; i<2; i++){
    if (A[i] == A[i+1]){
        System.out.print("invalid inputs but  ");
    }
}
return A[result-2];
}
public static void main(String args[]){
int A[]={1,2,5};
int B[]={44,44,99};
System.out.println("Second Largest: "+getSecondLargest(A,3));
System.out.println("Second Largest: "+getSecondLargest(B,3));
}}