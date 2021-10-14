class FactorialUsingArray
{
	public static void main(String args[]){
	int num[]={1, 2, 3, 4, 5};
	int fact=1;
	for(int i=0; i<5; i++){
	fact*=num[i];
	System.out.println("Factorial of a Given (" +(num[i]) + ") number is "+fact);}
	}
}