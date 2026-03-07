package jobsheet3;
public class DataDosen17 {

    
    public void dataSemuaDosen(Dosenn17[] arrayOfDosen) {
        System.out.println("\n======= DATA SELURUH DOSEN =======");
        for (Dosenn17 d : arrayOfDosen) {
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("--------------------------------");
        }
    }

  
    public void jumlahDosenPerJenisKelamin(Dosenn17[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosenn17 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    
    public void rerataUsiaDosenPerJenisKelamin(Dosenn17[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosenn17 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += d.usia;
                jmlWanita++;
            }
        }

        System.out.println("Rata-rata Usia Pria   : " + (jmlPria > 0 ? (double)totalUsiaPria/jmlPria : 0));
        System.out.println("Rata-rata Usia Wanita : " + (jmlWanita > 0 ? (double)totalUsiaWanita/jmlWanita : 0));
    }

   
    public void infoDosenPalingTua(Dosenn17[] arrayOfDosen) {
        Dosenn17 tertua = arrayOfDosen[0];
        for (Dosenn17 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("Dosen Paling Tua: " + tertua.nama + " (" + tertua.usia + " thn)");
    }

    
    public void infoDosenPalingMuda(Dosenn17[] arrayOfDosen) {
        Dosenn17 termuda = arrayOfDosen[0];
        for (Dosenn17 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("Dosen Paling Muda: " + termuda.nama + " (" + termuda.usia + " thn)");
    }
}
