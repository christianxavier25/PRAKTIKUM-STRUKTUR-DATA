import java.util.Scanner;

public class chatInputViaKeyboard {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;
        char huruf;
        System.out.print("Silakan masukkan sebuah huruf: ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        huruf = (char) bacaTombol;
        System.out.println("Huruf yang anda entri adalah : " + huruf);
        masukan.close();
    }
}
