package Inventaris;
import java.io.FileWriter;
import java.util.Scanner;
public class Kebersihan {
	static Scanner input = new Scanner(System.in);
	static Analisis bersih = new Analisis();
	
	public static void Kebersihan_Kelas(){
		System.out.println("=========================");
		System.out.println("Analisis Lingkungan kelas");
		System.out.println("=========================");
		System.out.println("Bagaimana Sirkulasi Udara : ");
		bersih.setS_Udara(input.next());
		System.out.println("Input Nilai Pencahayaan (0 - 350) : ");
		bersih.setN_Pencahayaan(input.nextInt());
		System.out.println("Input Kelembapan % : ");
		bersih.setKelembapan(input.nextInt());
		System.out.println("Input suhu celcius : ");
		bersih.setSuhu(input.nextInt());
		System.out.println("==========================");
		
		System.out.println("Sirkulasi Udara : " + bersih.getS_Udara());
		System.out.println("Pencahayaan : " + bersih.getN_Pencahayaan());
		System.out.println("Kelembapan : " + bersih.getKelembapan());
		System.out.println("Suhu Celcius : " + bersih.getSuhu());
	}
	void AnalisaKebersihan_Kelas(){
	       String Sirkulasi = "lancar";
	       
	       if(Sirkulasi.equals(bersih.getS_Udara())){
	           System.out.println(" Sesuai Standard ");
	       }
	       
	       else{
	           System.out.println(" Tidak Sesuai Standard ");
	       }
	       
	       if( bersih.getN_Pencahayaan()<=350 == bersih.getN_Pencahayaan()>=250){
	           System.out.println(" Sesuai Standard ");
	       }
	       
	        else{
	           System.out.println(" Tidak Sesuai Standard ");
	       }
	       
	        if( bersih.getKelembapan()<=80 == bersih.getKelembapan()>=70){
	           System.out.println(" Sesuai Standard ");
	       }
	       
	        else{
	           System.out.println(" Tidak Sesuai Standard ");
	       }
	        
	        if( bersih.getSuhu()<=35 == bersih.getSuhu()>=25){
	           System.out.println(" Sesuai Standard ");
	       }
	       
	        else {
	           System.out.println(" Tidak Sesuai Standard ");
	       }
	   }
	public void save(){
		try{
			FileWriter write = new FileWriter("result_Kebersihan.txt");
			write.write("Result Kebersihan ");
			write.write("Sirkulasi Udara : " + bersih.getS_Udara());
			write.write("Pencahayaan : " + bersih.getN_Pencahayaan());
			write.write("Kelembapan : " + bersih.getKelembapan());
			write.write("Suhu Celcius : " + bersih.getSuhu());
			write.close(); 
		}
			catch(Exception e){
				e.printStackTrace();
			}
		}
}
