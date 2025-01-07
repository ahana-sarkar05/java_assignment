public class prog_8
 {
    public static void printUsingForLoop() {
        System.out.println("Printing numbers using for loop:");
        for (int i = 1; i <= 10; i++) 
		{
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printUsingWhileLoop()
	{
        System.out.println("Printing numbers using while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args)
	{
	printUsingForLoop();
    printUsingWhileLoop();
    }
}
