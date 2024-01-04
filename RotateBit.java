// GFG Problem
// Rotate Bits
// BasicAccuracy: 20.8%Submissions: 57K+Points: 1
// Learn Google Cloud with Curated Lab Assignments. Register, Earn Rewards, Get noticed by experts at Google & Land your Dream Job! 
// Given an integer N and an integer D, rotate the binary representation of the integer N by D digits to the left as well as right and return the results in their decimal representation after each of the rotation.
// Note: Integer N is stored using 16 bits. i.e. 12 will be stored as 0000000000001100.

// Example 1:

// Input:
// N = 28, D = 2
// Output:
// 112
// 7
// Explanation: 
// 28 in Binary is: 0000000000011100
// Rotating left by 2 positions, it becomes 0000000001110000 = 112 (in decimal).
// Rotating right by 2 positions, it becomes 0000000000000111 = 7 (in decimal).
// Example 2:

// Input: 
// N = 29, D = 2
// Output: 
// 116
// 16391
// Explanation: 
// 29 in Binary is: 0000000000011101
// Rotating left by 2 positions, it becomes 0000000001110100 = 116 (in decimal).
// Rotating right by 2 positions, it becomes 100000000000111 = 16391 (in decimal).

public class RotateBit {
    public static void main(String[] args) {

    int N = 28;
    int D = 2;

    // Convert N to a 16-bit binary string
    String binaryN = String.format("%16s", Integer.toBinaryString(N)).replace(' ', '0');

    // Perform left rotation
    String leftRotated = rotateLeft(binaryN, D);

    // Perform right rotation
    String rightRotated = rotateRight(binaryN, D);

    // Convert the rotated binary strings to decimal
    int leftDecimal = Integer.parseInt(leftRotated, 2);
    int rightDecimal = Integer.parseInt(rightRotated, 2);

    // Print the results
    System.out.println(leftDecimal);
    System.out.println(rightDecimal);
}

// Function to rotate a binary string to the left by D positions
private static String rotateLeft(String binary, int D) {
    int len = binary.length();
    D = D % len; // Handle cases where D > len
    String rotated = binary.substring(D) + binary.substring(0, D);
    return rotated;
}

// Function to rotate a binary string to the right by D positions
private static String rotateRight(String binary, int D) {
    int len = binary.length();
    D = D % len; // Handle cases where D > len
    String rotated = binary.substring(len - D) + binary.substring(0, len - D);
    return rotated;

}
}
