
// --- Method untuk Menambah Data Di Depan ---
import java.util.Scanner;

public class program_53 {
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

    // --- Fungsi untuk Mengurutkan Data (Insertion) ---
    public static void mengurutkanDataInsertion(formatBiodata biodataMahasiswa[]) {
        formatBiodata biodataSementara = new formatBiodata();
        // untuk menentukan awal dari data sisi kanan (sisi yg masih berantakan)
        int awal;
        // untuk mencari posisi yg tepat pada sisi kiri (sisi yg sudah berurutan)
        int cari;
        awal = 1;
        while (awal <= N - 1) {
            biodataSementara = biodataMahasiswa[awal];
            cari = awal - 1;
            // cari akan bergerak dari kanan (awal-1) ke kiri
            while (cari >= 0) {
                // ( biodataMahasiswa[cari].nama > biodataSementara.nama )
                if (biodataMahasiswa[cari].nama.compareTo(biodataSementara.nama) > 0) {
                    biodataMahasiswa[cari + 1] = biodataMahasiswa[cari];
                    biodataMahasiswa[cari] = biodataSementara;
                    cari--; // cari digeser kekiri 1 langkah
                } else {
                    biodataMahasiswa[cari + 1] = biodataSementara;
                    // perintah ini untuk keluar dari loop while
                    cari = -1;
                }
            }
            awal++;
        }
    }

    public static void main(String[] args) {
        System.out.print("Testing");
    }
}