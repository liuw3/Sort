public class doubleprime{
	public static void main(String[] args){
		for(int n = 3; n < 1000; n ++){
			if(isprime(n) == true && isprime(n + 2) == true){
				System.out.println( "(" + n + ", " + (n + 2) + ")" );
		}
	}

}


	
	public static Boolean isprime(int n){
		for(int i = 2; i < n; i ++ ){
			if((n % i)== 0){
				return false;
			}
		}
		return true;
	}


}