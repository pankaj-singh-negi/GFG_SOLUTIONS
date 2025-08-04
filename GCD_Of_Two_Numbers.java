package GFG_SOLUTIONS;

import java.util.Scanner;

public class GCD_Of_Two_Numbers {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
      if(a==0) return b;
      if(b==0) return a;

      if(a==b) return a;
      if(a>b) {
         return gcd(a-b, b);
      }
      else {
         return gcd(a, b-a);
      }
     

    }
}


// Time Complexity: O(max(a, b)) in the worst case (for subtraction-based Euclidean algorithm)
// Space Complexity: O(max(a, b)) due to recursion stack