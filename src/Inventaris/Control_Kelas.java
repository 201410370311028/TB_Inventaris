package Inventaris;

import java.util.Scanner;

public class Control_Kelas {
   Identitas_Ruang_Kelas user_identitas = new Identitas_Ruang_Kelas();
   Luas_Ruang_Kelas user_luas = new Luas_Ruang_Kelas();
   Kondisi_Kelas user_kondisi = new Kondisi_Kelas();
   Lingkungan_Kelas user_lingkungan = new Lingkungan_Kelas();
   Kebersihan_Kelas user_Kebersihan = new Kebersihan_Kelas();
   Kenyamanan_Kelas user_kenyamanan = new Kenyamanan_Kelas();
   Keamanan_Kelas user_keamanan = new Keamanan_Kelas();
    
   Scanner scan;
   
    
   void insertIdentitas_Ruang_Kelas(){
	   
	   scan = new Scanner(System.in);
       
        System.out.println("Masukan Ruang Kelas Yang Anda Gunakan : ");
        user_identitas.setRuang_Kelas(scan.nextInt());
        
        System.out.println("Masukan Gedung Perkuliahan Yang Anda Gunakan : ");
        user_identitas.setLokasi_Ruang(scan.nextLine());
        
        System.out.println("Masukan Fakultas Pengguna Kelas : ");
        user_identitas.setPengguna_Ruang(scan.nextLine());
    }

   void insertLuas_Ruang_Kelas(){
	   scan = new Scanner(System.in);
        
        System.out.println("Masukan Panjang Ruang : ");
        user_luas.setPanjang_Ruang(scan.nextInt());
        
        System.out.println("Masukan Lebar Ruang:  ");
        user_luas.setLebar_Ruang(scan.nextInt());
        
        System.out.println("Masukan Jumlah Kursi : ");
        user_luas.setJumlah_Kursi(scan.nextInt());
        
        System.out.println("Masukan Jumlah Pintu : ");
        user_luas.setJumlah_Pintu(scan.nextInt()); 
        
        System.out.println("masukan Jumlah Jendela : ");
        user_luas.setJumlah_Jendela(scan.nextInt());
    }
   
   void analisaLuas_Ruang_Kelas(){
	   
      if (user_luas.getPanjang_Ruang() < user_luas.getLebar_Ruang()){
          System.out.println("Angka Yang Anda Masukan salah");
      } 
      
      else if (user_luas.getPanjang_Ruang() == user_luas.getLebar_Ruang()){
        System.out.println("Tidak Ada Ruang Yang Berbentuk Kotak");
      }
      
      if (user_luas.Ratio_Ruang() >= 0.5){
          System.out.println(" Ruang Kelas memenuhi Standard ");
      }
      
      else if (user_luas.Ratio_Ruang() <= 0.5){
          System.out.println(" Ruang Kelas Tidak memenuhi Standard ");
      }
      
      if (user_luas.getJumlahPintu() >= 2){
          System.out.println(" Pintu Ruang Sesuai dengan Data ");
      }
          
      else if(user_luas.getJumlahPintu() <= 2){
          System.out.println(" Pintu Ruang Tidak Sesuai Dengan Data ");
      }
      
      if (user_luas.getJumlah_Jendela() >= 1){
          System.out.println(" Jumlah Jendela sesuai ");
      }
      
      else if (user_luas.getJumlah_Jendela() == 0){
          System.out.println(" Jumlah Jendela Tidak Sesuai dengan Data ");
   }
      
   }
   
