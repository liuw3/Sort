import java.util.Scanner;
public class fivedian2and150{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		long x = input.nextInt();

     System.out.printf("Sum is %d \n", sumDigits(x));
	}
	public static int sumDigits(long n){
		
		int a;
		int sum = 0;
		while(n > 0){
			a = (int)n % 10;
			sum = sum + a;
			n = (n - a)/10;
		}
		return sum;
	}

}


