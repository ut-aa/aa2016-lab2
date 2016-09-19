package ee.ut.cs.aa.grading.lab_2.combinatorics;

import java.util.Comparator;

public class BitVectorComparator implements Comparator<boolean[]> {
    @Override
    public int compare(boolean[] o1, boolean[] o2) {
        int commonLength = Math.min(o1.length, o2.length);

        for (int i = 0; i < commonLength; i++) {
            if (!o1[i] && o2[i]) {
                return -1;
            }

            if (o1[i] && !o2[i]) {
                return 1;
            }
        }

        return o1.length - o2.length;
    }
}
