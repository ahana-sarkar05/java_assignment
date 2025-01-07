public class prog_6{
    public static void main(String[] args) {
        commandLineInput(args);
    }

	
    static void commandLineInput(String[] args) {
        if (args.length < 2) {
            System.out.println("Provide both username and password as command-line arguments.");
            return;
        }

       
        String username = args[0];
        String password = args[1];

       
        printLogin(username, password);
    }

   
    static void printLogin(String username, String password) {
        if (login(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed.");
        }
    }

   
    public static boolean login(String username, String password) {
        switch (username) {
            case "ankan":
            case "souparna":
                switch (password) {
                    case "Madhu":
                    case "trisha":
                        return true;
                    default:
                        return false;
                }
            default:
                return false;
        }
    }
}