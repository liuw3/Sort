import java.util.Scanner;
public class yuanzhutiji{
	public static void main(String[] arge){
		System.out.println("Input high and r");
		Scanner input = new Scanner(System.in);
		double high = input.nextInt();
		double r = input.nextInt();
		double mianji = r * r * 3.14;
		double tiji = mianji * mianji * high;
		System.out.printf("mianji = %.2f, tiji = %.2f \n", mianji, tiji);

	}
}