   void insertKondisi_Kelas(){
	   scan = new Scanner(System.in);
	   
       System.out.println("Masukan Jumlah Stop Kontak : ");
       user_kondisi.setJumlah_Stop_Kontak(scan.nextInt());
       
       System.out.println("Masukan Kondisi Stop Kontak : ");
       user_kondisi.setKondisi_Stop_Kontak(scan.nextLine());
       
       System.out.println("Masukan Letak Stop Kontak : di pojok ruangan/tidak");
       user_kondisi.setLetak_Stop_Kontak(scan.nextLine());
       
       System.out.println("Masukan Posisi Stop Kontak : (dekat meja dosen/tidak)");
       user_kondisi.setPosisi_Stop_Kontak(scan.nextLine());
       
       System.out.println("Masukan Jumlah Kabel LCD : ");
       user_kondisi.setJumlah_Kabel_LCD(scan.nextInt());
       
       System.out.println("Masukan Kondisi Kabel LCD : ");
       user_kondisi.setKondisi_Kabel_LCD(scan.nextLine());
       
       System.out.println("Masukan Letak Kabel LCD : ");
       user_kondisi.setLetak_Kabel_LCD(scan.nextLine());
       
       System.out.println("Masukan Jumlah Lampu : ");
       user_kondisi.setJumlah_Lampu(scan.nextInt());
       
       System.out.println("Masukan Kondisi Lampu : ");
       user_kondisi.setKondisi_Lampu(scan.nextLine());
       
       System.out.println("Masukan Letak Lampu : ");
       user_kondisi.setLetak_Lampu(scan.nextLine());
       
       System.out.println("Masukan SSID Hotspot UMM : ");
       user_kondisi.setSSID(scan.nextLine());
       
       System.out.println("Apakah anda dapat login : (bisa bogin/tidak bisa");
       user_kondisi.setLogin(scan.nextLine());
       
       System.out.println("Masukan Bandwidth Hotspot : ");
       user_kondisi.setBandwidth(scan.nextInt());
       
       System.out.println("Masukan Jumlah Kipas Angin : ");
       user_kondisi.setJumlah_Kipas_Angin(scan.nextInt());
       
       System.out.println("Masukan Kondisi Kipas Angin : ");
       user_kondisi.setKondisi_Kipas_Angin(scan.nextLine());
       
       System.out.println("Masukan Letak Kipas Angin : ");
       user_kondisi.setLetak_Kipas_Angin(scan.nextLine());
       
       System.out.println("Masukan Jumlah AC : ");
       user_kondisi.setJumlah_AC(scan.nextInt());
       
       System.out.println("Masukan Kondisi AC : ");
       user_kondisi.setKondisi_AC(scan.nextLine());
       
       System.out.println("Masukan Letak AC : ");
       user_kondisi.setLetak_AC(scan.nextLine());
       
       System.out.println("Masukan Jumlah CCTV : ");
       user_kondisi.setJumlah_CCTV(scan.nextInt());
       
       System.out.println("Masukan Kondisi CCTV : ");
       user_kondisi.setKondisi_CCTV(scan.nextLine());
       
       System.out.println("Masukan Letak CCTV : ");
       user_kondisi.setLetak_CCTV(scan.nextLine());
   }
   
