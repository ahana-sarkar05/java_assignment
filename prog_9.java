public class prog_9 {
    public static void main(String[] args) {
        commandLineInput(args);
    }
	                                  

                               
    static void commandLineInput(String[] args) {
        if (args.length < 1) {
            System.out.println("Enter number:");
            return;
        }
		                               

        
        int num = Integer.parseInt(args[0]);
                                      
        printFact(num);
    }

                                     
    static void printFact(int num) {
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

                                   
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
