import java.util.Scanner;
public class Huashizhuansheshi{
	public static void main(String[] args){
		System.out.println("Input temperature");
		Scanner input = new Scanner(System.in);
		int tem = input.nextInt();
		Double huashi = (9.0/5 * tem + 32.0);
		System.out.printf("Huashi = %f \n", huashi);







	}

}