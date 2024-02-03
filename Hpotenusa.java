import java.util.*;
public class Hpotenusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Introduce lado a ");
		
		a=entrada.nextInt();
		
		System.out.println("Introduce lado b ");
		
		b=entrada.nextInt();
		
		double Hipo=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		
		System.out.println("La hipotenusa es: "+Hipo);
		
			
	}

}
