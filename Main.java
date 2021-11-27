import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    // arquivo com ideal exclusivo de exemplificação
    public static void main(String[] args) {
        System.out.println("Multiplicação:");
        System.out.println("Antes");
        Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }).forEach(System.out::println);
        System.out.println("");
        System.out.println("Depois");
        Arrays.stream(Atividade.multiplicar(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 })).forEach(System.out::println);
        System.out.println("");

        System.out.println("Média:");
        System.out.println(Atividade.media(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        System.out.println("");

        System.out.println("Merge sort:");
        Stream.of(MergeSort.sort(new String[] { "z", "a", "b", "t", "k", "m" })).forEach(System.out::println);
        System.out.println("");

        System.out.println("A palavra \"Kayak\" é palindromo? " + (Atividade.palindromo("kayak", 0) ? "Sim" : "Não"));
    }
}
