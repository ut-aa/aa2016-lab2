package ee.ut.cs.aa.grading.lab_2.combinatorics;

import java.util.Set;

/**
 * Generates subsets of a set.
 */
public interface SubSetGenerator<T> {

    /**
     * Return all subsets of a set.
     *
     * @param set whose subsets will be returned
     * @return set that contains all the subsets
     */
    Set<Set<T>> allSubsets(Set<T> set);

    /**
     * Return all subsets of a set that have a fixed size.
     *
     * @param set whose subsets will be returned
     * @param k   size of the subsets
     * @return set that contains all the subsets of fixed size
     */
    Set<Set<T>> allSubsetsOfSizeK(Set<T> set, int k);
}
