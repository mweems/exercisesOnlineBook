package chapters.chapter10;

import java.util.ArrayList;

public class PrimeSieve {


    public static Integer[] primes(int... numbers) {
        ArrayList<Integer> prime = new ArrayList<Integer>();

        for(int number: numbers){
            if(isPrime(prime, number)) prime.add(number);
        }
        return prime.toArray(new Integer[prime.size()]);
    }

    private static boolean isPrime(ArrayList<Integer> prime, int number) {
        for(int checkNumber: prime){
            if(number % checkNumber == 0) return false;
        }
        return true;
    }
}
