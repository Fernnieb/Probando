
public class for_each {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] Matris=new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				Matris[i][j]=(j+1)*(i);
			}
		}
		for(int []fila:Matris) {
			System.out.println();
			for(int z:fila) {
				System.out.print(z+" ");
			}
		}
	}
}
