package M2GearingUp.ArraysArrayLists;

/*

Prefix sum, Prefix Max, suffix sum, suffix max
For the modified problem of find max in range in array
we have to use some advanced algo
--> Segment tree
--> Sparse Table...
Conversation: (in PPA L2.Pre computation Lecture)
How to go about problems in which there is finding the maximum element among the [i,j]
(ith to jth elements of an array), and neither i nor j is a terminal position in the array..
( In an array [3,5,6,7,8,9,1,2,43,23], what would be the optimized approach of finding the
maximum element in between the indices [3,6]?

Rishabh
For that, if there are no online updations, you can use a sparse table, which takes O(nlog(n)) time
to build and O(1) to return the range max query

Sridharan N
Could you please specify what is meant by online updations?

Dhaval Kumar
Online updations means you only want to query the max in range [l, r] multiple times
and not update the value of array. If you want to update the value
then you can use some advance data structure such as segment tree which give you O(log(n)) to update
and O(log(n)) to query. I don't think that would be necessary at this stage
you make take those when they appear in the lectures)

(sparse table: https://cp-algorithms.com/data_structures/sparse-table.html,
segment tree: https://cp-algorithms.com/data_structures/segment_tree.html)
 */
public class PreComputations {
    public static void main(String[] args) {

    }
}
