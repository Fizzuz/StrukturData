package jobsheet2;

public class Dosen17 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

void tampilkanInformasi(){
    System.out.println("ID Dosen: " +idDosen);
    System.out.println("Nama Dosen: " +nama);
    System.out.println("Status: " + statusAktif);
    System.out.println("Tahun Bergabung: " + tahunBergabung);
    System.out.println("Bidang Keahlian: " + bidangKeahlian);
}

void setStatusAktif(boolean status){
    statusAktif = status;
}
public int hitungMasaKerja(int thnSkrg){
    return thnSkrg - tahunBergabung;
}
void ubahBidangKeahlian (String bidang){
    bidangKeahlian = bidang;
}
public Dosen17(){

}
public Dosen17(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
}
}
