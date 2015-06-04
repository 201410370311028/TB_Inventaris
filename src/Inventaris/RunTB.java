package Inventaris;
public class RunTB {
    public static void main(String[] args) {
        Control_Kelas[] progammer;
        progammer = new Control_Kelas[1];
        
        progammer [0] = new Control_Kelas();
  
        
        for (int i=1;i<progammer.length;i++)
        {
            progammer[i].insertIdentitas_Ruang_Kelas();
            
        }
    }
    
}
