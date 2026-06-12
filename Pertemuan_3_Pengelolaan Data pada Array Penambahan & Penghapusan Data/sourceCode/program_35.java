
// Method untuk Menghapus Data Di Tengah
import java.util.Scanner;

public class program_35 {
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

    public static void hapusDataDiTengah(formatBiodata biodataMahasiswa[]) {
        // bagian menentukan posisi target T
        Scanner masukan = new Scanner(System.in);
        int T;
        System.out.print("Tuliskan posisi data yang akan dibapus : ");
        T = masukan.nextInt();
        // bagian menggeser isi larik mulai dari T - Belakang selangkah ke depan
        for (int i = T; i <= N - 2; i++) {
            biodataMahasiswa[i] = biodataMahasiswa[i + 1];
        }
        System.out.println("Proses menghapus data ke-" + T + " selesai.");
        // memperbaharui banyaknya data (N), banyaknya data berkurang satu-------
        N--;
        masukan.close();
    }

    public static void main(String[] args) {
        System.out.print("Testing");
    }

}
