public class PrimeNumber {

    public boolean isPrime(int num){
        if (num == 1 || num == 2) return true;
        if (num % 2 == 0) return false;
        for(int i = 3; i < num/2; i += 2){
            if(num % i == 0) return false;
        }
        return true;
    }
}
