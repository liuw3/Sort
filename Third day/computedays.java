import java.util.Scanner;
public class computedays{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int yearBegin = input.nextInt();
		int yearEnd = input.nextInt();
		int currentyear;
		//int days1 = 365;
		//int days2 = 366;
		int days;
		if ((yearEnd - yearBegin) < 0){
			System.out.println("Incorrect input!");
			//break;
		}
		int x = yearEnd - yearBegin + 1;
		for (int i = 0; i < x; i ++){
			//currentyear = yearBegin;
			days = 365;
			//days = days1;
			if(yearBegin%4 == 0){
				//days = days2;
				days = 366;
			}
			

			System.out.printf("%d    " + days + " \n", yearBegin);
			yearBegin ++ ;
		}

	}
}