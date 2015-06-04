package rebuild_inventaris;

public abstract class Status_Kipas_Angin extends Status_Kelas {

	public Status_Kipas_Angin() {
			input("Status Kipas Angin");
			view("Status Kipas Angin");
	}
	@Override
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
	@Override
	String Kondisi_Kipas_Angin(){
		if (kondisi.equals("baik") && jumlah == 2){
			System.out.println("kondisi kipas angin Sesuai");
		}
		else {
			System.out.println("kondisi kipas angin tidak Sesuai");
		}
		return kondisi;
	}
	@Override
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
