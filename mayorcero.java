import java.util.Scanner;

public class mayorcero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Ingresa un numero mayor que 0:");
			numero=sc.nextInt();
		} while (numero<=0);
		sc.close();
	}
	
}
