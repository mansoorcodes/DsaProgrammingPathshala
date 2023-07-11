package M2GearingUp.Recursion.Theory;

public class RecursionTreeDiagram {
    public static void main(String[] args) {
        func(0);
        // O/P: {0 1 2 3 4 3 2 3 4}
    }

    private static void func(int x) {
        System.out.print(x+" ");
        if(x >= 3) return;
        func(x+1);
        func(x+2);
    }
}

/**
 * If I have understood the video correctly then:
 * Max Height: 3 - x + 1
 * SC : O(3-x+1)
 * tc = 2^(3-x)
 *
 * HOW TO FIND SPACE AND TIME???
 * (This is Binary Tree & its Max height and total no of nodes)
 *
 *  ***** SC ******
 * The height of the recursion tree is (4-x). And there are 2 branches at each node.
 * Does that make it a binary tree? How many maximum nodes can be there
 * in a binary tree of height h?
 *
 *  ***** TC ******
 *  Exactly, so the number of nodes is 2^(3-x)
 */