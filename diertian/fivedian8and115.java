public class fivedian8and115{
	public static void main(String[] args){
		System.out.println("sheshi		huashi		sheshi		huashi");
		double a = 40.0;
		double b = 120.0;
		double n = 48.89;
		double m = 104.0;
		System.out.printf("%.2f      %.2f      %.2f      %.2f \n", a, m, b, n);
		for (int i = 0; i < 9; i ++){
			a = a - 1.0;
			b = b - 10.0;
			m = celsiousToFahrenheit(a);
			n = fahrenheitToCelsious(b);
			
			System.out.printf("%.2f      %.2f      %.2f      %.2f \n", a, m, b, n);
		}




	}
	public static double celsiousToFahrenheit(double celsius){
		double fahrenheit = celsius * (9.0 / 5) + 32;
		return fahrenheit;
	}
	public static double fahrenheitToCelsious(double fahrenheit){
		double celsius = (fahrenheit - 32) / (9.0 / 5);
		return celsius;
	}
}