
// --- Method untuk Menambah Data Di Depan ---
import java.util.Scanner;

public class program_43 {
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

    // Method Mencari Data Secara Binary Search ---
    public static void mencariDataBiner(formatBiodata biodataMahasiswa[]) {
        String kataKunci;
        int lokasi = -1;
        boolean statusKetemu = false;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan kata kunci pencarian : ");
        kataKunci = masukan.next();
        int atas, bawah, tengah;
        atas = 0;
        bawah = N - 1;
        tengah = (atas + bawah) / 2;
        while ((statusKetemu == false) && (bawah - atas != 1)) {
            System.out.println(biodataMahasiswa[tengah].nama + " <---> " + kataKunci);
            // jika kataKunci < biodataMahasiswa[tengah].nama)
            if (kataKunci.compareTo(biodataMahasiswa[tengah].nama) < 0) {
                bawah = tengah;
                tengah = (atas + bawah) / 2;
            }
            // jika kataKunci > biodataMahasiswa[tengah].nama)
            else if (kataKunci.compareTo(biodataMahasiswa[tengah].nama) > 0) {
                atas = tengah;
                tengah = (atas + bawah) / 2;
            } else {
                statusKetemu = true;
                lokasi = tengah;
            }
        }
        if (statusKetemu == true) {
            System.out.println("Data yang anda cari KETEMU di larik ke :" + lokasi);
        } else {
            System.out.println("maap, nama yang anda cari tidak ditemukan ");
        }
        masukan.close();
    }

    public static void main(String[] args) {
        System.out.print("Testing");
    }
}