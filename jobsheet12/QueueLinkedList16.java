package jobsheet12;

public class QueueLinkedList16 {
    NodeAntrian16 head;
    NodeAntrian16 tail;
    int size;
    int max;

    public QueueLinkedList16(int max) {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.max = max;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void enqueue(MahasiswaTugas16 input) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!");
        } else {
            NodeAntrian16 ndInput = new NodeAntrian16(input, null);
            if (isEmpty()) {
                head = ndInput;
                tail = ndInput;
            } else {
                tail.next = ndInput;
                tail = ndInput;
            }
            size++;
            System.out.println("Mahasiswa " + input.nama + " berhasil masuk antrian.");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            MahasiswaTugas16 dipanggil = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            System.out.println("Memanggil Mahasiswa:");
            dipanggil.tampilData();
        }
    }

    public void printFrontRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("--- Antrian Terdepan ---");
            head.data.tampilData();
            System.out.println("--- Antrian Paling Akhir ---");
            tail.data.tampilData();
        }
    }

    public void printSize() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size);
    }
}