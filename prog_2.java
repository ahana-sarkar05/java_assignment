class prog_2
 {
    public static void main(String[] args) {
	countvowelsconsonants(args);
	}
	//main method
	
		// Method to count and print the number of vowels and consonants in a name
		static void countvowelsconsonants(String[] args){
        if (args.length == 0) {
            System.out.println("enter your name:");
            return;
        }
        
		// Parse the input name
        String name = args[0];
        int vowels = 0, consonants = 0;
        String lowerName = name.toLowerCase();


        // Loop through each character in the name and count vowels and consonants
        for (char c : lowerName.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }


          // Print the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}