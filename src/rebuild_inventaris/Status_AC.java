package rebuild_inventaris;

import java.io.FileWriter;

public class Status_AC extends Status_Kelas {

	public Status_AC() {
		System.out.println("Status AC");
		insert();
		view();
	}
	
	public int Analisis_AC(){
		if (Jumlah > 1){
			System.out.println("Jumlah AC sesuai");
			
		}		
		else {
		System.out.println("Jumlah AC Tidak sesuai");
		
		}
		return Jumlah;
	}
	
	public String Kondisi_AC(){
		if(Kondisi.equals("baik")){
			System.out.println("kondisi sesuai");
		}
		
		else {
		System.out.println("kondisi tidak sesuai");
	}
		
		return Kondisi;
	}
	
	public String Posisi_AC(){
		if (Posisi.equals("dibelakang")){
			System.out.println("posisi sesuai");
		}
		else{
			System.out.println("posisi tidak sesuai");
		}
		return Posisi;
	}
	@Override
	public void save(){
		try{
			FileWriter write = new FileWriter("result_AC.txt");
			write.write("Result Stop Kontak ");
			write.write(" | Jumlah :" + Jumlah);
			write.write(" | Kondisi :" + Kondisi);
			write.write(" | Posisi: " + Posisi);
			write.close();
		}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}