   void AnalisaKondisi_Ruang_Kelas(){
       
       String Kondisi = "Baik";
       String Letak_Stop_Kontak = "di pojok ruangan";
       String Letak_Stop_Kontak_1 = "dekat dosen";
       String Kondisi_Kabel_LCD = "berfungsi";
       String Letak_Kabel_LCD = "dekat dosen";
       String posisi= "atap ruangan";
       String posisi_1= "di belakang";
       String posisi_2= "di samping";
       String posisi_3= "di depan";
       String SSID = "UMM Hotspot";
       String Login = "bisa login";
       
       
     
       
       if(user_kondisi.getJumlah_Stop_Kontak() >= 4){
           System.out.println(" Sesuai Standard ");
                if(Kondisi.equals(user_kondisi.getKondisi_Stop_Kontak())){
                    System.out.println(" Sesuai Standard ");
           }
       }
       
       else {
           System.out.println("Tidak Sesuai Standard ");
       }
       
       
      if(Letak_Stop_Kontak.equals(user_kondisi.getLetak_Stop_Kontak())){
          if(Letak_Stop_Kontak_1.equals(user_kondisi.getPosisi_Stop_Kontak())){
              System.out.println(" Sesuai Standard ");
          }
      }
      
      else {
           System.out.println("Tidak Sesuai Standard ");
       }
       
      if(user_kondisi.getJumlah_Kabel_LCD() >= 1 ){
           System.out.println("Tidak Sesuai Standard ");
       }
       
      else {
           System.out.println("Tidak Sesuai Standard ");
       }
       
      if(Kondisi_Kabel_LCD.equals(user_kondisi.getKondisi_Kabel_LCD())){
            System.out.println("Sesuai Standard ");
       }
       
      else{
            System.out.println("Tidak Sesuai Standard ");
       }
       
      if(Letak_Kabel_LCD.equals(user_kondisi.getLetak_Kabel_LCD())){
            System.out.println("Sesuai Standard ");
       }
       
      else{
            System.out.println("Tidak Sesuai Standard ");
       }
       
      if(user_kondisi.getJumlah_Lampu() >= 18){
           if(Kondisi.equals(user_kondisi.getKondisi_Lampu())){
               System.out.println("Sesuai Standard ");
            }
       }
       
      else{
           System.out.println("Tidak Sesuai Standard ");
       }
      
       
       if(posisi.equals(user_kondisi.getLetak_Lampu())){
           System.out.println("Sesuai Standard ");
       }
       
       else{
           System.out.println("Tidak Sesuai Standard ");
       }
       
       if(user_kondisi.getJumlah_Kipas_Angin()>=2){
           if(Kondisi.equals(user_kondisi.getKondisi_Kipas_Angin())){
               System.out.println("Sesuai Standard ");
           }
       }
       
       else{
           System.out.println("Tidak Sesuai Standard ");
       }
       
       if(posisi.equals(user_kondisi.getLetak_Kipas_Angin())){
          System.out.println("Sesuai Standard ");
       }
       
       else{
           System.out.println("Tidak Sesuai Standard ");
       }
       
       if(user_kondisi.getJumlah_AC()>=1){
           System.out.println("Sesuai Standard ");
       }
       
       else{
           System.out.println("Tidak Sesuai Standard ");
       }
       
      if(Kondisi.equals(user_kondisi.getKondisi_AC())){
            System.out.println("Sesuai Standard ");
      }
      
      else{
           System.out.println("Tidak Sesuai Standard ");
       }
      
      if(posisi_1.equals(user_kondisi.getLetak_AC())){
           System.out.println("Sesuai Standard ");
       }
      
      if(posisi_2.equals(user_kondisi.getLetak_AC())){
           System.out.println("Sesuai Standard ");
       }
      
      else{
           System.out.println("Tidak Sesuai Standard ");
       }
      
      if(SSID.equals(user_kondisi.getSSID())){
          System.out.println("Sesuai Standard ");
      }
      
      if(Login.equals(user_kondisi.getLogin())){
          System.out.println("Sesuai Standard ");
      }
      
      else{
           System.out.println("Tidak Sesuai Standard ");
      }
      
      if(user_kondisi.getJumlah_CCTV()== 2){
          System.out.println("Sesuai Standard ");
            if(Kondisi.equals(user_kondisi.getKondisi_CCTV())){
              System.out.println("Sesuai Standard ");
          }
      }
      
      else{
         System.out.println("Tidak Sesuai Standard ");
      }
      
     if(posisi_3.equals(user_kondisi.getLetak_CCTV())){
         if(posisi_3.equals(user_kondisi.getLetak_CCTV())){
             System.out.println("Sesuai Standard ");
         }
     }
    }
   
   void insertLingkungan_Kelas(){
	   scan = new Scanner(System.in);
       
       System.out.println("Kondisi Lantai : ");
       user_lingkungan.setKondisi_Lantai(scan.nextLine());
       
       System.out.println("Kondisi Dinding : ");
       user_lingkungan.setKondisi_Dinding(scan.nextLine());
       
       System.out.println("Kondisi Atap : ");
       user_lingkungan.setKondisi_Atap(scan.nextLine());
       
       System.out.println("Kondisi Pintu : ");
       user_lingkungan.setKondisi_Pintu(scan.nextLine());
       
       System.out.println("Kondisi Jendela : ");
       user_lingkungan.setKondisi_Jendela(scan.nextLine());
   }

   void AnalisaLingkungan_Kelas(){
       String Kondisi = "baik";
       
       if(Kondisi.equals(user_lingkungan.getKondisi_Lantai())){
            if(Kondisi.equals(user_lingkungan.getKondisi_Dinding())){
                 if(Kondisi.equals(user_lingkungan.getKondisi_Atap())){
                      if(Kondisi.equals(user_lingkungan.getKondisi_Pintu())){
                           if(Kondisi.equals(user_lingkungan.getKondisi_Jendela())){
                               System.out.println("Sesuai Standard ");
                           }
                      }
                 }
            }
       }
       else{
           System.out.println(" TIdak Sesuai Standard ");
       } 
   }
   
