package rebuild_inventaris;

public class Status_Kabel_LCD extends Status_Kelas{

	public Status_Kabel_LCD() {
		input("Status Kabel LCD");
		view("Status Kabel LCD");
	}
	@Override
	boolean Analisis_Kabel_LCD(){
		if (jumlah > 1){
			System.out.println("Jumlah kabel LCD sesuai");
			return true;
		}		
		else {
		System.out.println("Jumlah kabel LCD tidak sesuai");
		return false;
		}
	}
	@Override
	String Kondisi_Kabel_LCD(){
		if (kondisi.equals("berfungsi")){
			System.out.println("kondisi kabel LCD sesuai");
		}
		else{
			System.out.println("kondisi kabel LCD tidak sesuai");
		}
		return kondisi;
	}
	@Override
	String Posisi_Kabel_LCD(){
		if(posisi.equals("dekat dosen")){
			System.out.println("posisi kabel LCD sesuai");
		}
		else{
			System.out.println("posisi kabel LCD tidak sesuai");
		}
		return posisi;
	}
}
