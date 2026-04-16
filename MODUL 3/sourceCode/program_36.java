
// Method untuk Menghapus Data Di Depan
import java.util.Scanner;

public class program_36 {
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

    public static void hapusDataDiBelakang(formatBiodata biodataMahasiswa[]) {
        System.out.println("Proses menghapus data paling akhir selesai.");
        // memperbaharui banyaknya data (N), banyaknya data berkurang satu-------
        N--;
    }

    public static void main(String[] args) {
        System.out.print("Testing");
    }

}
