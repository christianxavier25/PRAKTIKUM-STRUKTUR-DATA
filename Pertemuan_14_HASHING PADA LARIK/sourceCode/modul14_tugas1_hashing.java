import java.util.Scanner;

class formatBiodata { // bagian deklarasi struktur record ----------------------------------
    int nim;
    String nama;
    String alamat;
    int umur;
    char jekel;
    float ipk;
}

class modul14_tugas1_hashing {
    public static int N = 0;
    public static Scanner masukan = new Scanner(System.in);

    public static int hitungNilaiHash(int nilaiAwal) {
        int hasil;
        hasil = nilaiAwal % 997;
        return (hasil);
    }

    public static void ngentriData(formatBiodata biodataMahasiswa[]) {

        N = 1000;
        int NH;

        System.out.print("Berapa data yang akan dientri ? : ");
        int banyakEntri = masukan.nextInt();

        formatBiodata biodataMahasiswaBaru;

        for (int i = 0; i <= banyakEntri - 1; i++) {

            System.out.println();
            System.out.println("=== Data Mahasiswa ke-" + (i + 1) + " ===");

            biodataMahasiswaBaru = new formatBiodata();

            System.out.print("Silakan masukkan NIM anda : ");
            biodataMahasiswaBaru.nim = masukan.nextInt();

            masukan.nextLine(); // untuk membersihkan buffer input setelah membaca integer

            System.out.print("Silakan masukkan nama anda : ");
            biodataMahasiswaBaru.nama = masukan.nextLine();

            System.out.print("Silakan masukkan alamat anda : ");
            biodataMahasiswaBaru.alamat = masukan.nextLine();

            System.out.print("Silakan masukkan umur anda : ");
            biodataMahasiswaBaru.umur = masukan.nextInt();

            System.out.print("Silakan masukkan Jenis Kelamin anda : ");
            biodataMahasiswaBaru.jekel = masukan.next().charAt(0);

            System.out.print("Silakan masukkan IPK anda : ");
            biodataMahasiswaBaru.ipk = masukan.nextFloat();

            NH = hitungNilaiHash(biodataMahasiswaBaru.nim);

            // +++++++ MENGATASI COLLISION +++++++++++++++++++++
            while (biodataMahasiswa[NH].nama != null) {
                System.out.println("terjadi tabrakan pada NH=" + NH);
                NH++;
            }
            // +++++++++++++++++++++++++++++++++++++++++++++++++++

            System.out.println(
                    "Biodata " + biodataMahasiswaBaru.nama +
                            " akan ditempatkan pada larik ke : " + NH);

            biodataMahasiswa[NH] = biodataMahasiswaBaru;
        }
    }

    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {

        System.out.println();

        System.out.println(
                "==================================================================================================");
        System.out.printf("| %-4s | %-10s | %-25s | %-12s | %-4s | %-5s | %-4s |\n",
                "IDX", "NIM", "NAMA", "ALAMAT", "UMUR", "JK", "IPK");
        System.out.println(
                "==================================================================================================");

        for (int i = 0; i <= N - 1; i++) {

            if (biodataMahasiswa[i].nim != 0) {

                System.out.printf("| %-4d | %-10d | %-25s | %-12s | %-4d | %-5c | %-4.2f |\n",
                        i,
                        biodataMahasiswa[i].nim,
                        biodataMahasiswa[i].nama,
                        biodataMahasiswa[i].alamat,
                        biodataMahasiswa[i].umur,
                        biodataMahasiswa[i].jekel,
                        biodataMahasiswa[i].ipk);

            }
        }

        System.out.println(
                "==================================================================================================");
    }

    public static void cariData(formatBiodata biodataMahasiswa[]) {

        int nimDicari;
        int NH;

        System.out.println();
        System.out.print("Masukkan NIM yang akan dicari : ");
        nimDicari = masukan.nextInt();

        NH = hitungNilaiHash(nimDicari);

        while (NH < N && biodataMahasiswa[NH].nama != null) {

            if (biodataMahasiswa[NH].nim == nimDicari) {

                System.out.println();
                System.out.println("===== DATA DITEMUKAN =====");
                System.out.println("Larik ke        : " + NH);
                System.out.println("NIM             : " + biodataMahasiswa[NH].nim);
                System.out.println("Nama            : " + biodataMahasiswa[NH].nama);
                System.out.println("Alamat          : " + biodataMahasiswa[NH].alamat);
                System.out.println("Umur            : " + biodataMahasiswa[NH].umur);
                System.out.println("Jenis Kelamin   : " + biodataMahasiswa[NH].jekel);
                System.out.println("IPK             : " + biodataMahasiswa[NH].ipk);

                return;
            }

            NH++;
        }

        System.out.println();
        System.out.println("Data dengan NIM " + nimDicari + " tidak ditemukan.");
    }

    public static void main(String[] args) {
        // bagian deklarasi record berbasis LARIK -----------------------
        formatBiodata biodataMahasiswa[] = new formatBiodata[1000];
        for (int i = 0; i <= 999; i++)
            biodataMahasiswa[i] = new formatBiodata();
        // pemanggilan fungsi-fungsi
        ngentriData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);

        cariData(biodataMahasiswa);
    }
}
