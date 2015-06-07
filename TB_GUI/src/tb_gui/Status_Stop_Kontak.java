package Inventaris;
import java.io.FileWriter;
public class Status_Stop_Kontak extends Status_Kelas{
	public Status_Stop_Kontak() {
		System.out.println("\nStatus Stop Kontak");
		insert();
		view();
	}
	
	
	
	public int Analisis_Jumlah(){
		if (Jumlah >= 4){
			System.out.println("\nJumlah stop kontak Sesuai");
		}
		else{
			System.out.println("\nJumlah stop kontak tidak Sesuai");
		}
		return Jumlah; 
	
	}
	
	String Kondisi_Stop_Kontak(){
		if (Kondisi.equals("baik") && Jumlah == 4){
			System.out.println("kondisi stop kontak Sesuai");
		}
		else {
			System.out.println("kondisi stop kontak tidak Sesuai");
		}
		return Kondisi;
	}
	
	String Posisi_Stop_Kontak(){
		if (Posisi.equals("dekatdosen")){
			System.out.println("posisi kipas angin Sesuai");
		}
		else {
			System.out.println("poisisi stop kontak tidak Sesuai");
		}
		return Posisi;
	}
	
	@Override
	public void save(){
		try{
			FileWriter write = new FileWriter("result_Stop_kontak.txt");
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
