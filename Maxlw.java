import java.util.Scanner;
public class Maxlw{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		//int maxlw = int max(a, b){a > b ? a : b};
		// int d = max (a,b,c);
		int e = max(a,b);
		//int c = max(a, b);
		System.out.printf("The max between a = %d, b = %d and c = %d is %d \n",a ,b ,c ,d);
	//}
	}
public static int max(int a, int b){
	if (a > b){
		return a;
	}
	else {
		return b;
	}

}

// public static int max(int a, int b, int c){
// 	if ((a >b) && (a > c)){
// 		return a;
// 	}
// 	else if (b > c){
// 		return b;
// 	} else {
// 		return c;
//  	}


public static int max(int a, int b, int c){
	if ((a >b) && (a > c)){
		return a;
	}
	else if (b > c){
		return b;
	} else {
		return c;
	}

}
}