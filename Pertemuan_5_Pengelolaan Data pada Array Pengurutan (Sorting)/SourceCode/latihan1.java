import java.util.Scanner;

class formatBiodata {
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

    // --- METHOD untuk Menampilkan Data ---
    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
        System.out.println();

        System.out.printf("%-3s %-20s %-15s %-5s %-6s %-10s %-10s %-10s %-5s\n",
                "No", "NAMA", "ALAMAT", "UMUR", "JEKEL", "HOBI[0]", "HOBI[1]", "HOBI[2]", "IPK");

        for (int i = 0; i < N; i++) {
            System.out.printf("%-3d %-20s %-15s %-5d %-6s %-10s %-10s %-10s %-5.2f\n",
                    i,
                    biodataMahasiswa[i].nama,
                    biodataMahasiswa[i].alamat,
                    biodataMahasiswa[i].umur,
                    biodataMahasiswa[i].jekel,
                    biodataMahasiswa[i].hobi[0],
                    biodataMahasiswa[i].hobi[1],
                    biodataMahasiswa[i].hobi[2],
                    biodataMahasiswa[i].ipk);
        }

        System.out.println();
    }

    // -- METHOD SEMENTARA ISI DATA ACAK
    public static void isiDataAcak(formatBiodata biodataMahasiswa[]) {

        biodataMahasiswa[0].nama = "Zidan";
        biodataMahasiswa[0].alamat = "Yogyakarta";
        biodataMahasiswa[0].umur = 18;
        biodataMahasiswa[0].jekel = 76;
        biodataMahasiswa[0].hobi[0] = "Mancing";
        biodataMahasiswa[0].hobi[1] = "Lari";
        biodataMahasiswa[0].hobi[2] = "Ngoding";
        biodataMahasiswa[0].ipk = 3.8f;

        biodataMahasiswa[1].nama = "Rafi";
        biodataMahasiswa[1].alamat = "Bantul";
        biodataMahasiswa[1].umur = 19;
        biodataMahasiswa[1].jekel = 76;
        biodataMahasiswa[1].hobi[0] = "SepakBola";
        biodataMahasiswa[1].hobi[1] = "Ngoding";
        biodataMahasiswa[1].hobi[2] = "Membaca";
        biodataMahasiswa[1].ipk = 3.4f;

        biodataMahasiswa[2].nama = "Galang";
        biodataMahasiswa[2].alamat = "Yogyakarta";
        biodataMahasiswa[2].umur = 20;
        biodataMahasiswa[2].jekel = 76;
        biodataMahasiswa[2].hobi[0] = "Fotografi";
        biodataMahasiswa[2].hobi[1] = "Editing";
        biodataMahasiswa[2].hobi[2] = "Traveling";
        biodataMahasiswa[2].ipk = 3.7f;

        biodataMahasiswa[3].nama = "Fikri";
        biodataMahasiswa[3].alamat = "Bantul";
        biodataMahasiswa[3].umur = 20;
        biodataMahasiswa[3].jekel = 76;
        biodataMahasiswa[3].hobi[0] = "Gaming";
        biodataMahasiswa[3].hobi[1] = "Sepeda";
        biodataMahasiswa[3].hobi[2] = "Fotografi";
        biodataMahasiswa[3].ipk = 3.2f;

        biodataMahasiswa[4].nama = "Bagas";
        biodataMahasiswa[4].alamat = "KulonProgo";
        biodataMahasiswa[4].umur = 21;
        biodataMahasiswa[4].jekel = 76;
        biodataMahasiswa[4].hobi[0] = "Musik";
        biodataMahasiswa[4].hobi[1] = "Traveling";
        biodataMahasiswa[4].hobi[2] = "Memasak";
        biodataMahasiswa[4].ipk = 3.1f;

        biodataMahasiswa[5].nama = "Yusuf";
        biodataMahasiswa[5].alamat = "Gunungkidul";
        biodataMahasiswa[5].umur = 23;
        biodataMahasiswa[5].jekel = 76;
        biodataMahasiswa[5].hobi[0] = "Mancing";
        biodataMahasiswa[5].hobi[1] = "Camping";
        biodataMahasiswa[5].hobi[2] = "Motoran";
        biodataMahasiswa[5].ipk = 3.0f;

        biodataMahasiswa[6].nama = "Aldo";
        biodataMahasiswa[6].alamat = "Bantul";
        biodataMahasiswa[6].umur = 21;
        biodataMahasiswa[6].jekel = 76;
        biodataMahasiswa[6].hobi[0] = "Basket";
        biodataMahasiswa[6].hobi[1] = "Lari";
        biodataMahasiswa[6].hobi[2] = "Fitness";
        biodataMahasiswa[6].ipk = 3.3f;

        biodataMahasiswa[7].nama = "Kevin";
        biodataMahasiswa[7].alamat = "Sleman";
        biodataMahasiswa[7].umur = 19;
        biodataMahasiswa[7].jekel = 76;
        biodataMahasiswa[7].hobi[0] = "Futsal";
        biodataMahasiswa[7].hobi[1] = "Ngoding";
        biodataMahasiswa[7].hobi[2] = "Membaca";
        biodataMahasiswa[7].ipk = 3.5f;

        biodataMahasiswa[8].nama = "Daffa";
        biodataMahasiswa[8].alamat = "Sleman";
        biodataMahasiswa[8].umur = 18;
        biodataMahasiswa[8].jekel = 76;
        biodataMahasiswa[8].hobi[0] = "Gaming";
        biodataMahasiswa[8].hobi[1] = "Ngoding";
        biodataMahasiswa[8].hobi[2] = "Desain";
        biodataMahasiswa[8].ipk = 3.9f;

        biodataMahasiswa[9].nama = "Naufal";
        biodataMahasiswa[9].alamat = "Sleman";
        biodataMahasiswa[9].umur = 22;
        biodataMahasiswa[9].jekel = 76;
        biodataMahasiswa[9].hobi[0] = "Basket";
        biodataMahasiswa[9].hobi[1] = "Gym";
        biodataMahasiswa[9].hobi[2] = "NontonFilm";
        biodataMahasiswa[9].ipk = 3.6f;

    }

    // --- METHOD untuk Mengurutkan Data (BubbleSort) ---
    public static void mengurutkanDataBubble(formatBiodata biodataMahasiswa[], boolean ascending) {
        formatBiodata biodataSementara = new formatBiodata();
        int indeksTerakhir = N - 1;
        for (int j = 0; j <= indeksTerakhir - 1; j++) {
            for (int i = 0; i <= indeksTerakhir - 1 - j; i++) {
                // perintah dibawah ini identik dengan if (nama[i]>nama[i+1])
                // Jika parameter accending bernilai true, maka gunakan logika untuk mengurutkan
                // dari kecil ke besar (ascending)
                if (ascending) {
                    if (biodataMahasiswa[i].nama.compareTo(biodataMahasiswa[i + 1].nama) > 0) {
                        biodataSementara = biodataMahasiswa[i];
                        biodataMahasiswa[i] = biodataMahasiswa[i + 1];
                        biodataMahasiswa[i + 1] = biodataSementara;
                    }
                    // Jika parameter accending bernilai false, maka gunakan logika untuk
                    // mengurutkan dari besar ke kecil (descending)
                } else {
                    if (biodataMahasiswa[i].nama.compareTo(biodataMahasiswa[i + 1].nama) < 0) {
                        biodataSementara = biodataMahasiswa[i];
                        biodataMahasiswa[i] = biodataMahasiswa[i + 1];
                        biodataMahasiswa[i + 1] = biodataSementara;
                    }
                }
            }
        }
    }

    // --- METHOD untuk Mengurutkan Data IPK (BubbleSort) ---
    public static void mengurutkanDataBubbleIPK(formatBiodata biodataMahasiswa[], boolean ascending) {
        formatBiodata biodataSementara = new formatBiodata();
        int indeksTerakhir = N - 1;

        for (int j = 0; j <= indeksTerakhir - 1; j++) {
            for (int i = 0; i <= indeksTerakhir - 1 - j; i++) {

                if (ascending) {
                    // Bandingkan IPK untuk urutan terkecil ke terbesar
                    if (biodataMahasiswa[i].ipk > biodataMahasiswa[i + 1].ipk) {
                        biodataSementara = biodataMahasiswa[i];
                        biodataMahasiswa[i] = biodataMahasiswa[i + 1];
                        biodataMahasiswa[i + 1] = biodataSementara;
                    }
                } else {
                    // Bandingkan IPK untuk urutan terbesar ke terkecil
                    if (biodataMahasiswa[i].ipk < biodataMahasiswa[i + 1].ipk) {
                        biodataSementara = biodataMahasiswa[i];
                        biodataMahasiswa[i] = biodataMahasiswa[i + 1];
                        biodataMahasiswa[i + 1] = biodataSementara;
                    }
                }
            }
        }
    }

    // --- METHOD untuk Mengurutkan Data (Selection) ---
    public static void mengurutkanDataSelection(formatBiodata biodataMahasiswa[], boolean ascending) {
        formatBiodata biodataSementara = new formatBiodata();

        for (int i = 0; i <= N - 2; i++) {
            // 1. Anggap posisi i adalah yang terkecil saat ini
            int lokasiTerkecil = i;

            // 2. Cari di sisa array (dari i+1 sampai akhir) apakah ada yang lebih kecil
            for (int S = i + 1; S <= N - 1; S++) {
                // Bandingkan nama di posisi S dengan nama di posisi lokasiTerkecil
                if (ascending) {
                    if (biodataMahasiswa[S].nama.compareTo(biodataMahasiswa[lokasiTerkecil].nama) < 0) {
                        lokasiTerkecil = S; // Catat indeks yang punya nama lebih kecil
                    }
                } else {
                    if (biodataMahasiswa[S].nama.compareTo(biodataMahasiswa[lokasiTerkecil].nama) > 0) {
                        lokasiTerkecil = S; // Catat indeks yang punya nama lebih kecil
                    }
                }
            }

            // 3. Setelah selesai mencari, tukar data di posisi i dengan data di
            // lokasiTerkecil
            // (Hanya tukar jika ditemukan data yang lebih kecil dari i)
            if (lokasiTerkecil != i) {
                biodataSementara = biodataMahasiswa[i];
                biodataMahasiswa[i] = biodataMahasiswa[lokasiTerkecil];
                biodataMahasiswa[lokasiTerkecil] = biodataSementara;
            }
        }
    }

    // --- METHOD untuk Mengurutkan Data IPK (Selection) ---
    public static void mengurutkanDataSelectionIPK(formatBiodata biodataMahasiswa[], boolean ascending) {
        formatBiodata biodataSementara = new formatBiodata();

        for (int i = 0; i <= N - 2; i++) {
            int lokasiTerkecil = i;

            for (int S = i + 1; S <= N - 1; S++) {
                if (ascending) {
                    if (biodataMahasiswa[S].ipk < biodataMahasiswa[lokasiTerkecil].ipk) {
                        lokasiTerkecil = S;
                    }
                } else {
                    if (biodataMahasiswa[S].ipk > biodataMahasiswa[lokasiTerkecil].ipk) {
                        lokasiTerkecil = S;
                    }
                }
            }

            if (lokasiTerkecil != i) {
                biodataSementara = biodataMahasiswa[i];
                biodataMahasiswa[i] = biodataMahasiswa[lokasiTerkecil];
                biodataMahasiswa[lokasiTerkecil] = biodataSementara;
            }
        }
    }

    // --- Program Utama ---
    public static void main(String[] args) {
        formatBiodata biodataMahasiswa[] = new formatBiodata[10];
        N = 10;

        for (int i = 0; i <= N - 1; i++) {
            biodataMahasiswa[i] = new formatBiodata();
        }

        System.out.println("Tabel data yang belum diurutkan : ");
        isiDataAcak(biodataMahasiswa); // Method helper untuk isi data secara langsung + acak

        // ngentriData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);

        // -- Modifikasi Program 5.1
        System.out.println("Method mengurutkanDataBubbleIPK Di Panggil dengan parameter true -> Ascending");
        mengurutkanDataBubbleIPK(biodataMahasiswa, true);
        tampilkanData(biodataMahasiswa);
        
        // -- Modifikasi Program 5.2
        // System.out.println("Method mengurutkanDataSelectionIPK Di Panggil dengan parameter false -> Descending");
        // mengurutkanDataSelectionIPK(biodataMahasiswa, false);
        // tampilkanData(biodataMahasiswa);
    }
}
