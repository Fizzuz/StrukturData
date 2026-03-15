package jobsheet5;
public class MahasiswaMain {

    public static int cariMaxUtsDC(Mahasiswa[] mhs, int l, int r) {
        if (l == r) { 
            return mhs[l].nilaiUts;
        }
        
        int mid = (l + r) / 2; 
        int lmax = cariMaxUtsDC(mhs, l, mid);       
        int rmax = cariMaxUtsDC(mhs, mid + 1, r);   
        
        if (lmax > rmax) {
            return lmax;
        } else {
            return rmax;
        }
    }

    public static int cariMinUtsDC(Mahasiswa[] mhs, int l, int r) {
        if (l == r) { 
            return mhs[l].nilaiUts;
        }
        
        int mid = (l + r) / 2; 
        int lmin = cariMinUtsDC(mhs, l, mid);       
        int rmin = cariMinUtsDC(mhs, mid + 1, r);   
        
        if (lmin < rmin) {
            return lmin;
        } else {
            return rmin;
        }
    }

    public static double hitungRataUasBF(Mahasiswa[] mhs) {
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total = total + mhs[i].nilaiUas;
        }
        return total / mhs.length;
    }

    public static void main(String[] Args) {
        Mahasiswa[] daftarMhs = new Mahasiswa[8];
    
        daftarMhs[0] = new Mahasiswa("Ahmad", "220101001", 2022, 78, 82);
        daftarMhs[1] = new Mahasiswa("Budi", "220101002", 2022, 85, 88);
        daftarMhs[2] = new Mahasiswa("Cindy", "220101003", 2021, 90, 87);
        daftarMhs[3] = new Mahasiswa("Dian", "220101004", 2021, 76, 79);
        daftarMhs[4] = new Mahasiswa("Eko", "22010  1005", 2023, 92, 95);
        daftarMhs[5] = new Mahasiswa("Fajar", "220101006", 2020, 88, 85);
        daftarMhs[6] = new Mahasiswa("Gina", "220101007", 2023, 80, 83);
        daftarMhs[7] = new Mahasiswa("Hadi", "220101008", 2020, 82, 84);

        int jumlahData = daftarMhs.length;

        System.out.println("--- HASIL PERHITUNGAN DATA MAHASISWA ---");
        
        int maxUts = cariMaxUtsDC(daftarMhs, 0, jumlahData - 1);
        System.out.println("a) Nilai UTS Tertinggi (Divide and Conquer): " + maxUts);
        
        int minUts = cariMinUtsDC(daftarMhs, 0, jumlahData - 1);
        System.out.println("b) Nilai UTS Terendah  (Divide and Conquer): " + minUts);
        
        double rataUas = hitungRataUasBF(daftarMhs);
        System.out.println("c) Rata-rata Nilai UAS (Brute Force): " + rataUas);
    }
}