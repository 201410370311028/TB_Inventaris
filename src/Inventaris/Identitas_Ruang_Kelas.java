    package Inventaris;


public class Identitas_Ruang_Kelas {
    
    private int Ruang_Kelas;
    private String Lokasi_Ruang;
    private String Pengguna_Ruang;
    
    
    void setRuang_Kelas(int Ruang){
        this.Ruang_Kelas = Ruang;
    }
    
    int getRuang_Kelas(){
        return this.Ruang_Kelas;
    }
    
    void setLokasi_Ruang(String Gedung){
       this.Lokasi_Ruang = Gedung;
    }
    
    String getLokasi_Ruang(){
        return this.Lokasi_Ruang;
    }
    
    void setPengguna_Ruang(String Fakultas){
        this.Pengguna_Ruang = Fakultas;
    }
    
    String getPengguna_Ruang(){
        return this.Pengguna_Ruang;
    }
    
}
