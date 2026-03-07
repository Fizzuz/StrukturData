package jobsheet3;
import java.util.Scanner;
public class MataKuliahDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan data mata kuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        MataKuliah17[] arrayOfMataKuliah17 = new MataKuliah17[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMataKuliah17.length; i++){
            System.out.println("Masukkan data mata kuliah ke-" + (i+1));
            System.out.print("Kode\t\t: ");
            kode = sc.nextLine();
            System.out.print("Nama\t\t: ");
            nama = sc.nextLine();
            System.out.print("SKS\t\t: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam\t: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            System.out.println("-------------------------------------------");
            arrayOfMataKuliah17[i] = new MataKuliah17(kode, nama, sks, jumlahJam);
            arrayOfMataKuliah17[i] = new MataKuliah17("", "", 0, 0);
            arrayOfMataKuliah17[i].tambahData(kode, nama, sks, jumlahJam);
                
        }
        System.out.println("==============================================");
        for (int i = 0; i < arrayOfMataKuliah17.length; i++){
                System.out.println("Data mata kuliah ke-" + (i+1));
                arrayOfMataKuliah17[i].cetakInfo();
    }
}
}
