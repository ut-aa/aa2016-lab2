package ee.ut.cs.aa.grading.lab_2.trees;

import ee.ut.cs.aa.grading.tree.BinaryTreeVertex;

/**
 * Allows to measure binary trees.
 */
public interface BinaryTreeMeasurer {

    /**
     * Return the height of the given binary tree.
     *
     * @param tree whose height should be measured
     * @return height of the given tree (0 if root has no children)
     * @throws IllegalArgumentException if tree is empty (null)
     */
    int measureTreeHeight(BinaryTreeVertex<?> tree);

    /**
     * Count the number of nodes that exist in the given binary tree.
     *
     * @param tree whose nodes must be counted
     * @return number of nodes on all levels of the given tree
     */
    int countNodes(BinaryTreeVertex<?> tree);

    /**
     * Count the number of leaves that exist in the given binary tree.
     *
     * @param tree whose leaves must be counted
     * @return number of leaves on all levels of the given tree
     */
    int countLeaves(BinaryTreeVertex<?> tree);
}
