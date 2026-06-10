import java.util.Scanner;

class simpul {
    String nama; // FIX 1: tambah field nama yang hilang
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
    simpul kiri;
    simpul kanan;
}

class modul10_praktik1_senaraiGanda { // FIX 2: semua method masuk ke dalam class ini
    public static simpul awal;
    public static simpul akhir;
    public static Scanner masukan = new Scanner(System.in); // FIX 3: deklarasi Scanner

    public static void inisialisasiSenaraiKosong() {
        awal = null;
        akhir = null;
    }

    public static void tambahDepan() {
        String NAMA, ALAMAT;
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
        masukan.nextLine();

        simpul baru = new simpul();
        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        baru.hobi[0] = HOBI[0];
        baru.hobi[1] = HOBI[1];
        baru.hobi[2] = HOBI[2];
        baru.ipk = IPK;

        if (awal == null) {
            awal = baru;
            akhir = baru;
            baru.kiri = null;
            baru.kanan = null;
        } else {
            baru.kanan = awal;
            awal.kiri = baru;
            awal = baru;
            awal.kiri = null;
        }
    }

    public static void tambahBelakang() {
        String NAMA, ALAMAT;
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
        masukan.nextLine();

        simpul baru = new simpul();
        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        baru.hobi[0] = HOBI[0];
        baru.hobi[1] = HOBI[1];
        baru.hobi[2] = HOBI[2];
        baru.ipk = IPK;

        if (awal == null) // jika senarai kosong
        {
            awal = baru;
            akhir = baru;
            baru.kiri = null;
            baru.kanan = null;
        } else // jika senarai tidak kosong
        {
            baru.kiri = akhir;
            akhir.kanan = baru;
            akhir = baru;
            akhir.kanan = null;
        }
    }

    public static void cetakSenarai() {
        if (awal == null)
            System.out.print("....MAAF SENARAI KOSONG....");
        else {
            System.out.println(" ");
            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");
            System.out.printf("| %-3s | %-15s | %-20s | %-8s | %-10s | %-15s | %-15s | %-15s | %-8s |%n",
                    "NO", "NAMA", "ALAMAT", "UMUR", "JEKEL", "HOBI 1", "HOBI 2", "HOBI 3", "IPK");
            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");

            simpul bantu = awal;
            int no = 1;

            while (bantu != null) {
                System.out.printf("| %-3d | %-15s | %-20s | %-8d | %-10s | %-15s | %-15s | %-15s | %-8.2f |%n",
                        no, bantu.nama, bantu.alamat, bantu.umur, bantu.jekel,
                        bantu.hobi[0], bantu.hobi[1], bantu.hobi[2], bantu.ipk);
                bantu = bantu.kanan;
                no++;
            }

            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");
            System.out.println(" ");
        }
    }

    public static int hitungJumlahSimpul() {
        int N = 0;
        simpul bantu = awal;
        while (bantu != null) {
            N++;
            bantu = bantu.kanan;
        }
        return N;
    }

    public static void tambahTengah() {
        System.out.print("Tentukan Lokasi Penambahan Data: ");
        int LOKASI = masukan.nextInt();
        masukan.nextLine(); // FIX 4: bersihkan buffer setelah nextInt()

        int jumlahSimpulYangAda = hitungJumlahSimpul();

        if (LOKASI == 1) {
            System.out.println("Lakukan penambahan di depan");
        } else if (LOKASI > jumlahSimpulYangAda) {
            System.out.println("Lakukan penambahan di belakang");
        } else {
            String NAMA, ALAMAT;
            int UMUR;
            char JEKEL;
            String HOBI[] = new String[3];
            float IPK;

            System.out.println("TAMBAH TENGAH : ");
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
            masukan.nextLine();

            // Cari simpul di posisi LOKASI-1 (simpul sebelum posisi sisip)
            simpul bantu = awal;
            int i = 1;
            while (i < LOKASI - 1) {
                bantu = bantu.kanan;
                i++;
            }

            simpul baru = new simpul();
            baru.nama = NAMA;
            baru.alamat = ALAMAT;
            baru.umur = UMUR;
            baru.jekel = JEKEL;
            baru.hobi[0] = HOBI[0];
            baru.hobi[1] = HOBI[1];
            baru.hobi[2] = HOBI[2];
            baru.ipk = IPK;

            simpul sesudah = bantu.kanan; // simpul yang akan ada di kanan baru
            baru.kanan = sesudah; // 1. baru → sesudah
            baru.kiri = bantu; // 2. baru ← bantu
            if (sesudah != null) {
                sesudah.kiri = baru; // 3. sesudah ← baru (jika bukan akhir)
            } else {
                akhir = baru; // 3b. jika sisip di akhir, update akhir
            }
            bantu.kanan = baru; // 4. bantu → baru (terakhir!)
        }
    }

