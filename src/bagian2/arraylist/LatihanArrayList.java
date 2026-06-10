package bagian2.ArrayList;

import java.util.ArrayList;

public class LatihanArrayList {
    public static void main(String[] args) {
        
    //Soal 1
        System.out.println("=== SOAL 1 ===");
        
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Telur");
        
        System.out.println("Sebelum dihapus :" + daftarBelanja);
        
        daftarBelanja.remove(1); //hapus item ke-2 yaitu gula
        
        System.out.println("Setelah dihapus:" + daftarBelanja);
        System.out.println("Jumlah item:" + daftarBelanja.size());
        
    //Soal 2
        System.out.println("\n=== SOAL 2 ===");
        
        ArrayList<Integer> nilai = new ArrayList<>();
        
        nilai.add(70);
        nilai.add(95);
        nilai.add(60);
        nilai.add(88);
        nilai.add(75);
        
        int max = nilai.get(0);
        
        for (int n : nilai) {
            if (n > max) {
                max = n;
            }
        }
        
        System.out.println("Data nilai :" + nilai);
        System.out.println("Nilai terbesar :" + max);
        
        
      //Soal 3
        System.out.println("\n=== SOAL 3 ===");
        
        ArrayList<String> nama = new ArrayList<>();
        
        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ayu");
        nama.add("Citra");
        nama.add("Adit");
        nama.add("Doni");
        
        System.out.println("Nama yang diawali huruf A");
        
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
        
}
}