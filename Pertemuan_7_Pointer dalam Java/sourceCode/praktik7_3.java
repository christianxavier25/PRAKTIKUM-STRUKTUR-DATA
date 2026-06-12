import java.util.Scanner;

class tipePointer {
    String namaKota;
    tipePointer kiri;
    tipePointer kanan;
}

class praktik7_3 {
    public static void main(String[] args) {
        tipePointer P;
        P = new tipePointer();
        P.namaKota = "Yogyakarta";

        tipePointer Q;
        Q = new tipePointer();
        Q.namaKota = "Klaten";

        tipePointer R;
        R = new tipePointer();
        R.namaKota = "Solo";

        tipePointer S;
        S = new tipePointer();
        S.namaKota = "Sragen";

        tipePointer T;
        T = new tipePointer();
        T.namaKota = "Ngawi";

        System.out.println("Nilai P,Q,R,S,T adalah :");
        System.out.println("================================");
        System.out.println("Nilai P.namaKota adalah = " + P.namaKota);
        System.out.println("Nilai Q.namaKota adalah = " + Q.namaKota);
        System.out.println("Nilai R.namaKota adalah = " + R.namaKota);
        System.out.println("Nilai S.namaKota adalah = " + S.namaKota);
        System.out.println("Nilai T.namaKota adalah = " + T.namaKota);

        P.kanan = Q;
        Q.kanan = R;
        R.kanan = S;
        S.kanan = T;
        T.kanan = null;

        // System.out.println("Nilai-nilai yang dapat diakses dari pointer P adalah :");
        // System.out.println("================================");
        // System.out.println(P.namaKota);
        // System.out.println(P.kanan.namaKota);
        // System.out.println(P.kanan.kanan.namaKota);
        // System.out.println(P.kanan.kanan.kanan.namaKota);
        // System.out.println(P.kanan.kanan.kanan.kanan.namaKota);

        // System.out.println("Modifikasi nilai elemen namaKota dari R:");
        // System.out.println(R.namaKota);
        // P.kanan.kanan.namaKota = "Surakarta";
        // System.out.println(R.namaKota);

        // System.out.println("");

        // tipePointer BANTU;
        // BANTU = P;
        // while (BANTU != null) {
        // System.out.println("Nilai BANTU.namaKota adalah = " + BANTU.namaKota);
        // BANTU = BANTU.kanan;
        // }

        P.kiri = null;
        Q.kiri = P;
        R.kiri = Q;
        S.kiri = R;
        T.kiri = S;

        System.out.println("Elemen namaKota untuk pointer P adalah :");
        System.out.println("================================");
        System.out.println(P.namaKota);
        System.out.println(P.kanan.kiri.namaKota);
        System.out.println(P.kanan.kanan.kiri.kiri.namaKota);

        tipePointer BANTU;
        BANTU = T;
        while (BANTU != null) {
            System.out.println("Nilai BANTU.namaKota adalah = " + BANTU.namaKota);
            BANTU = BANTU.kiri;
        }

    }
}