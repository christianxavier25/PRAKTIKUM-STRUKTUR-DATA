package praktik;

import java.util.LinkedList;

public class modul13_praktik5_PercobaanLinkedList {
    LinkedList daftarMhs = new LinkedList();

    modul13_praktik5_PercobaanLinkedList() {
        daftarMhs.add("Agungbp");
        daftarMhs.add("Bambang");
        daftarMhs.add("Cucuk");
        daftarMhs.add("Dion");
        daftarMhs.add("Ending");
        daftarMhs.add("Fifin");
        daftarMhs.add("Gesit");
        daftarMhs.add("Heru");
        daftarMhs.add("Irma");
        daftarMhs.add("Janti");

        System.out.println("N = " + daftarMhs.size());
        for (int i = 0; i <= daftarMhs.size() - 1; i++) {
            System.out.println(i + " " + daftarMhs.get(i));
        }
        System.out.println("");

        daftarMhs.addFirst("Amir");
        daftarMhs.addLast("Zaenal");

        System.out.println("N = " + daftarMhs.size());
        for (int i = 0; i <= daftarMhs.size() - 1; i++) {
            System.out.println(i + " " + daftarMhs.get(i));
        }
        System.out.println("");

        System.out.println("Mhs awal = " + daftarMhs.getFirst());
        System.out.println("Mhs akhir = " + daftarMhs.getLast());
    }

    public static void main(String args[]) {
        new modul13_praktik5_PercobaanLinkedList();
    }
}