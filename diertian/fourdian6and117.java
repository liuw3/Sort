public class fourdian6and117{
	public static void main(String[] args){
		int i = 1;
		double j = 20;
		System.out.println("Mile		Qianmi		Qianmi		Mile");
		for(i = 1; i < 11; i ++){
			
			System.out.printf("%d        %.3f       %.1f       %.3f\n", i, (double)(i * 1.609), j, (double)(j / 1.609));
			j = j + 5;
		}





	}
}
