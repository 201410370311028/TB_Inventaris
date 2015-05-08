package rebuild_inventaris;

public class Status_Kipas_Angin extends Status_Kelas {

	public Status_Kipas_Angin() {
			input();
			view();
	}
	
	boolean Analisis_Kipas_Angin(){
		
		System.out.println("Status Kipas Angin");
		
		int Kipas_Angin = 0;
		
		if(Kipas_Angin >= 2){
			System.out.println("Sesuai");
			return true;
		}
		
		else {
			System.out.println("TIdak Sesuai");
			return false;
		}

	}
}