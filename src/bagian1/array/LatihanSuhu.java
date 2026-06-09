package bagian1.array;
        
public class LatihanSuhu {
    public static void main(String[] args) {
        
        // Soal 1
        System.out.println("\n=== SOAL 1 ===");
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};
        
        double max = suhu[0];
        double min = suhu[0];
        
        for (double s : suhu) {
            if (s > max) {
                max = s;
            }
            
            if (s < min) {
                min = s;
            }
        }
        
        System.out.println("Suhu tertinggi : " + max);
        System.out.println("Suhu terendah : " + min);
        
        //soal 2
        System.out.println("\n=== SOAL 2 ===");
        
        String[] hari = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jumat"
        };
        
        System.out.println("Nama hari yang memiliki lebih dari 5 huruf:");
        
        for (String h : hari) {
            if (h.length() > 5)
                System.out.println(h);
        }
        //soal 3
        System.out.println("\n=== SOAL 3 ===");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;
        
        for (int a : angka) {
            if (a % 2 == 0) {
                genap++;
            }
        }
        
            System.out.println("Jumlah angka genap : " + genap);
    
}
    }
        
     