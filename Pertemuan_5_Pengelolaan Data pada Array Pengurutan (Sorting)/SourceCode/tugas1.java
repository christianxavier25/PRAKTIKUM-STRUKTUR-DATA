import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class tugas1 {
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

    // --- METHOD untuk Mengurutkan Data (Insertion) ---
    public static void mengurutkanDataInsertion(formatBiodata biodataMahasiswa[], boolean ascending) {
        formatBiodata biodataSementara = new formatBiodata();
        int awal;
        int cari;
        awal = 1;
        while (awal <= N - 1) {
            biodataSementara = biodataMahasiswa[awal];
            cari = awal - 1;
            while (cari >= 0) {
                if (ascending) {
                    if (biodataMahasiswa[cari].nama.compareTo(biodataSementara.nama) > 0) {
                        biodataMahasiswa[cari + 1] = biodataMahasiswa[cari];
                        biodataMahasiswa[cari] = biodataSementara;
                        cari--;
                    } else {
                        biodataMahasiswa[cari + 1] = biodataSementara;
                        cari = -1;
                    }
                } else {
                    if (biodataMahasiswa[cari].nama.compareTo(biodataSementara.nama) < 0) {
                        biodataMahasiswa[cari + 1] = biodataMahasiswa[cari];
                        biodataMahasiswa[cari] = biodataSementara;
                        cari--;
                    } else {
                        biodataMahasiswa[cari + 1] = biodataSementara;
                        cari = -1;
                    }
                }
            }
            awal++;
        }

        System.out.println(
                "Data berhasil diurutkan secara " + (ascending ? "ascending" : "descending") + " berdasarkan nama.");
        System.out.println();
    }

    // --- METHOD tambahDataDiBelakang => LARIK
    public static void tambahDataDiBelakang(formatBiodata biodataMahasiswa[]) {
        formatBiodata biodataMahasiswaBaru = new formatBiodata();
        int bacaTombol = 0;

        System.out.println("========================================================");
        System.out.print("Silakan masukkan nama anda : ");
        biodataMahasiswaBaru.nama = masukan.nextLine();
        System.out.print("Silakan masukkan alamat anda : ");
        biodataMahasiswaBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan umur anda : ");
        biodataMahasiswaBaru.umur = masukan.nextInt();
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        biodataMahasiswaBaru.jekel = (char) bacaTombol;
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        biodataMahasiswaBaru.hobi[0] = masukan.next();
        System.out.print("hobi ke-1 : ");
        biodataMahasiswaBaru.hobi[1] = masukan.next();
        System.out.print("hobi ke-2 : ");
        biodataMahasiswaBaru.hobi[2] = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        biodataMahasiswaBaru.ipk = masukan.nextFloat();
        System.out.println("Data berhasil ditambahkan di belakang larik (index ke-" + N + ")");
        System.out.println("========================================================");
        biodataMahasiswa[N] = biodataMahasiswaBaru;
        masukan.nextLine();
        N++;

        System.out.println();
    }

    // --- Program Utama ---
    public static void main(String[] args) {
        int pilihanMenu;
        boolean lanjut = true;
        formatBiodata biodataMahasiswa[] = new formatBiodata[100];
        N = 10;

        for (int i = 0; i <= N - 1; i++) {
            biodataMahasiswa[i] = new formatBiodata();
        }

        System.out.print("Tabel data yang belum diurutkan : ");
        isiDataAcak(biodataMahasiswa); // Method helper untuk isi data secara langsung + acak
        tampilkanData(biodataMahasiswa);

        while (lanjut) {
            System.out.println("Menu :");
            System.out.println("1. insert data");
            System.out.println("2. View data");
            System.out.println("3. Sort data");
            System.out.println("4. Exit");
            System.out.print("Silahkan masukkan pilihan : ");
            pilihanMenu = masukan.nextInt();
            masukan.nextLine(); // Membersihkan buffer setelah membaca angka

            switch (pilihanMenu) {
                case 1:
                    tambahDataDiBelakang(biodataMahasiswa);
                    break;

                case 2:
                    tampilkanData(biodataMahasiswa);
                    break;

                case 3:
                    mengurutkanDataInsertion(biodataMahasiswa, true); // true untuk ascending
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    lanjut = false; // Menghentikan loop dan keluar dari program
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih antara 1-4.");
                    System.out.println();
                    break;
            }
        }
    }
}
