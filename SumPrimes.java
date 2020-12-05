// CSCI 200 Sum of Primes project
// YOU MUST USE ARRAYS TO SOLVE THIS PROBLEM, not arraylists
// read 2 strings from the command line; each string will contain an integer
// let's call those integers, num1 and num2
// write a loop that goes from num1 and num2 looking for prime numbers
// if a number if prime then store it in an array of integers
// pass this array to a method that returns the sum of all the numbers in the array; you will also need to tell this method how many numbers are in the array
// output only the sum of primes
// you may assume a maximum of not more than 1000 numbers in the array
import java.util.*;

class SumPrimes {
  // go thru the array primes which has size elements
  // total the integer values in primes
  // return this total
  // the first argument is the array of prime numbers
  // the second argument is the number of primes in this array
  public static int sumArray(first argument, second argument) {

  }

  // this method takes an integer, n, and determines if it is prime
  // returns true if it is and false if it isn't
  // a number is prime if it is only evenly divisible by 1 and itself
  // 1 is NOT considered prime
  static boolean isPrime(int n) {
      // Corner case
      if (n <= 1)
          return false;

      // Check from 2 to n-1
      for (int i = 2; i < n; i++)
          if (n % i == 0)
              return false;

      return true;
  }

  public static void main(String[] args) {
      // define the constant MAX which represents the largest size of the primes array
      int num1, num2, numPrime = 0;
      // declare an array of the proper data type and size

      // convert 1st command line argument from a string to an integer
      num1 = Integer.parseInt(args[0]);
      // get num2 from the command line

      // loop through all integers from num1 to num2
      // store those that are prime in the primes array
      // keep track of the number of primes - numPrime
      
      // output the sum of all the primes 
      System.out.println(sumArray(primes, numPrime));
  }
}
