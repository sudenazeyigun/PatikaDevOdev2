import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Kenar 1'i giriniz :");
		Scanner k1= new Scanner(System.in);
		double kenar1= k1.nextDouble();
		
		System.out.println("Kenar 2'yi giriniz :");
		Scanner k2= new Scanner(System.in);
		double kenar2= k1.nextDouble();

		System.out.println("Kenar 3'ü giriniz :");
		Scanner k3= new Scanner(System.in);
		double kenar3= k1.nextDouble();

		double u = (kenar1+kenar2+kenar3)/2;
		
		double islem = u*(u-kenar1)*(u-kenar2)*(u-kenar3);
		
		double alan = Math.sqrt(islem);
		System.out.println(alan);
		

	}

}
