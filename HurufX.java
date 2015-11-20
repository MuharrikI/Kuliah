# Kuliah
public class HurufX {
	public static void main (String []inchou){
		
		for (int i =0; i<=5; i++){
			for (int j=0; j<=5; j++){
				
				if(i==1 && (j==1 || j==5))
					System.out.print("X");
				else if (i==2 && (j==2 || j==4))
					System.out.print("X");
				else if (i==3 && j==3)	
					System.out.print("X");
				else if (i==4 && (j==2 || j==4))
					System.out.print("X");
				else if (i==5 && (j==1 || j==5))
					System.out.print("X");
				else System.out.print(" ");
			} System.out.println();
		}
	}
}
