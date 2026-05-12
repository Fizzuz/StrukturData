package jobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahProses;
    int kuotaDPA;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahProses = 0;
        this.kuotaDPA = 30;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk antrian KRS.");
        }
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            System.out.println("Melakukan proses KRS:");
            for (int i = 0; i < 2; i++) {
                if (!isEmpty()) {
                    Mahasiswa mhs = data[front];
                    System.out.print("- Mahasiswa dilayani: ");
                    mhs.tampilkanData();
                    front = (front + 1) % max;
                    size--;
                    sudahProses++;
                }
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian KRS:");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Dua Mahasiswa Terdepan:");
            for (int i = 0; i < 2; i++) {
                if (i < size) {
                    int index = (front + i) % max;
                    System.out.print((i + 1) + ". ");
                    data[index].tampilkanData();
                }
            }
        }
    }

    public void tampilkanPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa Paling Akhir: ");
            data[rear].tampilkanData();
        }
    }

    public void infoStatistik() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
        System.out.println("Jumlah mahasiswa sudah proses KRS: " + sudahProses);
        int sisaBelumKRS = kuotaDPA - sudahProses;
        System.out.println("Jumlah mahasiswa belum proses KRS (Sisa kuota DPA): " + sisaBelumKRS);
    }
}
