package rebuild_inventaris;

public class Status_Kipas_Angin extends Status_Kelas {

	public Status_Kipas_Angin() {
			input();
			view();
	}
	boolean Analisis_Kipas_Angin(){
		if (jumlah >= 2){
			System.out.println("Jumlah kipas angin Sesuai");
			return true;
		}
		else{
			System.out.println("Jumlah kipas angin tidak Sesuai");
			return false;
		}
	}
	String Kondisi_Kipas_Angin(){
		if (kondisi.equals("baik") && jumlah == 2){
			System.out.println("kondisi kipas angin Sesuai");
		}
		else {
			System.out.println("kondisi kipas angin tidak Sesuai");
		}
		return kondisi;
	}
	String Posisi_Kipas_Angin(){
		if (posisi.equals("atap ruangan") && jumlah == 2){
			System.out.println("posisi kipas angin Sesuai");
		}
		else {
			System.out.println("poisisi kipas angin tidak Sesuai");
		}
		return posisi;
	}

}