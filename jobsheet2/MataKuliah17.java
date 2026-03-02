package jobsheet2;

public class MataKuliah17 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

void tampilkanInformasi(){
    System.out.println("Kode Matkul: " +kodeMk );
    System.out.println("Nama: " +nama );
    System.out.println("SKS: " +sks);
    System.out.println("Jumlah jam: " + jumlahJam);
}
void ubahSks(int sksBaru){
    sks = sksBaru;
}
void tambahJam(int jam){
    jumlahJam += jam;
    System.out.println("Jam berhasil ditambah. Jumlah jam sekarang: " + jumlahJam);
    
}
void kurangijam(int jam){
    if (jumlahJam >= jam){
        jumlahJam -= jam;
        System.out.println("Jam berhasil dikurangi. Jumlah jam sekarang: " +jumlahJam);
    } else {
        System.out.println("Jumlah jam tidak valid.");
    }
}
public MataKuliah17(){
    this.kodeMk = "";  
    this.nama = "";    
    this.sks = 0;
    this.jumlahJam = 0;
}
public MataKuliah17(String kodeMk, String nama, int sks, int jumlahJam) {
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

}
