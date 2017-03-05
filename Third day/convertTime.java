import java.util.Scanner;
public class convertTime{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Millis");
		int a = input.nextInt();
		int m = (int)(a / 1000);
		int f = 0;
		int h = 0;
		if(m > 59){
			f = (int)(m / 60);
			m = m % 60;
		}
		if (f > 59){
			h = (int)(f / 59);
			f = f % 60;
		}
		System.out.printf("%d" + ":" + "%d" + ":" + "%d \n", h,f,m);
	}
}