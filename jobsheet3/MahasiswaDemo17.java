package jobsheet3;
import java.util.Scanner;
public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa17[] arrayOfMahasiswa = new Mahasiswa17[3];
        String dummy;

        for (int i = 0; i < 3; i++){
            arrayOfMahasiswa[i] = new Mahasiswa17();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM\t: ");
            arrayOfMahasiswa[i].nim = sc.nextLine();  
            System.out.print("Nama\t: ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------------------------------------");
        }

        for (int i = 0; i < 3; i++){
            System.out.println("Data mahasiswa ke-" +(i+1));
            System.out.println("NIM\t: " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama\t: " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas\t: " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK\t: " + arrayOfMahasiswa[i].ipk);
            System.out.println("-------------------------------------------------------------");
        }
    }
}
