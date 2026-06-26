package praktik;

import java.util.LinkedList;

public class modul13_praktik1_PercobaanLinkedList {
    LinkedList daftarMhs = new LinkedList();

    modul13_praktik1_PercobaanLinkedList() {
        if (daftarMhs.isEmpty() == true) {
            System.out.println("Linkedlist kosong");
        } else {
            System.out.println("Linkedlist isi");
        }
    }

    public static void main(String args[]) {
        new modul13_praktik1_PercobaanLinkedList();
    }
}