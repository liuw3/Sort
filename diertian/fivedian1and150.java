public class fivedian1and150{
	public static void main(String[] args){

	for (int i = 0; i < 100; i ++){
		//n ++;

		System.out.print(getPentagona1Number(i + 1) + " ");
		if(((i + 1) % 10) == 0){
			System.out.println();
		}
	}





	}

public static int getPentagona1Number(int n){
	
	int m = (n * (3 * n - 1))/2;
	return m;
	}
}