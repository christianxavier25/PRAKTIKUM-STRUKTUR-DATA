import java.util.Arrays;

public class testingMetodSorting {

    public static void dataNama() {
        // Array berisi nama-nama yang tidak berurutan
        String[] daftarNama = { "Budi", "Andi", "Zaki", "Citra", "Eka", "adit" };

        System.out.println("Sebelum diurutkan: " + Arrays.toString(daftarNama));

        // Menggunakan method bawaan Java
        Arrays.sort(daftarNama);

        System.out.println("Setelah diurutkan: " + Arrays.toString(daftarNama));

        // Menggunakan method bawaan Java dengan mengabaikan perbedaan huruf besar dan
        // kecil
        Arrays.sort(daftarNama, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Setelah diurutkan: " + Arrays.toString(daftarNama));
        System.out.println();
    }

    public static void dataAngka() {
        int[] angka = { 5, 2, 9, 1, 3 };

        System.out.println("Sebelum diurutkan: " + Arrays.toString(angka));

        // Memanggil method bawaan Java
        Arrays.sort(angka);

        System.out.println("Sebelum diurutkan: " + Arrays.toString(angka));
        // Output: [1, 2, 3, 5, 9]
        System.out.println();
    }

    public static void main(String[] args) {
        dataNama();
        dataAngka();
    }
}
