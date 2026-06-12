import java.util.Scanner;

class simpul { // bagian deklarasi struktur record ----------------------------------
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
    simpul kanan;
}

class praktik8_1 {
    public static Scanner masukan = new Scanner(System.in);
    public static simpul awal;
    public static simpul akhir;

    public static void inisialisasiSenaraiKosong() {
        awal = null;
        akhir = null;
    }

    public static void tambahDepan() {
        // ------------bagian entri data dari keyboard--------------
        String NAMA;
        String ALAMAT;
        int UMUR;
        char JEKEL;
        String HOBI[] = new String[3];
        float IPK;
        System.out.println("------------------------------");
        System.out.println("TAMBAH DEPAN : ");
        System.out.print("Silakan masukkan nama anda : ");
        NAMA = masukan.nextLine();
        System.out.print("Silakan masukkan alamat anda : ");
        ALAMAT = masukan.nextLine();
        System.out.print("Silakan masukkan umur anda : ");
        UMUR = Integer.parseInt(masukan.nextLine());
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        JEKEL = masukan.nextLine().charAt(0);
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        HOBI[0] = masukan.nextLine();
        System.out.print("hobi ke-1 : ");
        HOBI[1] = masukan.nextLine();
        System.out.print("hobi ke-2 : ");
        HOBI[2] = masukan.nextLine();
        System.out.print("Silakan masukkan IPK anda : ");
        IPK = masukan.nextFloat();
        masukan.nextLine(); // untuk membersihkan buffer setelah membaca float
        // ------------bagian menciptakan & mengisi simpul baru--------------
        simpul baru;
        baru = new simpul();
        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        baru.hobi[0] = HOBI[0];
        baru.hobi[1] = HOBI[1];
        baru.hobi[2] = HOBI[2];
        baru.ipk = IPK;
        // ---------bagian mencangkokkan simpul baru ke dalam simpul lama------------
        if (awal == null) // jika senarai masih kosong
        {
            awal = baru;
            akhir = baru;
            baru.kanan = null;
        } else // jika senarai tidak kosong
        {
            baru.kanan = awal;
            awal = baru;
        }

    }

    public static void tambahBelakang() {
        // ------------bagian entri data dari keyboard--------------
        String NAMA;
        String ALAMAT;
        int UMUR;
        char JEKEL;
        String HOBI[] = new String[3];
        float IPK;
        System.out.println("------------------------------");
        System.out.println("TAMBAH BELAKANG : ");
        System.out.print("Silakan masukkan nama anda : ");
        NAMA = masukan.nextLine();
        System.out.print("Silakan masukkan alamat anda : ");
        ALAMAT = masukan.nextLine();
        System.out.print("Silakan masukkan umur anda : ");
        UMUR = Integer.parseInt(masukan.nextLine());
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        JEKEL = masukan.nextLine().charAt(0);
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        HOBI[0] = masukan.nextLine();
        System.out.print("hobi ke-1 : ");
        HOBI[1] = masukan.nextLine();
        System.out.print("hobi ke-2 : ");
        HOBI[2] = masukan.nextLine();
        System.out.print("Silakan masukkan IPK anda : ");
        IPK = masukan.nextFloat();
        masukan.nextLine(); // untuk membersihkan buffer setelah membaca float
        // ------------bagian menciptakan & mengisi simpul baru--------------
        simpul baru;
        baru = new simpul();
        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        baru.hobi[0] = HOBI[0];
        baru.hobi[1] = HOBI[1];
        baru.hobi[2] = HOBI[2];
        baru.ipk = IPK;
        // ----------bagian mencangkokkan simpul baru ke dalam simpul lama----------
        if (awal == null) {
            awal = baru;
            akhir = baru;
            baru.kanan = null;
            // jika senarai kosong
        } else // jika senarai tidak kosong
        {
            akhir.kanan = baru;
            akhir = baru;
            baru.kanan = null;
        }
    }

    public static void cetakSenarai() {
        if (awal == null) // jika senarai masih kosong
            System.out.print("....MAAF SENARAI KOSONG....");
        else // jika senarai tidak kosong
        {
            System.out.println(" ");

            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");

            System.out.printf("| %-3s | %-15s | %-20s | %-8s | %-10s | %-15s | %-15s | %-15s | %-8s |%n",
                    "NO", "NAMA", "ALAMAT", "UMUR", "JEKEL",
                    "HOBI 1", "HOBI 2", "HOBI 3", "IPK");

            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");

            simpul bantu;
            bantu = awal;

            int no = 1;

            while (bantu != null) {

                System.out.printf("| %-3d | %-15s | %-20s | %-8d | %-10s | %-15s | %-15s | %-15s | %-8.2f |%n",
                        no,
                        bantu.nama,
                        bantu.alamat,
                        bantu.umur,
                        bantu.jekel,
                        bantu.hobi[0],
                        bantu.hobi[1],
                        bantu.hobi[2],
                        bantu.ipk);

                bantu = bantu.kanan;
                no++;
            }

            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");

            System.out.println(" ");
        }
    }

    // ---------bagian program utama-----------
    public static void main(String[] args) {
        inisialisasiSenaraiKosong();
        tambahDepan();
        tambahDepan();
        tambahDepan();
        System.out.println("------------------------------");
        cetakSenarai();
        tambahBelakang();
        tambahBelakang();
        tambahBelakang();
        System.out.println("------------------------------");
        cetakSenarai();
    }
}