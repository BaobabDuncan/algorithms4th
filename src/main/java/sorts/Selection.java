package sorts;

/**
 * Created by sanguk on 08/11/2016.
 */
public class Selection {

    private Selection() {

    }

    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++ ){
            int min = i;
            for (int j = i +1; j < n; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exah(a, i, min);
            assert isSorted(a, 0, i);
        }
        assert isSorted(a);
    }

    private static void exah(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++){
            if (less(a[i], a[i-1])) return false;
        }
        return true;
    }

    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

}
