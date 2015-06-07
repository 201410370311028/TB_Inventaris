package Inventaris;
import java.io.FileWriter;
import java.util.Scanner;

public class Kenyamanan {
	static Analisis nyaman = new Analisis();
	static Scanner input = new Scanner(System.in);
	
	public static void Kenyamanan_Kelas(){
		System.out.println("=========================");
		System.out.println("Analisis Kenyamanan Kelas");
		System.out.println("=========================");
		System.out.println("Bagaimana dengan Kebisingan Kelas : ");
		nyaman.setKebisingan(input.next());
		System.out.println("Bagaimana dengan bau di kelas : ");
		nyaman.setBau(input.next());
		System.out.println("Apakah ada kebocoran di dalam kelas : ");
		nyaman.setKebocoran(input.next());
		System.out.println("Apakah ada kerusakan di dalam kelas : ");
		nyaman.setKerusakan(input.next());
		System.out.println("Apakah ada keausan di dalam kelas : ");
		nyaman.setKeausan(input.next());
		
		System.out.println("Kebisingan : " + nyaman.getKebisingan());
		System.out.println("Bau : " + nyaman.getBau());
		System.out.println("Kebocoran : " + nyaman.getKebocoran());
		System.out.println("Kerusakan : " + nyaman.getKerusakan());
		System.out.println("Keausan : " + nyaman.getKeausan());
		
	}
	public static void AnalisisKenyamananKelas(){
	String Bising = "tidak_bising";
    String Bau = "tidak_bau";
    String Bocor = "tidak_bocor";
    String Kerusakan = "tidak_rusak";
    String Keausan = "tidak_aus";
    
    if(Bising.equals(nyaman.getKebisingan())){
        System.out.println("Sesuai");
    }
    else{
        System.out.println("Tidak Sesuai ");
    }
    
    if(Bau.equals(nyaman.getBau())){
        System.out.println("Sesuai");
    }
    else{
        System.out.println("Tidak Sesuai ");
    }
    
    if(Bocor.equals(nyaman.getKebocoran())){
        System.out.println("Sesuai");
    }
    else{
        System.out.println("Tidak Sesuai ");
    }
    
    if(Kerusakan.equals(nyaman.getKerusakan())){
        System.out.println("Sesuai");
    }
    else{
        System.out.println("Tidak Sesuai ");
    }
    if(Keausan.equals(nyaman.getKerusakan())){
        System.out.println("Sesuai");
    }
    else{
        System.out.println("Tidak Sesuai ");
    } 
	}
	
	public void save(){
		try{
			FileWriter write = new FileWriter("result_Kenyamanan.txt");
			write.write("Result Kenyamanan ");
			write.write("Kebisingan : " + nyaman.getKebisingan());
			write.write("Bau : " + nyaman.getBau());
			write.write("Kebocoran : " + nyaman.getKebocoran());
			write.write("Kerusakan : " + nyaman.getKerusakan());
			write.write("Keausan : " + nyaman.getKeausan());
			write.close();
		}
			catch(Exception e){
				e.printStackTrace();
			}
		}
}
