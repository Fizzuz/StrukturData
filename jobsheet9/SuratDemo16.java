package jobsheet9;

import java.util.Scanner;

public class SuratDemo16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat16 stack = new StackSurat16(10);
        int pilih;

        do {
            System.out.println("\n==== MENU PENGELOLAAN SURAT IZIN ====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Masukkan Jenis Izin (S=Sakit, I=Izin Lain): ");
                    char jenis = scan.nextLine().charAt(0);
                    System.out.print("Masukkan Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat16 s = new Surat16(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;
                    
                case 2:
                    Surat16 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa + " (ID: " + diproses.idSurat + ")");
                    }
                    break;
                    
                case 3:
                    Surat16 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("\n--- Data Surat Teratas ---");
                        System.out.println("ID Surat         : " + terakhir.idSurat);
                        System.out.println("Nama             : " + terakhir.namaMahasiswa);
                        System.out.println("Kelas            : " + terakhir.kelas);
                        System.out.println("Jenis Izin       : " + (terakhir.jenisIzin == 'S' || terakhir.jenisIzin == 's' ? "Sakit" : "Izin Lain"));
                        System.out.println("Durasi           : " + terakhir.durasi + " Hari");
                    }
                    break;
                    
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                    
                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih angka 1-5.");
            }
        } while (pilih != 5);
        
        scan.close();
    }
}
