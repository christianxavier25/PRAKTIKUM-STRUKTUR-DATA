import java.util.Scanner;

class tipePointer {
    String nim;
    String nama;
    String alamat;
    String programStudi;
}

class tugas7_1 {
    public static void main(String[] args) {
        tipePointer P = new tipePointer();
        tipePointer Q = new tipePointer();

        P.nim = "255410048";
        P.nama = "Xavier Christian Rihi";
        P.alamat = "Yogyakarta";
        P.programStudi = "Informatika";

        Q.nim = "255410025";
        Q.nama = "Melkianus Lukardis Ama";
        Q.alamat = "Bantul";
        Q.programStudi = "Informatika";

        System.out.println("Nilai elemen P dan Q adalah :");
        System.out.println("Nilai P.nim adalah = " + P.nim);
        System.out.println("Nilai P.nama adalah = " + P.nama);
        System.out.println("Nilai P.alamat adalah = " + P.alamat);
        System.out.println("Nilai P.programStudi adalah = " + P.programStudi);
        System.out.println("================================");
        System.out.println("Nilai Q.nim adalah = " + Q.nim);
        System.out.println("Nilai Q.nama adalah = " + Q.nama);
        System.out.println("Nilai Q.alamat adalah = " + Q.alamat);
        System.out.println("Nilai Q.programStudi adalah = " + Q.programStudi);
    }
}