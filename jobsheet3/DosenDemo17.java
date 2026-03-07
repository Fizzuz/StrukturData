package jobsheet3;
import java.util.Scanner;

public class DosenDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        Dosenn17[] daftarDosen = new Dosenn17[3];
        String dummy;

        
        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            String jkStr = sc.nextLine();
            Boolean jenisKelamin = jkStr.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); 
            System.out.println("--------------------------------");

           
            daftarDosen[i] = new Dosenn17(kode, nama, jenisKelamin, usia);
        }

        
        System.out.println("\n======= DATA SELURUH DOSEN =======");
        int counter = 1;
        for (Dosenn17 d : daftarDosen) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("--------------------------------");
            counter++;
        }
        

        DataDosen17 dataDosen = new DataDosen17();


        dataDosen.dataSemuaDosen(daftarDosen);
        dataDosen.jumlahDosenPerJenisKelamin(daftarDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        dataDosen.infoDosenPalingTua(daftarDosen);
        dataDosen.infoDosenPalingMuda(daftarDosen);
    }
}

