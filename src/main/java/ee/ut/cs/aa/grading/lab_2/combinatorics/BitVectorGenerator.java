package ee.ut.cs.aa.grading.lab_2.combinatorics;

import java.util.Set;

/**
 * Generates all possible bit vectors (bit arrays) of a fixed size.
 */
public interface BitVectorGenerator {

    /**
     * Return a set containing all bit vectors that have specified length.
     *
     * @param length of generated bit vectors
     */
    Set<boolean[]> bitVectors(int length);
}
