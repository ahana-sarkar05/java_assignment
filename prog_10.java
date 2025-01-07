public class prog_10{
    public static void main(String[] args) {
        CommandLineInput(args);
    }
                                        
    
    static void CommandLineInput(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }
                                       
        int num = Integer.parseInt(args[0]);
                                       
        printPrime(num);
    }
                                      
    static void printPrime(int num) {
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
            if (num % 2 != 0) {
                System.out.println(num + " is also an odd number.");
            } else {
                System.out.println(num + " is not an odd number.");
            }
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
                                  
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}