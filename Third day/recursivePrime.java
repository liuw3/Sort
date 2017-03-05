public class recursivePrime{
	public static void main(String[] args){
		int count = 0;
		int i = 1;
		while(count != 100){
			i++ ;
			if ((recursive(i) == true) &&  (prime(i) == true) ){
				count ++;
				//System.out.print("count  =" + count + "\n");
				System.out.print(i + "  ");	
				if(count % 10 == 0){
				System.out.printf("\n");
					}
				}
			
			//System.out.print(i + "\n");
		}
		
		// for(i = 0; i < 200; i ++){
			
		// 	System.out.println("b = " + recursive(i) + " value = " + i);

		//  }
		// for(i = 0; i < 200; i ++){
			
		// 	System.out.println("b = " + prime(i) + " value = " + i);

		// }
	}
	public static Boolean recursive(int number){
		// int newn = 0;
		// int a = 0;
		// if(n < 10){
		// 	return true;
		// }
		// while(n > 10){
		// 	a = n % 10;
		// 	newn = ( newn * 10 ) + a;
		// 	n = (n - a) / 10;

		// 	}
		// if (n == newn){
		// 	return true;
		// }
		// else{
		// 	return false;
		// }
	if ( reverse(number) == number){
			return true;
		}
		else {
			return false;
		}		
	}
	public static int reverse(int number){
		int a;
		//int count = 0;
		int rev = 0;
		while(number > 0){
			a = number % 10;
			rev = a + 10 * rev;  
			//count ++;
			number = (number - a) / 10;
		}
		return rev;


	}

	public static Boolean prime(int n){
		int i;
		for(i = 2; i < n; i ++){
			// if(n % i != 0){
			// 	return false;
			// }
			// else
			if (n % i == 0){
				return false;
			}
		}
		return true;
	}
}