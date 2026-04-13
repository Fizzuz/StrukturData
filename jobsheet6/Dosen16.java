package jobsheet6;
import java.util.Scanner;
    public class Dosen16 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen16(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
        System.out.println("----------------------------");
    }
}

 class DataDosen {
    Dosen16[] dataDosen = new Dosen16[10];
    int idx;

    void tambah(Dosen16 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen16 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen16 tmp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen16 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

 class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DataDosen list = new DataDosen();
        int pilih;

        do {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = s.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = s1.nextLine();
                    System.out.print("Nama: ");
                    String nm = s1.nextLine();
                    System.out.print("Jenis Kelamin (true=Pria, false=Wanita): ");
                    boolean jk = s.nextBoolean();
                    System.out.print("Usia: ");
                    int us = s.nextInt();
                    Dosen16 d = new Dosen16(kd, nm, jk, us);
                    list.tambah(d);
                    break;
                case 2:
                    list.tampil();
                    break;
                case 3:
                    list.SortingASC();
                    list.tampil();
                    break;
                case 4:
                    list.sortingDSC();
                    list.tampil();
                    break;
            }
        } while (pilih != 5);
    }
}
}