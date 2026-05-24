package jobsheet12;

public class SLLMain16 {
    public static void main(String[] args) {
        SingleLinkedList16 sll = new SingleLinkedList16();
        
        Mahasiswa16 mhs1 = new Mahasiswa16("21212201", "Anton", "4A", 3.2);
        Mahasiswa16 mhs2 = new Mahasiswa16("21212202", "Beni", "4B", 3.4);
        Mahasiswa16 mhs3 = new Mahasiswa16("21212204", "Caca", "4C", 3.5);
        Mahasiswa16 mhs4 = new Mahasiswa16("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);
        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();
        
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        
        sll.removeAt(0);
        sll.print();
    }
}
