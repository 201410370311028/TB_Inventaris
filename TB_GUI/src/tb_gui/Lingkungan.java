package Inventaris;
import java.io.FileWriter;
import java.util.Scanner;

public class Lingkungan {
	static Scanner input = new Scanner(System.in);
	static Analisis lingkung = new Analisis();
	public static void Lingkungan_Kelas(){
		System.out.println("=========================");
		System.out.println("Analisis Lingkungan kelas");
		System.out.println("=========================");
		System.out.println("Input Kondisi Lantai : ");
		lingkung.setLantai(input.next());
		System.out.println("Input Kondisi Dinding : ");
		lingkung.setDinding(input.next());
		System.out.println("Input Kondisi Atap : ");
		lingkung.setAtap(input.next());
		System.out.println("Input Kondisi Pintu : ");
		lingkung.setPintu(input.next());
		System.out.println("Input Kondisi Jendela : ");
		lingkung.setB_jendela(input.next());
		
		System.out.println("==========================");
		System.out.println("Kondisi Lantai : " + lingkung.getLantai());
		System.out.println("Kondisi Dinding : " + lingkung.getDinding());
		System.out.println("Kondisi Atap : " + lingkung.getAtap());
		System.out.println("Kondisi Pintu : " + lingkung.getPintu());
		System.out.println("Kondisi Jendela : " + lingkung.getB_jendela());
	}
	public static void Analisis_Lingkungan(){
		String Kondisi = "bersih";
		if(Kondisi.equals(lingkung.getLantai())){
		if(Kondisi.equals(lingkung.getDinding())){
		if(Kondisi.equals(lingkung.getAtap())){
		if(Kondisi.equals(lingkung.getPintu())){
		if(Kondisi.equals(lingkung.getB_jendela())){		
			System.out.println("Kondisi Sesuai Harapan");
	}
		}
		}
		} 
		}else{
			System.out.println("Kondisi Tidak Sesuai Harapan");
		}
	}
	public void save(){
	try{
		FileWriter write = new FileWriter("result_Lingkungan.txt");
		write.write("Result Lingkunan");
		write.write("Kondisi Lantai  : " + lingkung.getLantai()+"\n");
		write.write("Kondisi Dinding : " + lingkung.getDinding()+"\n");
		write.write("Kondisi Atap    : " + lingkung.getAtap()+"\n");
		write.write("Kondisi Pintu   : " + lingkung.getPintu()+"\n");
		write.write("Kondisi Jendela : " + lingkung.getB_jendela()+"\n");
		write.close();
	}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
