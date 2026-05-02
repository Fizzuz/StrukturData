package jobsheet7;
import java.util.Scanner;


class Mahasiswa {
    String nim; 
    String nama; 
    String prodi; 

    public Mahasiswa(String nim, String nama, String prodi) { 
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() { 
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}


class Buku {
    String kodeBuku;
    String judul; 
    int tahunTerbit; 

    public Buku(String kodeBuku, String judul, int tahunTerbit) { 
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilBuku() { 
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}


class Peminjaman {
    Mahasiswa mhs; 
    Buku buku; 
    int lamaPinjam; 
    int batasPinjam = 5;
    int terlambat; 
    int denda; 

    public Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) { 
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda(); 
    }

    public void hitungDenda() { 
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000; 
        } else {
            terlambat = 0;
            denda = 0; 
        }
    }

    public void tampilPeminjaman() { 
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda);
    }
}


public class SistemPeminjaman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Mahasiswa[] daftarMhs = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"), 
            new Mahasiswa("22002", "Budi", "Teknik Informatika"), 
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis") 
        };

        Buku[] daftarBuku = {
            new Buku("B001", "Algoritma", 2020), 
            new Buku("B002", "Basis Data", 2019), 
            new Buku("B003", "Pemrograman", 2021), 
            new Buku("B004", "Fisika", 2024) 
        };

        Peminjaman[] daftarPinjam = {
            new Peminjaman(daftarMhs[0], daftarBuku[0], 7), 
            new Peminjaman(daftarMhs[1], daftarBuku[1], 3), 
            new Peminjaman(daftarMhs[2], daftarBuku[2], 10), 
            new Peminjaman(daftarMhs[2], daftarBuku[3], 6),
            new Peminjaman(daftarMhs[0], daftarBuku[1], 4) 
        };

        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ==="); 
            System.out.println("1. Tampilkan Mahasiswa"); 
            System.out.println("2. Tampilkan Buku"); 
            System.out.println("3. Tampilkan Peminjaman"); 
            System.out.println("4. Urutkan Berdasarkan Denda"); 
            System.out.println("5. Cari Berdasarkan NIM"); 
            System.out.println("0. Keluar"); 
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:"); 
                    for (Mahasiswa m : daftarMhs) m.tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("\nDaftar Buku:"); 
                    for (Buku b : daftarBuku) b.tampilBuku();
                    break;
                case 3:
                    System.out.println("\nData Peminjaman:"); 
                    for (Peminjaman p : daftarPinjam) p.tampilPeminjaman();
                    break;
                case 4:
                    
                    for (int i = 1; i < daftarPinjam.length; i++) {
                        Peminjaman key = daftarPinjam[i];
                        int j = i - 1;
                        while (j >= 0 && daftarPinjam[j].denda < key.denda) {
                            daftarPinjam[j + 1] = daftarPinjam[j];
                            j = j - 1;
                        }
                        daftarPinjam[j + 1] = key;
                    }
                    System.out.println("\nSetelah diurutkan (Denda terbesar):"); 
                    for (Peminjaman p : daftarPinjam) p.tampilPeminjaman();
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM: "); 
                    String cariNim = scanner.next();
                    boolean ditemukan = false;
                    
                    for (Peminjaman p : daftarPinjam) {
                        if (p.mhs.nim.equals(cariNim)) {
                            p.tampilPeminjaman();
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Data peminjaman tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Keluar dari sistem...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        scanner.close();
    }
}