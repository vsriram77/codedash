package codedash.lists;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;


/**
 * Stack that can return Max value in the stack in O(1) time
 *
 * Stores a pair with every entry of stack
 */
public class MaxiStack {
    // pair of <value:maxValueSoFar>
    private List<Pair<Integer, Integer>> stack = new ArrayList<>();

    public MaxiStack add(int i) {
        int topIndex = stack.size() - 1;
        int max = (topIndex < 0)? i : stack.get(topIndex).getValue();
        int newMax = (i > max)? i : max;
        Pair<Integer, Integer> p = new ImmutablePair<>(i, newMax);
        this.stack.add(p);
        return this;
    }

    public int max() {
        int topIndex = stack.size() - 1;
        if (topIndex < 0) {
            throw new RuntimeException("Empty stack");
        }

        return stack.get(topIndex).getValue();
    }

    public int pop() {
        int topIndex = stack.size() - 1;
        if (topIndex < 0) {
            throw new RuntimeException("Empty stack");
        }

        return stack.remove(topIndex).getKey();

    }
}

