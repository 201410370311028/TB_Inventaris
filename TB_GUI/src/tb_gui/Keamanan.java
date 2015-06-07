package Inventaris;
import java.io.FileWriter;
import java.util.Scanner;
public class Keamanan {
	static Analisis aman = new Analisis();
	static Scanner input = new Scanner(System.in);
	
	public static void Keamanan_Kelas() {
		System.out.println("======================");
		System.out.println("Analisa Keamanan Kelas");
		System.out.println("======================");
		System.out.println("Apakah Bangunan Kokoh : ");
		aman.setKokoh(input.next());
		System.out.println("Apakah Ada Kunci Pintu dan jendela : ");
		aman.setKunci(input.next());
		System.out.println("Apakah Ruangan Aman dari bahaya :");
		aman.setBahaya(input.next());
		
		System.out.println("Bangunan : " + aman.getKokoh());
		System.out.println("Kunci : " + aman.getKunci());
		System.out.println("Bahaya : " + aman.getBahaya());
		
	}
	public static void AnalisaKeamananKelas(){
	       String Kokoh = "kokoh";
	       String Kunci = "ada";
	       String Keamanan = "aman";
	       
	       if(Kokoh.equals(aman.getKokoh())){
	            System.out.println("Sesuai");
	       }
	       else{
	            System.out.println("tidak sesuai ");
	       }
	       
	       if(Kunci.equals(aman.getKunci())){
	            System.out.println("Sesuai");
	       }
	       else{
	            System.out.println("tidak sesuai ");
	       }
	       
	       if(Keamanan.equals(aman.getBahaya())){
	            System.out.println("Sesuai");
	       }
	       else{
	            System.out.println("tidak sesuai ");
	       }
	   }
	public static void editaman(){
		String edit;
		
		System.out.println("apakah anda ingin mengedit inputan keamanan ? ");
		edit = input.next();
		if(edit.equals("iya")){
			AnalisaKeamananKelas();
		}
		else{
			System.out.println("Terima Kasih");
		}
	}
	 
	public void save(){
		try{
			FileWriter write = new FileWriter("result_Keamanan.txt");
			write.write("Result Keamananan ");
			write.write(" |Bangunan : " + aman.getKokoh() );
			write.write(" |Kunci : " + aman.getKunci());
			write.write(" |Bahaya : " + aman.getBahaya());
			write.close();
		}
			catch(Exception e){
				e.printStackTrace();
			}
		}
}
