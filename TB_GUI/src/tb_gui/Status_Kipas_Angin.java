package Inventaris;
import java.io.FileWriter;
public class Status_Kipas_Angin extends Status_Kelas {
	public Status_Kipas_Angin() {
		System.out.println("\nStatus Kipas Angin");
		insert();
		view();
	}

	int Analisis_Kipas_Angin(){
	if (Jumlah >= 2){
		System.out.println("Jumlah kipas angin Sesuai");
	}
	else{
		System.out.println("Jumlah kipas angin tidak Sesuai");
	}
	return Jumlah;
	}
 
	String Kondisi_Kipas_Angin(){
		if (Kondisi.equals("baik") && Jumlah == 2){
		System.out.println("kondisi kipas angin Sesuai");
		}
		else {
		System.out.println("kondisi kipas angin tidak Sesuai");
		}
		return Kondisi;
		}

	String Posisi_Kipas_Angin(){
		if (Posisi.equals("atap ruangan") && Jumlah == 2){
		System.out.println("posisi kipas angin Sesuai");
		}
		else {
		System.out.println("poisisi kipas angin tidak Sesuai");
		}
		return Posisi;
	}
	
	@Override
	public void save(){
		try{
			FileWriter write = new FileWriter("result_Kipas_Angin.txt");
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
