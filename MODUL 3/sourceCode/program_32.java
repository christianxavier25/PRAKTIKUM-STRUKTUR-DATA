
// --- Method untuk Menambah Data Di Tengah ---
import java.util.Scanner;

public class program_32 {
    static class formatBiodata {
        String nama;
        String alamat;
        int umur;
        char jekel;
        String hobi[] = new String[3];
        float ipk;
    }

    public static Scanner masukan = new Scanner(System.in);
    public static int N;

    public static void tambahDataDiTengah(formatBiodata biodataMahasiswa[])

    {
        formatBiodata biodataMahasiswaBaru = new formatBiodata();
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;
        System.out.print("Silakan masukkan nama anda : ");
        biodataMahasiswaBaru.nama = masukan.next();
        System.out.print("Silakan masukkan alamat anda : ");
        biodataMahasiswaBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan umur anda : ");
        biodataMahasiswaBaru.umur = masukan.nextInt();
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        biodataMahasiswaBaru.jekel = (char) bacaTombol;
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        biodataMahasiswaBaru.hobi[0] = masukan.next();
        System.out.print("hobi ke-1 : ");
        biodataMahasiswaBaru.hobi[1] = masukan.next();
        System.out.print("hobi ke-2 : ");
        biodataMahasiswaBaru.hobi[2] = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        biodataMahasiswaBaru.ipk = masukan.nextFloat();
        int T;
        System.out.print("Pada posisi ke berapa data akan dimasukkan ? : ");
        T = masukan.nextInt();
        for (int i = N - 1; i >= T; i--) {
            biodataMahasiswa[i + 1] = biodataMahasiswa[i];
        }
        biodataMahasiswa[T] = biodataMahasiswaBaru;
        N++;
        masukan.close();
    }

    public static void main(String[] args) {
        System.out.print("Testing");
    }
}