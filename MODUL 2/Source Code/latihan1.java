import java.util.Scanner;

class formatBiodata { // bagian deklarasi struktur record ---------------------------------
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class latihan1 {
    public static Scanner masukan = new Scanner(System.in);
    public static int N;

    // --------------------------------------------------
    // --- Fungsi untuk mengentri data ke dalam Larik ---
    // --------------------------------------------------
    public static void ngentriData(formatBiodata biodataMahasiswa[]) {
        // bagian entri data ke dalam struktur larik ----------------
        int bacaTombol = 0;
        for (int i = 0; i <= N - 1; i++) {
            System.out.print("Silakan masukkan nama anda : ");
            biodataMahasiswa[i].nama = masukan.next();
            System.out.print("Silakan masukkan alamat anda : ");
            biodataMahasiswa[i].alamat = masukan.next();
            System.out.print("Silakan masukkan umur anda : ");
            biodataMahasiswa[i].umur = masukan.nextInt();
            System.out.print("Silakan masukkan Jenis Kelamin anda (L/P) : ");
            try {
                bacaTombol = System.in.read();
            } catch (java.io.IOException e) {
            }
            biodataMahasiswa[i].jekel = (char) bacaTombol;
            System.out.println("Silakan masukkan hobi (maks 3) : ");
            System.out.print("hobi ke-0 : ");
            biodataMahasiswa[i].hobi[0] = masukan.next();
            System.out.print("hobi ke-1 : ");
            biodataMahasiswa[i].hobi[1] = masukan.next();
            System.out.print("hobi ke-2 : ");
            biodataMahasiswa[i].hobi[2] = masukan.next();
            System.out.print("Silakan masukkan IPK anda : ");
            biodataMahasiswa[i].ipk = masukan.nextFloat();
            System.out.println("");
        }

        masukan.close();
    }

    // --------------------------------------------------
    // --- Fungsi untuk menampilkan data ---
    // --------------------------------------------------
    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
        // bagian menampilkan isi struktur Larik --------------------------
        System.out.println("-----------------------------------------------------------------");
        System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tHOBI1\tHOBI2\tHOBI3\tIPK");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i <= N - 1; i++) {
            System.out.print(biodataMahasiswa[i].nama + "\t");
            System.out.print(biodataMahasiswa[i].alamat + "\t");
            System.out.print(biodataMahasiswa[i].umur + "\t");
            System.out.print(biodataMahasiswa[i].jekel + "\t");
            System.out.print(biodataMahasiswa[i].hobi[0] + "\t");
            System.out.print(biodataMahasiswa[i].hobi[1] + "\t");
            System.out.print(biodataMahasiswa[i].hobi[2] + "\t");
            System.out.println(biodataMahasiswa[i].ipk);
        }
        System.out.println("-----------------------------------------------------------------");
    }

    // --------------------------------------------------
    // --- Program Utama ---
    // --------------------------------------------------
    public static void main(String[] args) { // bagian deklarasi record berbasis LARIK -----------------------
        System.out.print("Silahkan masukkan Jumlah record (Maks 15) : ");
        N = masukan.nextInt();
        if (N > 15 || N < 0) {
            System.out.println("Batas maksimal ialah 15, dan minimul 1");
            System.exit(0);
        }

        formatBiodata biodataMahasiswa[] = new formatBiodata[N];
        for (int i = 0; i < N; i++) {
            biodataMahasiswa[i] = new formatBiodata();
        }
        ngentriData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);
    }
}