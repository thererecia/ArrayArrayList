package tugas;

// Nama : Therecia Olga Goenawan
// NPM  : 2510010421

public class MainTugas {
    
    public static void main(String[] args) {
        
        String[] mataKuliah = {
            "Pemrograman Berbasis Objek",
            "Struktur Data",
            "Basis Data"
        };
        
        System.out.println("=== DAFTAR MATA KULIAH ===");
        
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        
        System.out.println();
        
        KelasKuliah kelas = new KelasKuliah();
        
        kelas.tambahMahasiswa(
            new Mahasiswa("Andi", "251001", 80));
        
        kelas.tambahMahasiswa(
            new Mahasiswa("Budi", "251002", 55));
        
        kelas.tambahMahasiswa(
            new Mahasiswa("Citra", "251003", 90));
        
        kelas.tambahMahasiswa(
            new Mahasiswa("Doni", "251004", 70));
        
        kelas.tambahMahasiswa(
            new Mahasiswa("Eka", "251005", 45));
        
        kelas.tampilkanSemua();
        
        System.out.println();
        System.out.println("Rata-rata nilai : "
            + kelas.hitungRataRata());
        
        System.out.println("Jumlah lulus : "
            + kelas.jumlahLulus());
        
        System.out.println();
        System.out.println("Menambah mahasiswa baru...");
        
        kelas.tambahMahasiswa(
            new Mahasiswa("Farah", "231006", 85));
        
        System.out.println("Jumlah mahasiswa sekarang : "
            + kelas.jumlahMahasiswa());
    }
}