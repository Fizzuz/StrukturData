package jobsheet12;

import java.util.Scanner;

public class MainAntrian16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas maksimal antrian hari ini: ");
        int max = sc.nextInt();
        QueueLinkedList16 antrian = new QueueLinkedList16(max);
        
        int menu;
        do {
            System.out.println("\n=== SISTEM ANTRIAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian (Mahasiswa Mendaftar)");
            System.out.println("2. Panggil Antrian Terdepan");
            System.out.println("3. Cek Antrian Terdepan dan Terakhir");
            System.out.println("4. Cek Jumlah Antrian Saat Ini");
            System.out.println("5. Cek Status Antrian (Kosong/Penuh)");
            System.out.println("6. Kosongkan Seluruh Antrian");
            System.out.println("7. Keluar Program");
            System.out.print("Pilih menu (1-7): ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    MahasiswaTugas16 mhs = new MahasiswaTugas16(nim, nama);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.printFrontRear();
                    break;
                case 4:
                    antrian.printSize();
                    break;
                case 5:
                    System.out.println("Status Antrian Kosong : " + antrian.isEmpty());
                    System.out.println("Status Antrian Penuh  : " + antrian.isFull());
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 7:
                    System.out.println("Sistem ditutup. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (menu != 7);
        
        sc.close();
    }
}
