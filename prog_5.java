class prog_5{
	public static void main(String[]args){
	evenSum();
	
	static void evenSum(){
		int sum=0;
		for(int i=1;i<=20;i++)
			if(i%2==0){
				sum+=i;
			}
		{
			System.out.println("The sum of even numbers from 1 to 20 is:"+sum);
		}
	}
}