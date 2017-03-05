import java.util.Scanner;
public class fivedian3and150{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = input.nextInt();
		System.out.printf("The reserve number is %d \n", reverse(number));
		System.out.printf("Is number Palindrome ? %b \n", isPalindrome(number));

	}
	public static int reverse(int number){
		int a;
		//int count = 0;
		int rev = 0;
		while(number > 0){
			a = number % 10;
			rev = a + 10 * rev;  
			//count ++;
			number = (number - a) / 10;
		}
		return rev;


	}
	public static boolean isPalindrome(int number){
		if ( reverse(number) == number){
			return true;
		}
		else {
			return false;
		}
	}


}