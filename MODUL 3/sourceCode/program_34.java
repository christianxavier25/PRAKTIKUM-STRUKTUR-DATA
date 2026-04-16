
// Method untuk Menghapus Data Di Depan
import java.util.Scanner;

public class program_34 {
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

    public static void hapusDataDiDepan(formatBiodata biodataMahasiswa[]) {
        // bagian menggeser isi larik mulai dari 0 - Belakang selangkah ke depan
        for (int i = 0; i <= N - 2; i++) {
            biodataMahasiswa[i] = biodataMahasiswa[i + 1];
        }
        System.out.println("Proses menghapus data ke-0 selesai.");
        // memperbaharui banyaknya data (N), banyaknya data berkurang satu-------
        N--;
    }

    public static void main(String[] args) {
        System.out.print("Testing");
    }

}
