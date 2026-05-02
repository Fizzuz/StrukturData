package jobsheet9;

public class StackSurat16 {
    Surat16[] stack;
    int size;
    int top;

    public StackSurat16(int size) {
        this.size = size;
        stack = new Surat16[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat16 data) {
        if (!isFull()) {
            top++;
            stack[top] = data;
            System.out.println("Surat dari " + data.namaMahasiswa + " berhasil diterima.");
        } else {
            System.out.println("Kapasitas kotak surat penuh!");
        }
    }

    public Surat16 pop() {
        if (!isEmpty()) {
            Surat16 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Belum ada surat yang diterima.");
            return null;
        }
    }

    public Surat16 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Belum ada surat yang diterima.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        if (isEmpty()) {
            System.out.println("Belum ada surat yang diterima.");
            return;
        }
        
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("\n--- Surat Ditemukan ---");
                System.out.println("Posisi dari atas : Ke-" + (top - i + 1));
                System.out.println("ID Surat         : " + stack[i].idSurat);
                System.out.println("Nama             : " + stack[i].namaMahasiswa);
                System.out.println("Kelas            : " + stack[i].kelas);
                System.out.println("Jenis Izin       : " + (stack[i].jenisIzin == 'S' || stack[i].jenisIzin == 's' ? "Sakit" : "Izin Lain"));
                System.out.println("Durasi           : " + stack[i].durasi + " Hari");
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Surat dari mahasiswa bernama " + nama + " tidak ditemukan di dalam tumpukan.");
        }
    }
}
