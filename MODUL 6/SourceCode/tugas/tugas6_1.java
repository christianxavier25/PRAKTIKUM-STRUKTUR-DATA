import java.util.Scanner;

public class tugas6_1 {
    // Kapasitas maksimum tumpukan teks
    public static int N = 10;
    public static int atas = -1;

    // Fungsi PUSH untuk menambah teks (Mengetik)
    public static void ketikTeks(String stack[], String teks) {
        if (atas == N - 1) {
            System.out.println("(!) Memori penuh, tidak bisa menyimpan ketikan baru.");
        } else {
            atas = atas + 1;
            stack[atas] = teks;
            System.out.println("Teks \"" + teks + "\" ditambahkan.");
        }
    }

    // Fungsi POP untuk menghapus teks terakhir (Undo)
    public static void undoTeks(String stack[]) {
        if (atas < 0) {
            System.out.println("(!) Tidak ada yang bisa di-undo. Teks kosong.");
        } else {
            System.out.println("Undo Berhasil: Menghapus \"" + stack[atas] + "\"");
            atas = atas - 1;
        }
    }

    // Fungsi untuk menampilkan isi editor saat ini
    public static void tampilkanEditor(String stack[]) {
        System.out.println("\nIsi Text Editor Saat Ini: ");
        if (atas < 0) {
            System.out.print("[Kosong]");
        } else {
            for (int i = 0; i <= atas; i++) {
                System.out.println("(" + i + ") " + stack[i] + " ");
            }
        }
        System.out.println("\n--------------------------");
    }

    public static void main(String[] args) {
        String[] stackTeks = new String[N];
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=== SIMULASI UNDO TEXT EDITOR ===");

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Ketik Teks (Push)");
            System.out.println("2. Undo (Pop)");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kata/kalimat: ");
                    String teksBaru = input.nextLine();
                    ketikTeks(stackTeks, teksBaru);
                    tampilkanEditor(stackTeks);
                    break;
                case 2:
                    undoTeks(stackTeks);
                    tampilkanEditor(stackTeks);
                    break;
                case 3:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);

        input.close();
    }
}