import java.util.Scanner;

public class Judgeinteger{
	public static void main(String[] arge){
		System.out.println("Enter an ingeter:");
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		//int num;
		if (m % 2 == 0){

			System.out.printf("Is %d an even number? True\n", m);
		}
		else {
			System.out.printf("Is %d an even number? False \n", m);
		}




	}

}