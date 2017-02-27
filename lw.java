import java.util.Scanner;
public class lw {
	public static void main (String[] args){
		int sum = 0;
		System.out.printf("How many numbers for adding?");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int number;
		System.out.printf("Numbers: ");
		
		for (int a = 1; a < i + 1; a ++){
			//Scanner input = new Scanner(System.in);
			number = input.nextInt();
			sum = sum + number;
		}
		System.out.printf("Answer: %d \n", sum);











	}



}