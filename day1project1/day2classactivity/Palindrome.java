package day2classactivity;

import java.util.Scanner;

public class Palindrome
{
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a number to check if it is a palindrome:");
     int input = scanner.nextInt(); 
     int output = 0; 
     int tempInput = input; 

     for (int i = tempInput; i > 0; i /= 10) {
         int rem = i % 10; 
         output = output * 10 + rem; 
     }
     if (input == output) {
         System.out.println(input + " is a Palindrome.");
     } else {
         System.out.println(input + " is not a Palindrome.");
     }

     scanner.close();
 }
}
