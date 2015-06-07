package Inventaris;
import java.io.FileWriter;
public class Status_CCTV extends Status_Kelas {
	public Status_CCTV() {
		System.out.println("Status CCTV");
		insert();
		view();
	}
	
	public int Analisis_CCTV(){
		System.out.println("Status CCTV");
		if(Jumlah == 2){
			System.out.println("Sesuai");
			
		}
		else {
			System.out.println("Tidak Sesuai");
			
		}
		return Jumlah; 
		
	}
	
	public String Analisis_Kondisi(){
		if(Kondisi.equals("baik")){
			System.out.println("Sesuai");
		}
		
		else{
			System.out.println("Tidak sesuai");
		}
		return Kondisi;
	}

	public String Analisisi_Posisi(){
		if(Posisi.equals("depan") && Posisi.equals("belakang")){
			System.out.println("Sesuai");
		}
		
		else {
			System.out.println("Tidak sesuai");
		}
		return Posisi;
	}
	@Override
	public void save(){
		try{
			FileWriter write = new FileWriter("result_CCTV.txt");
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
