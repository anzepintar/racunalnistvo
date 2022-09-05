package vaje26;

/*The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.
There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
How many circular primes are there below one million? */

public class Problem35 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 2; i < 1000000; i++) {
      if (isCircularPrime(i)) {
        System.out.println(i);
        sum++;
      }
    }
    System.out.println(sum);
  }

  public static boolean isPrime(int num) {
    for (int i = 2; i < Math.sqrt(num); i++) {
      if (num % i == 0)
        return false;
    }
    return true;
  }

  public static boolean isCircularPrime(int num) {
    if (isPrime(num) == false) {
      return false;
    }
    String tmp = Integer.toString(num);
    System.out.println(tmp);
    return true;

  }

}
