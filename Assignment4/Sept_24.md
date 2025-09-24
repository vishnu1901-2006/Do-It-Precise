## This Java class, `TwoRaiseNSumRecursion`, calculates the sum of the series 21+22+23+⋯+2n using a recursive approach. 
### The `sumOfPowers` method breaks down the problem by adding the current power of 2 (2n) to the result of the same function called with the next smaller number (n−1), until it reaches the base case where n=1.

> // Calculate sum of series 2^1 + 2^2 + 2^3 + ..... + 2^n using recursion.
```java
public class TwoRaiseNSumRecursion {
    public static int sumOfPowers(int n) {
        if (n == 1) {
            return 2;
        }
        return (int) Math.pow(2, n) + sumOfPowers(n - 1);
    }
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = sumOfPowers(n);
        System.out.println("The sum of powers of 2 from 1 to " + n + " is: " + result);
    }
}
```
---
## Sum of Squares using Recursion 
### The `NsquareSumRecursion` class demonstrates how to calculate the sum of the series 1² + 2² + 3² + ⋯ + n² recursively. The `sumOfSquares` method works by adding the square of the current number (n²) to the result of the function called with the previous number (n−1). This continues until the base case of n=1 is reached.

> Calculate the sum of series 1² + 2² + 3² + ..... + n² using recursion.

```java
public class NsquareSumRecursion {
    public static int sumOfSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return n * n + sumOfSquares(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        int result = sumOfSquares(n);
        System.out.println("The sum of squares from 1 to " + n + " is: " + result);
    }
}
```
---
## Maximum and Minimum in an Array using Recursion
### This Java class, MaxAndMinUsingRecursion, uses recursion to find both the maximum and minimum elements within an array. The findMax and findMin methods each compare the last element of the array with the result of the same function called on the rest of the array (size n−1), returning the greater or lesser of the two.
> // Calculate maximum and minimum element in an array using recursion
```java
public class MaxAndMinUsingRecursion {
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        int n = arr.length;
        int max = findMax(arr, n);
        int min = findMin(arr, n);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
```
---
## Fibonacci Series using Recursion 
### The FibonacciUsingRecursion class generates the Fibonacci series up to a given number n using recursion. The fibonacci method calculates the number in the series by summing the previous two numbers in the sequence. The base cases are for n=0 and n=1, where the function returns n.
```java
public class FibonacciUsingRecursion {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Fibonacci series up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
```
---
## Factorial using Recursion
### The FactorialUsingRecursion class calculates the factorial of a number using recursion. The factorial method multiplies the given number n by the factorial of n−1. The base case for the recursion is when n=0, where the factorial is defined as 1.
> Calculate factorial of a number using recursion
```java
public class FactorialUsingRecursion {
    public static int  factorial(int n) {
        if (n==0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int number = 5; // Example input
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
```
---
## Palindrome Check using Recursion
### This CheckPalindromeUsingRecursion class determines if a given string is a palindrome (reads the same forwards and backward) using a recursive method. The isPalindrome function compares the first and last characters of the string and then recursively calls itself on the substring between them. The recursion stops when the start and end pointers cross or meet, at which point the string is considered a palindrome.
> Check if a given string is a palindrome using recursion
```java
public class CheckPalindromeUsingRecursion {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "racecar"; // Example input
        boolean result = isPalindrome(str, 0, str.length() - 1);
        System.out.println("Is the string "" + str + "" a palindrome? " + result);
    }
}
```
---
