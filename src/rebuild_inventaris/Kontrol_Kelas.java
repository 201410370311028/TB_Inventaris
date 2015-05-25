package rebuild_inventaris;


public class Kontrol_Kelas extends Data_Kelas{

	public Kontrol_Kelas(){
		Data_Pengguna();
		Result_Data_Pengguna();
	}
	
	boolean Analisis_Data_Pengguna(){

		
				
		if(lokasi_kelas.equals("GKB 1")){
			System.out.println("Sesuai");
			return true;
		}
		
		if(lokasi_kelas.equals("GKB 2")){
			System.out.println("Sesuai");
			return true;
		}
		
		if(lokasi_kelas.equals("GKB 3")){
			System.out.println("Sesuai");
			return true;
		}
		
		
		if(pengguna.equals("Fakultas Teknik")){
			System.out.println("Sesuai");
			return true;
		}
		
		if(pengguna.equals("Fakultas Kedokteran")){
			System.out.println("Sesuai");
			return true;
		}
		
		if(pengguna.equals("Fakultas Ekonomi dan Bisnis")){
			System.out.println("Sesuai");
			return true;
		}
		
		if(pengguna.equals("Fakultas Keguruan dan Ilmu Pendidikan")){
			System.out.println("Sesuai");
			return true;
		}
		
		if(pengguna.equals("Fakultas Agama Islam")){
			System.out.println("Sesuai");
			return true;

		}
		
		if(pengguna.equals("Fakultas Psikologi")){
			System.out.println("Sesuai");
			return true;

		}
		
		if(pengguna.equals("Fakultas Hukum")){
			System.out.println("Sesuai");
		}
		
		if(pengguna.equals("Fakultas Pertanian dan Peternakan")){
			System.out.println("Sesuai");
			return true;
		
		}
		
		if(pengguna.equals("Fakultas Kesehatan")){
			System.out.println("Sesuai");
			return true;
			
		}
		
		if(pengguna.equals("Fakultas Ilmu Sosial dan Politik")){
			System.out.println("Sesuai");
			return true;
			
		}
		
		else{
			System.out.println("Keywoard Anda Salah");
			return false;
		}
		
		}
	
}
