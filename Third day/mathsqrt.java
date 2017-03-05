public class mathsqrt{
	public static void main(String[] args){
		int n;
		double ns;
		System.out.println("数字		平方根");
		for (n = 0; n < 21; n = n + 2){
			ns = Math.sqrt(n);
			System.out.printf("%d               %.4f \n", n, ns);
		}
	}
}