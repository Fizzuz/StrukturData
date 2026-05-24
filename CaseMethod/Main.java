package CaseMethod;
import java.util.Scanner;

class Pembeli {
    int noAntrian;
    String namaPembeli;
    String NoHp;

    public Pembeli(String b, String c) {
        this.namaPembeli = b;
        this.NoHp = c;
    }
}

class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;

    public Pesanan(int a, String b, int d) {
        this.kodePesanan = a;
        this.namaPesanan = b;
        this.harga = d;
    }
}

class NodePembeli {
    Pembeli data;
    NodePembeli prev, next;

    public NodePembeli(NodePembeli prev, Pembeli data, NodePembeli next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

class DLLPembeli {
    NodePembeli head;
    int size;
    int totalAntrian;

    public DLLPembeli() {
        head = null;
        size = 0;
        totalAntrian = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pembeli item) {
        totalAntrian++;
        item.noAntrian = totalAntrian;
        if (isEmpty()) {
            head = new NodePembeli(null, item, null);
        } else {
            NodePembeli current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodePembeli newNode = new NodePembeli(current, item, null);
            current.next = newNode;
        }
        size++;
    }

    public Pembeli removeFirst() {
        if (isEmpty()) return null;
        Pembeli data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
        return data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        NodePembeli current = head;
        System.out.printf("%-15s %-20s %-15s\n", "No Antrian", "Nama", "No HP");
        while (current != null) {
            System.out.printf("%-15d %-20s %-15s\n", current.data.noAntrian, current.data.namaPembeli, current.data.NoHp);
            current = current.next;
        }
    }
}

class NodePesanan {
    Pesanan data;
    NodePesanan prev, next;

    public NodePesanan(NodePesanan prev, Pesanan data, NodePesanan next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

class DLLPesanan {
    NodePesanan head;
    int size;

    public DLLPesanan() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pesanan item) {
        if (isEmpty()) {
            head = new NodePesanan(null, item, null);
        } else {
            NodePesanan current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodePesanan newNode = new NodePesanan(current, item, null);
            current.next = newNode;
        }
        size++;
    }

    public void sort() {
        if (isEmpty() || head.next == null) return;
        boolean swapped;
        NodePesanan current;
        do {
            swapped = false;
            current = head;
            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }
        sort();
        NodePesanan current = head;
        System.out.printf("%-15s %-20s %-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        while (current != null) {
            System.out.printf("%-15d %-20s %-15d\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLPembeli antrian = new DLLPembeli();
        DLLPesanan pesanan = new DLLPesanan();

        antrian.addLast(new Pembeli("Ainra", "08224500000"));
        antrian.addLast(new Pembeli("Danra", "08224511111"));
        antrian.addLast(new Pembeli("Sanri", "08224522222"));

        int pilihan;
        do {
            System.out.println("=================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    antrian.addLast(new Pembeli(nama, hp));
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + antrian.totalAntrian);
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.println("Daftar Antrian Pembeli");
                    System.out.println("=================================");
                    antrian.print();
                    break;
                case 3:
                    Pembeli p = antrian.removeFirst();
                    if (p != null) {
                        System.out.print("Kode Pesanan: ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan: ");
                        String namaP = sc.nextLine();
                        System.out.print("Harga       : ");
                        int harga = sc.nextInt();
                        sc.nextLine();
                        pesanan.addLast(new Pesanan(kode, namaP, harga));
                        System.out.println(p.namaPembeli + " telah memesan " + namaP);
                    } else {
                        System.out.println("Antrian kosong!");
                    }
                    break;
                case 4:
                    System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
                    pesanan.print();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}