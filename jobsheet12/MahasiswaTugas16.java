package jobsheet12;

public class MahasiswaTugas16 {
    String nim;
    String nama;

    public MahasiswaTugas16(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("--------------------");
    }
}