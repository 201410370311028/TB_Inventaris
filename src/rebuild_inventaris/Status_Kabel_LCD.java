package rebuild_inventaris;

public class Status_Kabel_LCD extends Status_Kelas{

	public Status_Kabel_LCD() {
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
