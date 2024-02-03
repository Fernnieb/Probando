import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingresa el Numero 1");
		
		n1=entrada.nextInt();
		
		System.out.println("Ingresa el Numero 2");
		
		n2=entrada.nextInt();		
		
		System.out.println("Ingresa el Numero 3");
		
		n3=entrada.nextInt();
		
		int a=n1-n2;
		int b=n2-n3;
		int c=n1-n3;
		
		switch(a,b,c) {
		
		
		
		}
		
		
		/*if(a>0&&b>0) {
			System.out.println(n1+" > "+n2+" > "+n3);
		}
		else if(a>0&&c<0) {
			System.out.println(n3+" > "+n1+" > "+n2);
		}
		else if(b<0&&c>0) {
			System.out.println(n1+" > "+n3+" > "+n2);
		}
		else if(a<0&&c>0) {
			System.out.println(n2+" > "+n1+" > "+n3);
		}
		else if(b>0&&c<0) {
			System.out.println(n2+" > "+n3+" > "+n1);
		}
		else{
			System.out.println(n3+" > "+n2+" > "+n1);
		}*/
	}

}