    public static void hapus() {
        if (awal == null) // jika senarai masih kosong
        {
            System.out.println("senarai kosong, menghapus tidak dapat dilakukan");
        } else // jika senarai tidak kosong
        {
            System.out.print("Silakan masukkan nama yang ingin dihapus : ");
            String NAMACARI = masukan.nextLine();
            if (awal == akhir) // jika hanya ada sebuah simpul
            {
                if (awal.nama.equals(NAMACARI)) {
                    System.out.println("menghapus " + NAMACARI + " dilakukan..");
                    inisialisasiSenaraiKosong();
                } else
                    System.out.println("data " + NAMACARI + " tidak ditemukan");
            } else if (awal.nama.equals(NAMACARI)) // jika nama ditemukan di awal
            {
                System.out.println("menghapus " + NAMACARI + " dilakukan..");
                awal = awal.kanan;
                awal.kiri = null;
            } else {
                simpul bantu;
                bantu = awal.kanan;
                while (bantu.nama.equals(NAMACARI) == false) {
                    bantu = bantu.kanan;
                    if (bantu.kanan == null)
                        break;
                }
                if ((bantu == akhir) && (akhir.nama.equals(NAMACARI) == false)) {
                    System.out.println("data " + NAMACARI + " tidak ditemukan");
                } else if (akhir.nama.equals(NAMACARI)) // jika nama ditemukan di akhir
                {
                    akhir = bantu.kiri;
                    akhir.kanan = null;
                } else {
                    System.out.println("menghapus " + NAMACARI + " dilakukan..");
                    bantu.kanan.kiri = bantu.kiri;
                    bantu.kiri.kanan = bantu.kanan;
                }
            }
        }
    }

    public static void cetakSenaraiMaju() {
        if (awal == null)
            System.out.print("....MAAF SENARAI KOSONG....");
        else {
            System.out.println(" ");
            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");
            System.out.printf("| %-3s | %-15s | %-20s | %-8s | %-10s | %-15s | %-15s | %-15s | %-8s |%n",
                    "NO", "NAMA", "ALAMAT", "UMUR", "JEKEL", "HOBI 1", "HOBI 2", "HOBI 3", "IPK");
            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");

            simpul bantu = awal;
            int no = 1;

            while (bantu != null) {
                System.out.printf("| %-3d | %-15s | %-20s | %-8d | %-10s | %-15s | %-15s | %-15s | %-8.2f |%n",
                        no, bantu.nama, bantu.alamat, bantu.umur, bantu.jekel,
                        bantu.hobi[0], bantu.hobi[1], bantu.hobi[2], bantu.ipk);
                bantu = bantu.kanan; // traversal ke depan
                no++;
            }

            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");
            System.out.println(" ");
        }
    }

    public static void cetakSenaraiMundur() {
        if (awal == null)
            System.out.print("....MAAF SENARAI KOSONG....");
        else {
            System.out.println(" ");
            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");
            System.out.printf("| %-3s | %-15s | %-20s | %-8s | %-10s | %-15s | %-15s | %-15s | %-8s |%n",
                    "NO", "NAMA", "ALAMAT", "UMUR", "JEKEL", "HOBI 1", "HOBI 2", "HOBI 3", "IPK");
            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");

            simpul bantu = akhir;
            int no = 1;

            while (bantu != null) {
                System.out.printf("| %-3d | %-15s | %-20s | %-8d | %-10s | %-15s | %-15s | %-15s | %-8.2f |%n",
                        no, bantu.nama, bantu.alamat, bantu.umur, bantu.jekel,
                        bantu.hobi[0], bantu.hobi[1], bantu.hobi[2], bantu.ipk);
                bantu = bantu.kiri; // traversal ke belakang
                no++;
            }

            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        tambahDepan();
        tambahDepan();
        tambahDepan();
        tambahDepan();
        cetakSenarai();
        tambahBelakang();
        tambahBelakang();
        tambahBelakang();
        tambahBelakang();
        cetakSenarai();
        tambahTengah();
        cetakSenaraiMaju();
        cetakSenaraiMundur();
        hapus();
        cetakSenaraiMaju();
    }
}