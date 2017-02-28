import java.util.Scanner;
public class MaxMethod{
	public static int max(int i, int j){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.printf("The max between a and b is %d \n", Math.max(a,b));
		return a;

	}

}