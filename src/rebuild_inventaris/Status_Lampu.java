package rebuild_inventaris;

public class Status_Lampu extends Status_Kelas {

	public Status_Lampu() {
		input();
		view();
	}
	
	boolean Analisis_Lampu(){
		
		System.out.println("Status Lampu");
		if(jumlah >= 18){
			System.out.println("Sesuai");
			return true;
		}
		else {
			System.out.println("TIdak Sesuai");
			return false;
		}
		
	}
	
	public String Analisisi_Kondisi(){
		if(kondisi.equals("baik")){
			System.out.println("Sesuai");
		}
		
		else{
			System.out.println("Tidak sesuai");
		}
		return kondisi;
	}
	
	public String Analisisi_Posisi(){
		if(posisi.equals("atap ruangan")){
			System.out.println("Sesuai");
		}
		
		else{
			System.out.println("Tidak sesuai");
		}
		return posisi;
	}
}
