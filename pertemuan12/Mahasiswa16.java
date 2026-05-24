package pertemuan12;

public class Mahasiswa16 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa16(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println(
            "NIM   : " + nim +
            "\nNama  : " + nama +
            "\nkelas : " + kelas +
            "\nIPK   : " + ipk
        );
    }
}
