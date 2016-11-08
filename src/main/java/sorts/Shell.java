package sorts;

/**
 * Created by sanguk on 08/11/2016.
 */
public class Shell {
    public static void sort(Comparable[] a) {
        int n = a.length;

        int h = 1;
        while(h < n/3) h = 3 * h + 1;

        while (h >= 1){
            for (int i = h; i < n; i++){
                for (int j = i; j >=h && less(a[j], a[j-1]); j-=h) {
                    exch(a, j, j-h);
                }
            }
            h /= 3;
        }

        assert isSorted(a);

    }


    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }


    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }
}
