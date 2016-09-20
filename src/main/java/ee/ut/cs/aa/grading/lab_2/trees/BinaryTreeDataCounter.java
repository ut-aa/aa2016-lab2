package ee.ut.cs.aa.grading.lab_2.trees;

import ee.ut.cs.aa.grading.tree.BinaryTreeVertex;

/**
 * Allows to find values in arbitrary binary trees.
 *
 * @param <Data> type of data stored in the binary tree
 */
public interface BinaryTreeDataCounter<Data> {

    /**
     * Count how many copies of the given data exist in the tree.
     * <p/>
     * Implementations <b>must</b> use {@link Data#equals(Object)} method to check values for equality (i.e. do not use
     * {@code node.data == data} to check if two values are equal).
     *
     * @param tree whose nodes will be checked
     * @param data that will be used to check nodes of the given tree
     * @return number of nodes in the given tree that store data equal to given data
     */
    int countData(BinaryTreeVertex<Data> tree, Data data);
}
