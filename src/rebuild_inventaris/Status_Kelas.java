package rebuild_inventaris;

import java.util.Scanner;

public class Status_Kelas {

	Scanner scan = new Scanner(System.in);
	int jumlah;
	String kondisi;
	String posisi;
	
	public void input(String masukan){
		System.out.println("Masukkan Jumlah : ");
		jumlah = scan.nextInt();
		System.out.println("Masukkan Kondisi : ");
		kondisi = scan.next();
		System.out.println("Masukkan Posisi: ");
		posisi = scan.next();
	}
	
	public void view(String pengeluaran){
		System.out.println("jumlah : "+jumlah);
		System.out.println("kondisi : "+kondisi);
		System.out.println("posisi : "+posisi);
   }

	boolean Analisis_Stop_Kontak() {
		
		return false;
	}

	String Kondisi_Stop_Kontak() {
		// TODO Auto-generated method stub
		return null;
	}

	String Posisi_Stop_Kontak() {
		// TODO Auto-generated method stub
		return null;
	}

	boolean Analisis_Lampu() {
		// TODO Auto-generated method stub
		return false;
	}

	public String Analisisi_Kondisi() {
		// TODO Auto-generated method stub
		return null;
	}

	public String Analisisi_Posisi() {
		// TODO Auto-generated method stub
		return null;
	}

	boolean Analisis_Kipas_Angin() {
		// TODO Auto-generated method stub
		return false;
	}

	String Kondisi_Kipas_Angin() {
		// TODO Auto-generated method stub
		return null;
	}

	String Posisi_Kipas_Angin() {
		// TODO Auto-generated method stub
		return null;
	}

	boolean Analisis_Kabel_LCD() {
		// TODO Auto-generated method stub
		return false;
	}

	String Kondisi_Kabel_LCD() {
		// TODO Auto-generated method stub
		return null;
	}

	String Posisi_Kabel_LCD() {
		// TODO Auto-generated method stub
		return null;
	}

	public String Analisis_Kondisi() {
		// TODO Auto-generated method stub
		return null;
	}

	boolean Analisis_CCTV() {
		// TODO Auto-generated method stub
		return false;
	}

	public String Posisi_AC() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean Analisis_AC() {
		// TODO Auto-generated method stub
		return false;
	}

	public String Kondisi_AC() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
