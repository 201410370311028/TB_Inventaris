package Inventaris;
import java.io.FileWriter;
import java.util.Scanner;

public class Data_Kelas {
	static Scanner input = new Scanner(System.in);
	static Analisis identitas = new Analisis();
	
	public static void identitas(){
		
		System.out.println("========================");
		System.out.println("  DATA IDENTITAS RUANGAN");
		System.out.println("========================");
		System.out.println("Input Ruang : ");
		identitas.setRuang(input.next());
		System.out.println("Input Lokasi : ");
		identitas.setLokasi(input.next());
		System.out.println("Input Fakultas : ");
		identitas.setFakultas(input.next());
		System.out.println("Input Jurusan : ");
		identitas.setJurusan(input.next());
		System.out.println("========================");
		
		System.out.println("Ruang : " + identitas.getRuang());
		System.out.println("Lokasi : " + identitas.getLokasi());
		System.out.println("Fakultas : " + identitas.getFakultas());
		System.out.print("Jurusan : " + identitas.getJurusan());
	}
	public static int Analisis_Ruang(){
		System.out.println("========================");
		System.out.println("  Analisa Luas Ruangan");
		System.out.println("========================");
		System.out.println("\nInput Panjang Ruang : ");
		identitas.setPanjang(input.nextInt());
		System.out.println("Input Lebar Ruang : ");
		identitas.setLebar(input.nextInt());
		System.out.println("Input Jumlah Jendela : ");
		identitas.setJum_Jendela(input.nextInt());
		System.out.println("Input Jumlah Pintu : ");
		identitas.setJum_Pintu(input.nextInt());
		System.out.println("Input Jumlah Kursi : ");
		identitas.setJum_Kursi(input.nextInt());
		return 0;
	}
	public void Tampil(){
		System.out.println("Panjang Ruang " + identitas.getPanjang());
		System.out.println("Lebar Ruang "+ identitas.getLebar());
		System.out.println("Jumlah Jendela "+identitas.getJum_Jendela());
		System.out.println("Jumlah Pintu "+identitas.getJum_Pintu());
		System.out.println("Jumlah Kursi "+identitas.getJum_Kursi());
		System.out.println("Luas : " + Luas());
		System.out.println("Rasio : " + Rasio());
	}
	float Luas (){
		return identitas.getPanjang() * identitas.getLebar();
	}
	double Rasio(){
		return Luas() / identitas.getJum_Kursi();
	}
	
	
	public void save(){
		try{
			FileWriter write = new FileWriter("Hasil.txt");
			write.write("Result Kabel LCD");
			write.write("Ruang : " + identitas.getRuang());
			write.write("Lokasi : " + identitas.getLokasi());
			write.write("Fakultas : " + identitas.getFakultas());
                        write.write("Jurusan : " + identitas.getJurusan());
			write.write("Panjang Ruang " + identitas.getPanjang());
                        write.write("Lebar Ruang "+ identitas.getLebar());
                        write.write("Jumlah Jendela "+identitas.getJum_Jendela());
			write.write("Jumlah Pintu "+identitas.getJum_Pintu());
                        write.write("Jumlah Kursi "+identitas.getJum_Kursi());
                        write.write("Luas : " + Luas());
			write.write("Rasio : " + Rasio());
			write.close();
		}
			catch(Exception e){
				e.printStackTrace();
			}
		}
}
