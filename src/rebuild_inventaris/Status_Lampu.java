package rebuild_inventaris;

public class Status_Lampu extends Status_Kelas {

	public Status_Lampu() {
		System.out.println("Status Lampu");
		input();
		view();
	}
	
	boolean Analisis_Kabel_LCD(){
		System.out.println("Status Kabel LCD");
		
		int kabel_LCD = 0;
		
		if(kabel_LCD >= 4){
			System.out.println("Sesuai");
			return true;
		}
		
		else {
			System.out.println("TIdak Sesuai");
			return false;
		}
		
	}
}
