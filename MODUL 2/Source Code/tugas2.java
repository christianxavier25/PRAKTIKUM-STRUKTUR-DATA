import java.util.Scanner;

class formatBiodata { // bagian deklarasi struktur record ---------------------------------
    String nama;
    String nim;
    float nilaiUTS;
    float nilaiUAS;
}

public class tugas2 {
    public static Scanner masukan = new Scanner(System.in);
    public static int N;

    // --------------------------------------------------
    // --- Fungsi untuk mengentri data ke dalam Larik ---
    // --------------------------------------------------
    public static void ngentriSatuData(formatBiodata biodataMahasiswa[], int N) {
        boolean valid;

        // --- VALIDASI NAMA ---
        valid = false;
        while (!valid) {
            System.out.print("Silakan masukkan nama anda : ");
            String inputNama = masukan.nextLine();

            // Cek apakah input hanya berisi huruf (A-Z, a-z)
            if (inputNama.matches("[a-zA-Z ]+")) {
                biodataMahasiswa[N].nama = inputNama;
                valid = true;
            } else {
                System.out.println("Input tidak valid! Nama tidak boleh mengandung angka.");
            }
        }

        // --- VALIDASI NIM ---
        valid = false;
        while (!valid) {
            System.out.print("Silakan NIM anda : ");
            String nim = masukan.next();
            if (nim.matches("[0-9]+") && nim.matches("\\d{9,}")) {
                biodataMahasiswa[N].nim = nim;
                valid = true;
            } else {
                System.out.println("NIM hanya berupa angka dan terdiri dari 9 digit, cnth : 255410048");
            }
        }

        // --- VALIDASI NILAI UTS ---
        valid = false;
        while (!valid) {
            System.out.print("Silakan masukkan nilai UTS anda : ");
            if (masukan.hasNextFloat()) {
                float nilaiUTS = masukan.nextFloat();
                if (nilaiUTS > 0.0 && nilaiUTS <= 100.0) {
                    biodataMahasiswa[N].nilaiUTS = nilaiUTS;
                    valid = true;
                } else {
                    System.out.println("Mohon masukkan nilai UTS yang valid");
                }
            } else {
                System.out.println("Input harus berupa angka (gunakan titik, misal: 80.5)!");
                masukan.next();
            }
        }

        // --- VALIDASI NILAI UAS ---
        valid = false;
        while (!valid) {
            System.out.print("Silakan masukkan nilai UAS anda : ");
            if (masukan.hasNextFloat()) {
                float nilaiUAS = masukan.nextFloat();
                if (nilaiUAS > 0.0 && nilaiUAS <= 100.0) {
                    biodataMahasiswa[N].nilaiUAS = nilaiUAS;
                    valid = true;
                } else {
                    System.out.println("Mohon masukkan nilai UAS yang valid");
                }
            } else {
                System.out.println("Input harus berupa angka (gunakan titik, misal: 80.5)!");
                masukan.next();
            }
        }

    }

    // --------------------------------------------------
    // --- Fungsi untuk menampilkan data ---
    // --------------------------------------------------
    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
        // bagian menampilkan isi struktur Larik --------------------------
        System.out.println("-----------------------------------------------------------------");
        System.out.println("NAMA\t\t\tNIM\tNILAI UTS\tNILAI UAS");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i <= N - 1; i++) {
            System.out.print(biodataMahasiswa[i].nama + "\t");
            System.out.print(biodataMahasiswa[i].nim + "\t");
            System.out.print(biodataMahasiswa[i].nilaiUTS + "\t\t");
            System.out.print(biodataMahasiswa[i].nilaiUAS + "\t\t");
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------");
    }

    // --------------------------------------------------
    // --- Program Utama ---
    // --------------------------------------------------
    public static void main(String[] args) {
        int userInput;
        // Pindahkan deklarasi array ke luar agar bisa diakses oleh View dan Input
        formatBiodata biodataMahasiswa[] = new formatBiodata[20];
        N = 0; // Inisialisasi N global mulai dari 0

        do {
            System.out.println("\nMENU UTAMA");
            System.out.println("=====================================");
            System.out.println("1. Input");
            System.out.println("2. View");
            System.out.println("3. Exit");
            System.out.print("Silahkan masukkan pilihan anda (1/2/3) : ");

            userInput = masukan.nextInt();
            masukan.nextLine();

            if (userInput == 1) {
                // Logika Input
                boolean statusInput = true;
                do {
                    if (N >= 20) {
                        System.out.println("Penyimpanan penuh!");
                        break;
                    }
                    biodataMahasiswa[N] = new formatBiodata();
                    ngentriSatuData(biodataMahasiswa, N);
                    N++;

                    System.out.print("Input data lagi? (Y/N): ");
                    String statusText = masukan.next();
                    statusInput = statusText.equalsIgnoreCase("Y");
                    System.out.println();
                    masukan.nextLine();
                } while (statusInput);

            } else if (userInput == 2) {
                // Logika View
                if (N == 0) {
                    System.out.println("Data masih kosong! Silahkan input terlebih dahulu.");
                } else {
                    tampilkanData(biodataMahasiswa);
                }

            } else if (userInput == 3) {
                System.out.println("Terima kasih! Program selesai.");

            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (userInput != 3); // Menu akan terus muncul selama user tidak memilih 3
    }
}