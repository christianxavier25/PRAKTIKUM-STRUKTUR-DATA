import java.util.ArrayList;
import java.util.stream.IntStream;

public class BelajarArray_list {
    public static void main(String[] args) {
        ArrayList<String> namaBuah = new ArrayList<>();

        namaBuah.add("Mangga");
        namaBuah.add("Pisang");
        namaBuah.add("Semangka");

        // Cara mencetak arrayList
        // Cara 1, langsung mencetak dari variablenya
        // System.out.println(namaBuah);

        // Cara 2, menggunakan for each
        // int counter = 1;
        // for (String buah : namaBuah) {
        // System.out.println("Buah ke " + counter + " : " + buah);
        // counter++;
        // }

        // Cara 3, menggunakan Instream dan method chaining forEach
        // IntStream.range(0, namaBuah.size())
        // .forEach(i -> System.out.println("Nama Buah ke " + (i + 1) + " : " +
        // namaBuah.get(i)));

        // System.out.println(namaBuah.getFirst());
        // System.out.println(namaBuah.getLast());
        // System.out.println(namaBuah.getClass());
        // System.out.println(namaBuah.size());
    }
}
