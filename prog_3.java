class prog_3
{
	public static void main (String[] args){
	compare(args);
	}
} 


// Method to find and print the largest and smallest values
	static void compare(String[] args){
		if(args.length<3){
		return;	
		}
		
		// Parse the input numbers
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		
		int sum= num1+num2;// Calculate the sum of the first two number
		
		// Determine the largest of the first two numbers
		int largest;
		if (num1>num2){
			largest=num1;
		}else{largest=num2;
		}
		
		
		// Determine the smallest between the sum and the third number
		int smallest;
		if (sum<num3){smallest=sum;}else{smallest=num3;}
		
		
		// Print the results
		System.out.println("largest of the two numbers:"+largest);
		System.out.println("smallest of the sumand third number:"+smallest);
		}
		
	}
	