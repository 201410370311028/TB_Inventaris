package rebuild_inventaris;

import java.util.*;

public class Analisis {
	
	Scanner scan = new Scanner(System.in);
	String SSID;
	int bandwith;
	
	public void Analisis_WIFI(){
		System.out.println("Masukan SSID Wifi : ");
		SSID = scan.next();
		
		System.out.println("Masukan bandwith Wifi : ");
		bandwith = scan.nextInt();
	}
	
}
