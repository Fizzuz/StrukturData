package jobsheet2;

public class Mahasiswa17{
double ipk;
String nim;
String nama;
String kelas;

void tampilkanInformasi() {
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("IPK: " + ipk);
    System.out.println("Kelas: " + kelas);
}
void ubahKelas(String kelasBaru){
    kelas = kelasBaru;
}
void updateIpk (double ipkBaru){
    if (ipkBaru >= 0.0 && ipkBaru <= 4.0){
        ipk = ipkBaru;
    }
    else {
        System.out.println("IPK tidak valid. Harus direntang 0.0 sampai 4.0");
    }
    
    
}
String nilaiKinerja() {
    if (ipk >= 3.5 ) {
        return "Kinerja Sangat Baik";
    } else if (ipk >=3.0){
        return "Kinerja Baik";
    }
    else if (ipk >= 2.0){
        return "Kinerja Cukup";
    }
    else {
        return "Kinerja Kurang";
    }
}
public Mahasiswa17(){
    
}
public Mahasiswa17(String nm, String nim, double ipk, String kelas){
    nama = nm;
    this.nim = nim;
    this.ipk = ipk;
    this.kelas = kelas;
}
}