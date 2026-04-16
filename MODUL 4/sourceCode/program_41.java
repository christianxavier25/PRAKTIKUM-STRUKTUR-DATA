
// --- Method untuk Menambah Data Di Depan ---
import java.util.Scanner;

public class program_41 {
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

    // Method Mencari Data Secara Linear Search (Loop: While)
    public static void cariDataLinear(formatBiodata biodataMahasiswa[]) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Silakan masukkan kataKunci data yang anda cari :");
        String kataKunci = masukan.next();
        boolean statusKetemu = false;
        int lokasiKetemu = -1;
        int i = 0;
        while ((i <= N - 1) && (statusKetemu == false)) {
            if (kataKunci.equals(biodataMahasiswa[i].nama)) {
                statusKetemu = true;
                lokasiKetemu = i;
            }
            i++;
        }
        System.out.println("Status Ketemu : " + statusKetemu + " di posisi ke " + lokasiKetemu);
        masukan.close();
    }

    public static void main(String[] args) {
        System.out.print("Testing");
    }
}