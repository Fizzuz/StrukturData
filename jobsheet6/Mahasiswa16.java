package jobsheet6;
import java.util.Scanner;
public class Mahasiswa16 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa16(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama + ", IPK: " + ipk);
    }
}


class MahasiswaBerprestasi16 {
    Mahasiswa16[] listMhs = new Mahasiswa16[5];
    int idx;

    void tambah(Mahasiswa16 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }
    }

    void tampil() {
        for (Mahasiswa16 m : listMhs) {
            if (m != null) m.tampilInformasi();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) { 
                    Mahasiswa16 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for (int i = 0; i < listMhs.length - 1; i++){
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++){
                if (listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa16 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    void insertionSort() {
    for (int i = 1; i < listMhs.length; i++) {
        Mahasiswa16 temp = listMhs[i];
        int j = i; 
        while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
            listMhs[j] = listMhs[j - 1];
            j--;
        }
        listMhs[j] = temp;
    }
}
 class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in); 
        
        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16();
        int jmlMhs = 5; 

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("----------");
            System.out.print("Nama  : ");
            String nama = s1.nextLine();
            System.out.print("NIM   : ");
            String nim = s1.nextLine();
            System.out.print("Kelas : ");
            String kelas = s1.nextLine();
            System.out.print("IPK   : ");
            double ipk = s.nextDouble();

            Mahasiswa16 m = new Mahasiswa16(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData sebelum sorting:");
        list.tampil();

        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();
        
        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC):");
        list.selectionSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (ASC):");

        s.close();
        s1.close();

        
    }
}
}