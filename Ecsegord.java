import java.util.Scanner;

public class Ecsegord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el Valor de a:");
		int a=sc.nextInt();
		System.out.println("Introduce el Valor de b:");
		int b=sc.nextInt();
		System.out.println("Introduce el Valor de c:");
		int c=sc.nextInt();
		
		double det=Math.pow(b,2)-(4*a*c);
		if (det>0) {
			double x1=((-1)*b+Math.sqrt(det))/(2*a);
			double x2=((-1)*b-Math.sqrt(det))/(2*a);
			System.out.println("El Valor de x1 es:"+x1);
			System.out.println("El Valor de x2 es:"+x2);
		}
		else {
			System.out.println("Las raices no estan dentro de los reales.");
		}
		sc.close();
	}

}