   void insertKebersihan_Kelas(){
	   scan = new Scanner(System.in);
	   
       System.out.println("Kondisi Sirkulasi Udara : (baik/tidak) ");
       user_Kebersihan.setSirkulasi_Udara(scan.nextLine());
       
       System.out.println("Masukan Nilai Cahaya : ");
       user_Kebersihan.setNilai_Cahaya(scan.nextInt());
       
       System.out.println("Masukan Kelembaban: ");
       user_Kebersihan.setKelembaban(scan.nextInt());
       
       System.out.println("Masukan Suhu Ruangan : ");
       user_Kebersihan.setSuhu(scan.nextInt());
   }
   
   void AnalisaKebersihan_Kelas(){
       String Sirkulasi = "lancar";
       
       if(Sirkulasi.equals(user_Kebersihan.getSirkulasi_Udara())){
           System.out.println(" Sesuai Standard ");
       }
       
       else{
           System.out.println(" Tidak Sesuai Standard ");
       }
       
       if( user_Kebersihan.getNilai_Cahaya()<=350 == user_Kebersihan.getNilai_Cahaya()>=250){
           System.out.println(" Sesuai Standard ");
       }
       
        else{
           System.out.println(" Tidak Sesuai Standard ");
       }
       
        if( user_Kebersihan.getKelembaban()<=80 == user_Kebersihan.getKelembaban()>=70){
           System.out.println(" Sesuai Standard ");
       }
       
        else{
           System.out.println(" Tidak Sesuai Standard ");
       }
        
        if( user_Kebersihan.getSuhu()<=35 == user_Kebersihan.getSuhu()>=25){
           System.out.println(" Sesuai Standard ");
       }
       
        else {
           System.out.println(" Tidak Sesuai Standard ");
       }
   }
   
   void insertKenyamanan_Kelas(){
	   scan = new Scanner(System.in);
	   
       System.out.println("Kondisi Kebisingan : ");
       user_kenyamanan.setKebisingan(scan.nextLine());
       
       System.out.println("Kondisi aroma kelas : ");
       user_kenyamanan.setBau(scan.nextLine());
       
       System.out.println("Kondisi Jendela : ");
       user_kenyamanan.setKebocoran(scan.nextLine());
       
       System.out.println("Kondisi kerusakan : ");
       user_kenyamanan.setKerusakan (scan.nextLine());
   }
   
   void AnalisisKenyamananKelas(){
       
       String Bising = "tidak bising";
       String Bau = "tidak bau";
       String Bocor = "tidak bocor";
       String Kerusakan = "tidak rusak";
       String Keausan = "tidak aus";
       
       if(Bising.equals(user_kenyamanan.getKebisingan())){
           System.out.println("Sesuai");
       }
       else{
           System.out.println("Tidak Sesuai ");
       }
       
       if(Bau.equals(user_kenyamanan.getBau())){
           System.out.println("Sesuai");
       }
       else{
           System.out.println("Tidak Sesuai ");
       }
       
       if(Bocor.equals(user_kenyamanan.getKebocoran())){
           System.out.println("Sesuai");
       }
       else{
           System.out.println("Tidak Sesuai ");
       }
       
       if(Kerusakan.equals(user_kenyamanan.getKerusakan())){
           System.out.println("Sesuai");
       }
       else{
           System.out.println("Tidak Sesuai ");
       }
       if(Keausan.equals(user_kenyamanan.getKeausan())){
           System.out.println("Sesuai");
       }
       else{
           System.out.println("Tidak Sesuai ");
       }
       
       
   
  
   }
   
   void insertKeamananKelas(){
	    scan = new Scanner(System.in);
	   
        System.out.println("Kekeohan Kelas : ");
        user_keamanan.setKekokohan(scan.nextLine());
        
        System.out.println("Kelengkapan Kunci Pintu Dan Jendela :  ");
        user_keamanan.setKunci(scan.nextLine());
        
        System.out.println("Keamanan Ruangan : ");
        user_keamanan.setBahaya(scan.nextLine());
        
   }
   
   void AnalisaKeamananKelas(){
       String Kokoh = "kokoh";
       String Kunci = "ada";
       String Keamanan = "aman";
       
       if(Kokoh.equals(user_keamanan.getKekokohan())){
            System.out.println("Sesuai");
       }
       else{
            System.out.println("tidak sesuai ");
       }
       
       if(Kunci.equals(user_keamanan.getKunci())){
            System.out.println("Sesuai");
       }
       else{
            System.out.println("tidak sesuai ");
       }
       
       if(Keamanan.equals(user_keamanan.getBahaya())){
            System.out.println("Sesuai");
       }
       else{
            System.out.println("tidak sesuai ");
       }
   }
     
}

   