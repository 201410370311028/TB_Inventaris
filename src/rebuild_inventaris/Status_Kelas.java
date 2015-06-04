package rebuild_inventaris;

import java.io.FileWriter;
import java.util.Scanner;

public class Status_Kelas {
	
	int Jumlah;
	String Kondisi;
	String Posisi;
	
	Scanner scan = new Scanner(System.in);
	
	public void insert(){
		System.out.println("Jumlah : ");
		Jumlah = scan.nextInt();
		
		System.out.println("Kondisi : ");
		Kondisi = scan.next();
		
		System.out.println("Posisi : ");
		Posisi = scan.next();
	}
	
	public void view(){
		System.out.println("Jumlah : "+Jumlah);
		System.out.println("Kondisi : "+Kondisi);
		System.out.println("Posisi : "+Posisi);
	}
	
	public void save(){
		try{
			FileWriter write = new FileWriter("Status Kelas.txt");
			write.write("Jumlah : " + Jumlah);
			write.write("Kondisi : " + Kondisi);
			write.write("Posisi : " + Posisi);
			write.close();
		}
			catch(Exception e){
				e.printStackTrace();
			}
		}

}

