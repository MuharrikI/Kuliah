# Kuliah
public class NamaMUH {
	public static void main (String []inchou){
		int i,j;
		
		//M
		for (i =1; i<=5; i++){
			for (j=0; j<=8; j++){
				
				if (i==1 && (j==1 || j==8)){
					System.out.print("M");
				}else 
					if (i==2 &&(j==3 || j==6 || j==1 || j==8)){
						System.out.print("M");
				}else 
					if (i==3 &&(j==4 || j==5 || j==1 || j==8)){
						System.out.print("M");
				}else 
					if ((i==4 || i==5) && (j==4 || j==5 || j==1 || j==8)){
						System.out.print("M");
				}else System.out.print(" ");
			} System.out.println();
		} System.out.print("\n");
		//U
		for (i =1; i<=5; i++){
			System.out.print(" ");
			for (j=1; j<=8; j++){
				
				if ((i>=1 && i<=4) && (j==1 || j==5)){
					System.out.print("U");
				} else 
					if (i==5){
						System.out.print("U");
				}else System.out.print("  ");
			} System.out.println();
		}System.out.println();
		//H
		for (i=1; i<=5; i++){
			for (j=0; j<=8; j++){
				
				if(i==3 && (j>=2 && j<=8)){
					System.out.print("H");
				}else 
					if (j==1 || j==8){
						System.out.print("H");
				}else System.out.print(" ");
			}System.out.println();
		}
	}
}





















