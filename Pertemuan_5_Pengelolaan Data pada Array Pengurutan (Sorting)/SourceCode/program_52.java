
// --- Method untuk Menambah Data Di Depan ---
import java.util.Scanner;

public class program_52 {
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

    // --- Fungsi untuk Mengurutkan Data (Selection) ---
    public static void mengurutkanDataSelection(formatBiodata biodataMahasiswa[]) {
        formatBiodata biodataSementara = new formatBiodata();
        String teksTerkecil = "";
        int lokasi = 0;
        // bagian mengurutkan dengan teknik selection
        for (int i = 0; i <= N - 2; i++) {
            // data pertama yang dibaca dianggap data terkecil
            teksTerkecil = "zzzzzzz";
            // menentukan bilangan terkecil mulai larik ke i+1 sampai N-1
            for (int S = i + 1; S <= N - 1; S++) {
                if (biodataMahasiswa[S].nama.compareTo(teksTerkecil) < 0) { // jika data[S] adlh bilangan terkecil,
                    // simpan di teksTerkecil teksTerkecil = biodataMahasiswa[S].nama;
                    // mencatat posisi dimana data terkecil ada
                    lokasi = S;
                }
            }
            // membandingkan data[lokasi] yang adalah data terkecil,
            // versus data[i] yang adalah ‘diagonal ke-i'
            if (biodataMahasiswa[i].nama.compareTo(biodataMahasiswa[lokasi].nama) > 0) {
                // tukar posisi
                {
                    biodataSementara = biodataMahasiswa[i];
                    biodataMahasiswa[i] = biodataMahasiswa[lokasi];
                    biodataMahasiswa[lokasi] = biodataSementara;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Testing");
    }
}