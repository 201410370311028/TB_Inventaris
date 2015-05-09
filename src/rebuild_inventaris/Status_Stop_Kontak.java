package rebuild_inventaris;

public class Status_Stop_Kontak extends Status_Kelas{
	
	public Status_Stop_Kontak() {
		System.out.println("Status Stop Kontak");
		input();
		view();
	}
	boolean Analisis_Stop_Kontak(){
		if (jumlah >= 4){
			System.out.println("Jumlah stop kontak Sesuai");
			return true;
		}
		else{
			System.out.println("Jumlah stop kontak tidak Sesuai");
			return false;
		}
	}
	String Kondisi_Stop_Kontak(){
		if (kondisi.equals("baik") && jumlah == 4){
			System.out.println("kondisi stop kontak Sesuai");
		}
		else {
			System.out.println("kondisi stop kontak tidak Sesuai");
		}
		return kondisi;
	}
	String Posisi_Stop_Kontak(){
		if (posisi.equals("dekat dosen") && jumlah == 4){
			System.out.println("posisi kipas angin Sesuai");
		}
		else {
			System.out.println("poisisi stop kontak tidak Sesuai");
		}
		return posisi;
	}
}
