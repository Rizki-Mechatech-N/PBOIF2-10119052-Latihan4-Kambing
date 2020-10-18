package pboif2.pkg10119052.latihan4.kambing;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk mendeklarasi variabel 
 * lokal
 * 
 */
public class PBOIF210119052Latihan4Kambing {

    public void tambahKambing(){
        //Deklarasi Variabel Lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        PBOIF210119052Latihan4Kambing kambingJantan = new PBOIF210119052Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
