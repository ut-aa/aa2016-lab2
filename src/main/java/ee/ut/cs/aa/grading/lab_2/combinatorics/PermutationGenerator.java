package ee.ut.cs.aa.grading.lab_2.combinatorics;

import java.util.List;
import java.util.Set;

/**
 * Generates permutations of a list.
 */
public interface PermutationGenerator<T> {

    /**
     * Return all permutations of a list.
     *
     * @param list whose permutations will be generated
     * @return a set of all permutations (represented as lists) of the initial list
     */
    Set<List<T>> allPermutations(List<T> list);
}
