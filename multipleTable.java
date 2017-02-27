import java.util.Scanner;
public class multipleTable {
	public static void main(String[] args){
		int number = 0;
		for (int i = 1; i < 10; i ++){
			System.out.printf("\n" );
			for ( int j = 1; j < 10; j++){
				if (j > i){
				continue;}
				else
				number = i * j;
				System.out.printf("%d * %d = %d " ,i, j, number);

			}
			//System.out.printf("%d * %d = %d \n" ,i, j, number);
		}







	}
}