import java.util.Scanner;
public class xiaofeibilv{
	public static void main(String[] arge){
		System.out.println("Enter total and tip rate");
		Scanner input = new Scanner(System.in);
		double subtotal = input.nextInt();
		double rate = input.nextInt();
		double tips = subtotal * rate/100;
		double total = subtotal + tips;
		System.out.printf("The gratuity is %f and the Total is %f \n", tips, total);




	}
}