package rebuild_inventaris;

import java.util.Scanner;

public class Data_Kelas {
	
	Scanner scan = new Scanner(System.in);
	
	int ruang_kelas;
	String lokasi_kelas;
	String pengguna;
	
		public void Data_Pengguna(){
		
		System.out.println("Ruang : ");
		ruang_kelas = scan.nextInt();
		
		System.out.println("Lokasi Ruang (GKB 1/GKB 2/GKB 3 : ");
		lokasi_kelas = scan.next();
		
		System.out.println("Fakultas : ");
		pengguna = scan.next();
		
	}
	
	public void Result_Data_Pengguna(){
		System.out.println("Ruang : "+ ruang_kelas);
		System.out.println("Ruang : "+ lokasi_kelas);
		System.out.println("Ruang : "+ pengguna);
		
	}
	
}
