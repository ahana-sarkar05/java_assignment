public class prog_7 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide at least three usernames as command-line arguments.");
            return;
        }

        lengthofUsernames(args);
    }

    
    static int getLength(String str) {
        return str.length();
    }

  
    static void lengthofUsernames(String[] args) {
        for (String username : args) {
            int length = getLength(username);
            greetUser(username, length);
        }
    }

   
    static void greetUser(String username, int length) {
        switch (length) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Hello " + username + ", Username length is: " + length);
                break;
            default:
                else {
                    System.out.println("Sorry, the username is too short.");
                }
                break;
        }
    }
}

