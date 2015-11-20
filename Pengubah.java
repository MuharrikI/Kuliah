# Kuliah
import java.util.*;
public class Pengubah{
	public static void main (String []inchou){
		Scanner input = new Scanner (System.in);
		int bit, pilihan, desimal;
		int [] hasil;
		hasil = new int [99];
		
		
		System.out.println("Masukkan Pilihan Anda:");
		System.out.println("1. Desimal --> Biner");
		System.out.println("2. Biner --> Desimal\n");
		pilihan = input.nextInt();
		
		
		
		if (pilihan==1){
			System.out.println("Desimal --> Biner!");
			System.out.print("Desimal= ");
			desimal = input.nextInt();
			for (int bantu1=0; desimal>=1; bantu1++){
				bit = desimal%2;
				desimal = desimal/2;
				hasil[bantu1] = bit;
			}
			for (int bantu2=98; bantu2>=0; bantu2--){
				if(hasil[bantu2]==1){
					System.out.print("Biner= ");
					for (int bantu3=bantu2; bantu3>=0; bantu3--){
						
						System.out.print(hasil[bantu3]);
					} break;
				}	
			}
		} else {
			int sisa,b;
			desimal = 0;
			b = 1;
			System.out.println("Biner --> Desimal!");
			System.out.print("Biner= ");
			bit = input.nextInt();
			while(bit>0){
					sisa = bit%2;
					bit = bit/10;
					desimal = desimal + sisa*b;
					b = b*2;
			} 	System.out.print("Desimal= "+desimal);
		}
	
	}
}
