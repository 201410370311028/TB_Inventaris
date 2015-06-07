package Inventaris;
import java.io.FileWriter;
public class Status_Lampu extends Status_Kelas {
	public Status_Lampu() {
		System.out.println("\nStatus Lampu");
		insert();
		view();
	}
	
	int Analisis_Lampu(){
		System.out.println("Status Lampu");
		if(Jumlah >= 18){
			System.out.println("Sesuai");
			
		}
		else {
			System.out.println("TIdak Sesuai");
			 
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
	
	public String Analisis_Posisi(){
		if(Posisi.equals("atapruangan")){
			System.out.println("Sesuai");
		}
		
		else{
			System.out.println("Tidak sesuai");
		}
		return Posisi;
	}

	
	public void save(){
		try{
			FileWriter write = new FileWriter("Status_Lampu.txt");
			write.write("Result Lampu");
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
