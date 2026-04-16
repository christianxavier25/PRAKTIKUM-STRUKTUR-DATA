
// --- Method untuk Menambah Data Di Depan ---
import java.util.Scanner;

public class program_42 {
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

    // Method Mencari Data Secara Linear Search (Loop: For) ---
    public static void mencariDataLinear(formatBiodata biodataMahasiswa[]) {
        String kataKunci;
        int lokasi = -1;
        boolean statusKetemu = false;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan kata kunci pencarian : ");
        kataKunci = masukan.next();
        for (int i = 0; i <= N - 1; i++) {
            if (biodataMahasiswa[i].nama.equals(kataKunci)) {
                statusKetemu = true;
                lokasi = i;
                break;
            }
        }
        if (statusKetemu == true) {
            System.out.println("Data yang anda cari KETEMU di larik ke :" + lokasi);
        } else {
            System.out.println("maap, nama yang anda cari tidak ditemukan");
        }
        masukan.close();
    }

    public static void main(String[] args) {
        System.out.print("Testing");
    }
}