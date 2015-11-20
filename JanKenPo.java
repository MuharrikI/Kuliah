# Kuliah
import java.util.*;
public class JanKenPo{
	public static void main (String []inchou){
		Scanner input = new Scanner (System.in);
		Random random = new Random();
		String pilihan, jwb;
		int nilai=0, lawan, hasil, jln;
		for(jln=1;jln==1;){
		System.out.print("Permainan Jan-Ken-Po!!!! "+"\n"+"Masukkan Pilihan Anda"+"\n"+"\n");
		pilihan = input.next();
		
		switch(pilihan.toLowerCase()){
			case "batu" : nilai = 0; break;
			case "kertas" : nilai = 1; break;
			case "gunting" : nilai = 2; break;
			default : System.out.print("Mas/Mbak gak pernah kecil ya? Masukkannya salah"+"\n");nilai = 999999; break;
		}
		
		lawan = random.nextInt(3);
		switch(lawan){
			case 0 : System.out.println("\n"+"Melawan Batu"); break;
			case 1 : System.out.println("\n"+"Melawan Kertas"); break;
			default : System.out.println("\n"+"Melawan Gunting"); break;
		}
		
		hasil = nilai - lawan;
		if (hasil==0)
			System.out.println("\n"+"Yahh... Seri"+"\n");
		else if (hasil==1||hasil==-2)
			System.out.println("\n"+"Hore!!! Anda Menang"+"\n");
		else System.out.println("\n"+"Maaf.. Anda Kalah"+"\n");
		
		System.out.println("Lanjut Main??(Ya/Tidak)");
		jwb = input.next();
		if(jwb.equalsIgnoreCase("ya"))
			jln = 1;
		else if (jwb.equalsIgnoreCase("tidak"))
			jln = 0;
		else {jln=0; System.out.print("Masukkan Salah!! Program Berhenti");}
		System.out.print("\n");
		}
	}
}	
