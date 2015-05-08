package rebuild_inventaris;

public class Analisis {
	
	Data_Kelas analisis_data = new Data_Kelas();
	
	
	
	boolean Analisis_Data_Pengguna(){

		
		String GKB_1 = "GKB 1";
		String GKB_2 = "GKB 2";
		String GKB_3 = "GKB 3";
		String FT = "teknik";
		String FK = "kedokteran";
		String FEB = "ekonomi dan bisnis";
		String FKIP = "keguruan dan ilmu pendidikan";
		String FP = "psikologi";
		String FAI = "agama islam";
		String FH = "fakultas hukum";
		String FPP = "fakultas pertanian dan perternakan";
		String FIKES = "kesehatan";
		String FISIP = "ilmu sosial dan politik";
		
				
		if(GKB_1.equals(analisis_data.getLokasi_Kelas())){
			System.out.println("Sesuai");
			return true;
		}
		
		if(GKB_2.equals(analisis_data.getLokasi_Kelas())){
			System.out.println("Sesuai");
			return true;
		}
		
		if(GKB_3.equals(analisis_data.getLokasi_Kelas())){
			System.out.println("Sesuai");
			return true;
		}
		
		
		if(FT.equals(analisis_data.getPengguna_Kelas())){
			System.out.println("Sesuai");
			return true;
		}
		
		if(FK.equals(analisis_data.getPengguna_Kelas())){
			System.out.println("Sesuai");
			return true;
		}
		
		if(FEB.equals(analisis_data.getPengguna_Kelas())){
			System.out.println("Sesuai");
			return true;
		}
		
		if(FKIP.equals(analisis_data.getPengguna_Kelas())){
			System.out.println("Sesuai");
			return true;
		}
		
		if(FP.equals(analisis_data.getPengguna_Kelas())){
			System.out.println("Sesuai");
			return true;

		}
		
		if(FAI.equals(analisis_data.getPengguna_Kelas())){
			System.out.println("Sesuai");
			return true;

		}
		
		if(FH.equals(analisis_data.getPengguna_Kelas())){
			System.out.println("Sesuai");
		}
		
		if(FPP.equals(analisis_data.getPengguna_Kelas())){
			System.out.println("Sesuai");
			return true;
		
		}
		
		if(FIKES.equals(analisis_data.getPengguna_Kelas())){
			System.out.println("Sesuai");
			return true;
			
		}
		
		if(FISIP.equals(analisis_data.getPengguna_Kelas())){
			System.out.println("Sesuai");
			return true;
			
		}
		
		else{
			System.out.println("Keywoard Anda Salah");
			return false;
		}
		
		}
	
}
