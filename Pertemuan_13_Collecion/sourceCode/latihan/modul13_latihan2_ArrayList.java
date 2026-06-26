package latihan;

import java.util.ArrayList;

public class modul13_latihan2_ArrayList {
    ArrayList<Object> daftarMhs = new ArrayList<>();

    modul13_latihan2_ArrayList() {
        if (daftarMhs.isEmpty() == true) {
            System.out.println("ArrayList kosong");
        } else {
            System.out.println("ArrayList isi");
        }

        daftarMhs.add("Agungbp");
        daftarMhs.add("Bambang");

        if (daftarMhs.isEmpty() == true) {
            System.out.println("ArrayList kosong");
        } else {
            System.out.println("ArrayList isi");
        }
    }

    public static void main(String args[]) {
        new modul13_latihan2_ArrayList();
    }
}