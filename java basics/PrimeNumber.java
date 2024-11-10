import java.util.*;


public class PrimeNumber {
    
    
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }

        
        for (int i = 2; i <Math.sqrt(n); i++) {
            if (n % i == 0) {  
                return false;   
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is a prime number:");
        int l = sc.nextInt();

        
        if (isPrime(l)) {
            System.out.println("The number " + l + " is a prime number.");
        } else {
            System.out.println("The number " + l + " is not a prime number.");
        }

        sc.close(); 
    }
}
