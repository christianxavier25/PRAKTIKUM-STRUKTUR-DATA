import java.util.Scanner;
class tipePointer {
    int angka;
    String teks;
}
class praktik7_1 {
    public static void main(String[] args) {
        tipePointer P;
        P = null;
        if (P == null)
            System.out.println("Pointer P menunjuk ke Null");
        else
            System.out.println("Pointer P mengarah ke tempat lain");
    }
}