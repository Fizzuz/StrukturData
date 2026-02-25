package jobsheet2;
import java.util.Scanner;

public class Mahasiswa17{
void tampilkanInformasi() {
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("IPK: " + IPK);
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

}