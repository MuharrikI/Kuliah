import java.util.*;
public class Akar{
	public static void main (String []inchou){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Masukkan angka: ");
		int angka = input.nextInt();
		
		System.out.print("Akar Kuadrat: "+ akarKuadrat(angka));
	
	}
	public static double akarKuadrat(double angka){
		double t;
		
		double akar = angka/2;
		
		do {
			t = akar;
			akar = (t + (angka/t))/2;
			}while ((t - akar) != 0);
		
		return akar;
	}
}	
