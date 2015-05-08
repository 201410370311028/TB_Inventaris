package rebuild_inventaris;

import java.util.Scanner;

public class Status_Kelas {

	Scanner scan = new Scanner(System.in);
	int jumlah;
	String kondisi;
	String posisi;
	
	public void input(){
		System.out.println("Masukkan Jumlah : ");
		jumlah = scan.nextInt();
		System.out.println("Masukkan Kondisi : ");
		kondisi = scan.next();
		System.out.println("Masukkan Posisi: ");
		posisi = scan.next();
	}
	
	public void view(){
		System.out.println("jumlah : "+jumlah);
		System.out.println("kondisi : "+kondisi);
		System.out.println("posisi : "+posisi);
   }

}

