
// --- Method untuk Menambah Data Di Depan ---
import java.util.Scanner;

public class program_51 {
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

    // --- Fungsi untuk Mengurutkan Data (BubbleSort) ---
    public static void mengurutkanDataBubble(formatBiodata biodataMahasiswa[]) {
        formatBiodata biodataSementara = new formatBiodata();
        int indeksTerakhir = N - 1;
        for (int j = 0; j <= indeksTerakhir - 1; j++) {
            for (int i = 0; i <= indeksTerakhir - 1 - j; i++) {
                // perintah dibawah ini identik dengan if (nama[i]>nama[i+1])
                if (biodataMahasiswa[i].nama.compareTo(biodataMahasiswa[i + 1].nama) > 0) {
                    biodataSementara = biodataMahasiswa[i];
                    biodataMahasiswa[i] = biodataMahasiswa[i + 1];
                    biodataMahasiswa[i + 1] = biodataSementara;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Testing");
    }
}