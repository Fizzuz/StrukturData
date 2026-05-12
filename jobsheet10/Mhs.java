package jobsheet10;

public class Mhs {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mhs(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " " + nama + " " + prodi + " " + kelas);
    }
}