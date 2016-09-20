package ee.ut.cs.aa.grading.lab_2.combinatorics.task_4;

import java.util.List;
import java.util.Set;

public interface HarmonicWorkgroup {

    /**
     * Select the largest possible group of employees for which its harmony rating will be above
     * (strictly greater than) 0.5.
     * <p/>
     * Employee names are given in the employees list. i-th employee corresponds to i-th row and column in the given
     * harmony matrix (so if a given list has N employees, you can assume that the harmony matrix is a N x N matrix).
     * <p/>
     * Harmony rating for a pair of employees with indices [i] and [j] is given in the harmony matrix at [i][j]
     * (the matrix is symmetrical). This rating is a value between 0 and 1 (inclusive). Harmony rating of a person
     * with himself is always 1.
     * <p/>
     * Harmony rating for a larger group is computed as an arithmetic mean for all pairings of people in that group.
     * For example, the harmony rating for a group of three people {A, B, C} (with indices being a, b and c
     * respectively) would be:<br/>
     * (harmonyMatrix[a][b] + harmonyMatrix[a][c] + harmonyMatrix[b][c]) / 3
     *
     * @param employees     list of names of employees
     * @param harmonyMatrix matrix of harmony ratings for pairs of employees; harmonyMatrix[i][j] is a harmony rating
     *                      for i-th and j-th employee from the list
     * @return the largest possible group of employees with harmony rating above 0.5
     */
    Set<String> selectWorkgroup(List<String> employees, double[][] harmonyMatrix);
}