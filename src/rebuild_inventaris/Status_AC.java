package rebuild_inventaris;

public class Status_AC extends Status_Kelas  {

	public Status_AC() {
		System.out.println("Status AC");
		input("Status AC");
		view("Status AC");
	}
	public boolean Analisis_AC(){
		if (jumlah > 1){
			System.out.println("Jumlah AC sesuai");
			return true;
		}		
		else {
		System.out.println("Jumlah AC Tidak sesuai");
		return false;
		}
	}
	public String Kondisi_AC(){
		if(kondisi.equals("baik")){
			System.out.println("kondisi sesuai");
		}
		
		else {
		System.out.println("kondisi tidak sesuai");
	}
		
		return kondisi;
	}
	public String Posisi_AC(){
		if (posisi.equals("dibelakang")){
			System.out.println("posisi sesuai");
		}
		else{
			System.out.println("posisi tidak sesuai");
		}
		return posisi;
	}
}
