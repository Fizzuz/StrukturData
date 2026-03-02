package jobsheet2;

public class MataKuliahMain17 {
    public static void main(String[] args) {
        MataKuliah17 mk1 = new MataKuliah17();
        mk1.kodeMk = "14313";
        mk1.nama = "Algoritma Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        System.out.println("=== INFORMASI MATKUL 1 ===");
        mk1.tampilkanInformasi();
        mk1.ubahSks(4);
        mk1.tambahJam(2);
        mk1.kurangijam(1);
        mk1.tampilkanInformasi();

        System.out.println();

        MataKuliah17 mk2 = new MataKuliah17("18243", "Basis Data", 2, 3);
        System.out.println("=== INFORMASI MATKUL 2 ===");
        mk2.tampilkanInformasi();
        mk2.tambahJam(2);
        mk2.kurangijam(3);
        mk2.tampilkanInformasi();

    }
    
    
}
