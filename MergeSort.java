import java.util.Arrays;
import java.util.stream.Stream;

class MergeSort {

    public static String[] sort(String[] array) {
        if (array.length <= 1) {
            return array;
        }

        return merge(sort(copy(array, 0, array.length / 2)), sort(copy(array, array.length / 2, array.length)));
    }

    public static String[] merge(String[] arr1, String[] arr2) {

        if (arr1.length <= 0) {
            return arr2;
        }
        if (arr2.length <= 0) {
            return arr1;
        }

        if (arr1[0].compareTo(arr2[0]) <= 0) {
            return concat(arr1[0], merge(copy(arr1, 1, arr1.length), arr2));
        } else {
            return concat(arr2[0], merge(arr1, copy(arr2, 1, arr2.length)));
        }
    }

    public static final String[] concat(String arr1, String[] arr2) {
        return Stream.of(new String[] { arr1 }, arr2)
                .flatMap(listArray -> Stream.of(listArray)).toArray(String[]::new);
    }

    public static final String[] copy(String[] array, int start, int endExclusive) {
        return Arrays.copyOfRange(array, start, endExclusive);
    }
}