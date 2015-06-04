package rebuild_inventaris;

import java.io.FileWriter;

public class Status_Kabel_LCD extends Status_Kelas{
	
	public Status_Kabel_LCD(){
	System.out.println("\nStatus Kabel LCD");
	insert();
	view();
	}
	

	public int Analisis_Jumlah(){
		if (Jumlah >= 1){
			System.out.println("Jumlah kabel LCD sesuai");
		}
		
		else {
		System.out.println("Jumlah kabel LCD tidak sesuai");
		}
		return Jumlah; 
	
	}
	
	String Kondisi_Kabel_LCD(){
		if (Kondisi.equals("berfungsi")){
			System.out.println("kondisi kabel LCD sesuai");
		}
		else{
			System.out.println("kondisi kabel LCD tidak sesuai");
		}
		return Kondisi;
	}

	String Posisi_Kabel_LCD(){
		if(Posisi.equals("dekatdosen")){
			System.out.println("posisi kabel LCD sesuai");
		}
		else{
			System.out.println("posisi kabel LCD tidak sesuai");
		}
		return Posisi;
	}
	
	@Override
	public void save(){
		try{
			FileWriter write = new FileWriter("Hasil.txt");
			write.write("Result Kabel LCD");
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
