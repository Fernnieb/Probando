
public class for_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] Matris=new double[4][4];
		for(int i=0;i<4;i++) {
			System.out.println();
			for(int j=0;j<4;j++) {
				Matris[i][j]=(j+1)*(i);
				System.out.print(Matris[i][j]+" ");
			}
		}

	}

}
