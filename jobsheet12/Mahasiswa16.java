package jobsheet12;

public class Mahasiswa16 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa16() {
    }

    public Mahasiswa16(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama);
        System.out.println(nim);
        System.out.println(kelas);
        System.out.println(ipk);
    }
    
}