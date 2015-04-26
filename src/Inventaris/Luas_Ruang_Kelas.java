package Inventaris;


public class Luas_Ruang_Kelas {
    
    private double Panjang_Ruang;
    private double Lebar_Ruang;
    private int Jumlah_Kursi;
    private int Jumlah_Pintu;
    private int Jumlah_Jendela;
    private double Luas_Ruang;
    private double Ratio_Ruang;
    
    void setPanjang_Ruang(double Panjang){
        this.Panjang_Ruang = Panjang;
    }
    
    double getPanjang_Ruang(){
        return this.Panjang_Ruang;
    }
    
    void setLebar_Ruang(double Lebar){
        this.Lebar_Ruang = Lebar;
    }
    
    double getLebar_Ruang(){
        return this.Lebar_Ruang;
    }
    
    void setJumlah_Kursi(int Total_Kursi){
        this.Jumlah_Kursi = Total_Kursi;
    }
    
    int getJumlah_Kursi(){
        return this.Jumlah_Kursi;
    }
    
    void setJumlah_Pintu(int Total_Pintu){
        this.Jumlah_Pintu = Total_Pintu;
    }
    
    int getJumlahPintu(){
        return this.Jumlah_Pintu;
    }
    
    void setJumlah_Jendela(int Total_Jendela){
        this.Jumlah_Jendela = Total_Jendela;
    }
    
    int getJumlah_Jendela(){
        return this.Jumlah_Jendela;
    }
    
	public double getLuas_Ruang() {
		return Luas_Ruang;
	}

	public void setLuas_Ruang(double luas_Ruang) {
		Luas_Ruang = luas_Ruang;
	}

	public double getRatio_Ruang() {
		return Ratio_Ruang;
	}

	public void setRatio_Ruang(double ratio_Ruang) {
		Ratio_Ruang = ratio_Ruang;
	}
    
    double Luas_Ruang(){
        return Panjang_Ruang*Lebar_Ruang;
    }
    
    double Ratio_Ruang(){
        return Luas_Ruang()/Jumlah_Kursi;
    }
   
}
