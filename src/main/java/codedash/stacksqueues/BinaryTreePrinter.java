package codedash.stacksqueues;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Print a binary tree in the increasing order of depth (epi9.10)
 */
public class BinaryTreePrinter {

    public static void printBinaryTreeInIncreasingDepth(Node root) {
        Queue<Pair<Node, Integer>> todo = new LinkedList<>();

        todo.add(new ImmutablePair<Node, Integer>(root, 0));
        int currentLevel = 0;
        while (!todo.isEmpty()) {
            Pair<Node, Integer> elem = todo.remove();
            Node n = elem.getKey();
            int nodeLevel = elem.getValue();
            if (nodeLevel > currentLevel) {
                System.out.println();
                currentLevel = nodeLevel;
            }
            System.out.print(elem.getKey().getLabel() + " ");
            if (n.getLeft() != null) {
                todo.add(new ImmutablePair<Node, Integer>(n.getLeft(), currentLevel + 1));
            }
            if (n.getRight() != null) {
                todo.add(new ImmutablePair<Node, Integer>(n.getRight(), currentLevel + 1));
            }
        }
    }
}
