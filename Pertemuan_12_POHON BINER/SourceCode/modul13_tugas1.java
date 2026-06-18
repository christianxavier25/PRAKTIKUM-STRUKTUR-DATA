class simpul {
    int elemen;
    simpul kiri;
    simpul kanan;
}

public class modul13_tugas1 {
    public static simpul akar;

    public static void deklarasiPohon() {
        akar = null;
    }

    public static simpul tambahSimpul(simpul Penunjuk, int ELEMEN) { // Parameter diubah menjadi int
        if (Penunjuk == null) {
            simpul baru = new simpul();
            baru.elemen = ELEMEN;
            baru.kiri = null;
            baru.kanan = null;
            Penunjuk = baru;
            return (Penunjuk);
        } else {
            // Menggunakan operator < biasa, bukan .compareTo()
            if (ELEMEN < Penunjuk.elemen) {
                Penunjuk.kiri = tambahSimpul(Penunjuk.kiri, ELEMEN);
                return (Penunjuk);
            } else {
                Penunjuk.kanan = tambahSimpul(Penunjuk.kanan, ELEMEN);
                return (Penunjuk);
            }
        }
    }

    public static void preOrder(simpul Penunjuk) {
        if (Penunjuk != null) {
            System.out.print(Penunjuk.elemen + ", ");
            preOrder(Penunjuk.kiri);
            preOrder(Penunjuk.kanan);
        }
    }

    public static void inOrder(simpul Penunjuk) {
        if (Penunjuk != null) {
            inOrder(Penunjuk.kiri);
            System.out.print(Penunjuk.elemen + ", ");
            inOrder(Penunjuk.kanan);
        }
    }

    public static void postOrder(simpul Penunjuk) {
        if (Penunjuk != null) {
            postOrder(Penunjuk.kiri);
            postOrder(Penunjuk.kanan);
            System.out.print(Penunjuk.elemen + ", ");
        }
    }

    public static void main(String[] args) {
        deklarasiPohon();
        akar = tambahSimpul(akar, 54);
        akar = tambahSimpul(akar, 23);
        akar = tambahSimpul(akar, 81);
        akar = tambahSimpul(akar, 12);
        akar = tambahSimpul(akar, 67);
        akar = tambahSimpul(akar, 39);
        akar = tambahSimpul(akar, 95);
        akar = tambahSimpul(akar, 42);
        akar = tambahSimpul(akar, 76);
        akar = tambahSimpul(akar, 18);
        akar = tambahSimpul(akar, 63);
        akar = tambahSimpul(akar, 88);
        akar = tambahSimpul(akar, 31);
        akar = tambahSimpul(akar, 70);
        akar = tambahSimpul(akar, 47);
        akar = tambahSimpul(akar, 29);
        akar = tambahSimpul(akar, 91);

        System.out.println("Pre Order Traversal:");
        preOrder(akar);
        System.out.println();
        System.out.println();

        System.out.println("In Order Traversal:");
        inOrder(akar);
        System.out.println();
        System.out.println();

        System.out.println("Post Order Traversal:");
        postOrder(akar);
        System.out.println();
        System.out.println();
    }
}
