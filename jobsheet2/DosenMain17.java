package jobsheet2;

public class DosenMain17 {
    public static void main(String[] args) {
        Dosen17 dosen1 = new Dosen17();
        dosen1.idDosen = "1737";
        dosen1.nama = "Muhammad Ariyanto S.Kom., M.Kom";
        dosen1.statusAktif = false;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Sistem Informasi";

        System.out.println("=== Data Dosen 1 ===");
        dosen1.setStatusAktif(true);
        dosen1.bidangKeahlian = "AI";
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2026) +" tahun");
        dosen1.tampilkanInformasi();

        Dosen17 dosen2 = new Dosen17("3152", "Ir. Siti Aminah", true, 2010, "Data Science");
        System.out.println("=== Data Dosen 2 ===");
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2026) + " tahun");
        dosen2.tampilkanInformasi();
    }
}
