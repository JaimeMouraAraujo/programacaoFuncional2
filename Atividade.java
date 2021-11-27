import java.util.Arrays;

class Atividade {
    public static int[] multiplicar(int[] array) {
        return Arrays.stream(array).map((i) -> i * 2).toArray();
    }

    public static float media(int[] array) {
        return (float) Arrays.stream(array).average().orElse(Double.NaN);
    }

    public static boolean palindromo(String str, int i) {
        if (i < Math.floor(str.length() / 2)) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }

            palindromo(str, i + 1);
        }

        return true;
    }
}