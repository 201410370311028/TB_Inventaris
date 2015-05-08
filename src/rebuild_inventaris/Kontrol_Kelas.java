package rebuild_inventaris;

import java.util.Scanner;

public class Kontrol_Kelas {

	Data_Kelas user_data = new Data_Kelas();
	Status_Kelas user_status = new Status_Kelas();
	
	Scanner scan;
	
	public void Data_Pengguna(){
		
		System.out.println("Ruang : ");
		user_data.setRuang_Kelas(scan.nextInt());
		
		System.out.println("Lokasi Ruang (GKB 1/GKB 2/GKB 3 : ");
		user_data.setLokasi_Kelas(scan.next());
		
		System.out.println("Fakultas : ");
		user_data.setPengguna_Kelas(scan.next());
		
	}
	
	public void Result_Data_Pengguna(){
		System.out.println("Ruang : "+user_data.getRuang_Kelas());
		System.out.println("Ruang : "+user_data.getLokasi_Kelas());
		System.out.println("Ruang : "+user_data.getPengguna_Kelas());
		
	}
	
	
}
