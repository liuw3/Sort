public class primerecursive{
	public static void main(String[] args){
		int count = 0;
		int i = 1;
		while(count < 101){
			i = i +1;
			if(prime(i) == true && prime(recursive(i)) == true && recursive(i) != i){
				count ++;
				System.out.printf("%d  ", i);
				if((count % 10) == 0){
					System.out.printf("\n");
				}
			}
		}
	// for (int i = 0; i < 100; i ++){
		
	// 	System.out.printf(ssrecursive(i) + "  "+ i + "\n");
	// }



	}
	public static int recursive(int n){
		int newn = 0;
		int a = 0;
		while(n > 0){
		a = n % 10;
		newn = newn * 10 + a;
		n = (n - a)/ 10;
		}	
		return newn;
	}
	// public static Boolean ssrecursive(int n, int recursive(n)){
	// 	// int newn = 0;
	// 	// int a = 0;
	// 	// while(n > 0){
	// 	// a = n % 10;
	// 	// newn = newn * 10 + a;
	// 	// n = (n - a)/ 10;
	// 	// }	
	// 	if (newn == n){
	// 		return true;
	// 	}
	// 	else{
	// 		return false;
	// 	}
	// }
	public static Boolean prime(int n){
		int m;
		for(int j = 2; j < n; j ++){
			m = n % j;
			if(m == 0){
				return false;
			}
		}
		return true;
	}
}











