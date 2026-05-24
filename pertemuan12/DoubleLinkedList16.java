package pertemuan12;

public class DoubleLinkedList16 {
    node16 head;
    node16 tail;

    public DoubleLinkedList16() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst (Mahasiswa16 data) {
        node16 newNode = new node16(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa16 data) {
        node16 newNode = new node16(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter (String keyNim, Mahasiswa16 data) {
        node16 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        node16 newNode = new node16 (data);
        
        if (current == tail){
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { 
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong."); 
        return;
    }
    node16 current = head;
    while (current != null) {
        current.data.tampil();
        current = current.next;
    }
}
public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong.");
        return;
    }
    
    node16 current = tail;
    
  
    while (current != null) {
        current.data.tampil();
       
        current = current.prev;
    }
}
public void removeFirst() {
    if (isEmpty()) {
        System.out.println("Linked List kosong.");
        return;
    }
    
  
    Mahasiswa16 deletedData = head.data;
    
    if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    } 
    System.out.println("\nData berikut berhasil dihapus dari awal list:");
    deletedData.tampil();
}
public void removeLast() {
    if (isEmpty()) {
        System.out.println("Linked List kosong.");
        return;
    }
    Mahasiswa16 deletedData = tail.data;
    
    if (head == tail) {
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }
    System.out.println("\nData berikut berhasil dihapus dari akhir list:");
    deletedData.tampil();
}
}
