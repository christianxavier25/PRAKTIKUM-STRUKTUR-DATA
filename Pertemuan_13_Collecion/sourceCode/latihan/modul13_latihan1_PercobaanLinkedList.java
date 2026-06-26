package latihan;

import java.util.LinkedList;

public class modul13_latihan1_PercobaanLinkedList {
    LinkedList<Object> daftarMhs = new LinkedList<>();

    modul13_latihan1_PercobaanLinkedList() {
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
        daftarMhs.add(10);
        daftarMhs.add(17.9f);
        daftarMhs.add(8000000000L);

        // Menggunakan get() untuk menampilkan data
        System.out.println(daftarMhs.get(0));
        System.out.println(daftarMhs.get(1));
        System.out.println(daftarMhs.get(2));
        System.out.println(daftarMhs.get(3));
        System.out.println(daftarMhs.get(4));
        System.out.println(daftarMhs.get(5));
        System.out.println(daftarMhs.get(6));
        System.out.println(daftarMhs.get(7));
        System.out.println(daftarMhs.get(8));
        System.out.println(daftarMhs.get(9));
        System.out.println(daftarMhs.get(10));
        System.out.println(daftarMhs.get(11));
        System.out.println(daftarMhs.get(12));
        System.out.println("");

        // Menggunakan for-each loop agar otomatis menyesuaikan jumlah data
        // for (Object mhs : daftarMhs) {
        // System.out.println(mhs);
        // }
    }

    public static void main(String args[]) {
        new modul13_latihan1_PercobaanLinkedList();
    }
}