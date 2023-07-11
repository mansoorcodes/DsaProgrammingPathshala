package M2GearingUp.ArraysArrayLists;

import java.util.Scanner;

public class MaxChunksToSortArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // bulshitLogic(arr);
        // here comes the correct approach
        // we don't even need pMax [] array
        // b/c we are accessing it every element in pMax one time during array arr traversal
        int ans = 0;
        int currMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currMax = Math.max(currMax, arr[i]);
            if(currMax == i) ans++;
        }
        System.out.println(ans);

        bruteForce(arr);
    }

    private static void bruteForce(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i< n){
            int ans = 0;
            int j = i;
            for (j = i; j < n; j++) {
                if(canBeChunked(arr, i, j)) break;
            }
            i = j+1;
            ans++;
        }
    }

    private static boolean canBeChunked(int[] arr, int i, int j) {
        int cnt = 0;
        for (int k = i; k <= j; k++) {
            if(arr[k] >= i && arr[k] <= j) cnt++;
        }
        if(cnt == (j-i+1)) return true;
        else return false;
    }

    private static void bulshitLogic(int[] arr) {
        // this logic is wrong I coded this in hurry...
        // Prefix max
        int n = arr.length;
        int[] pMax = new int[n];
        pMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pMax[i] = Math.max(pMax[i-1], arr[i]);
        }
        // no of distinct elements in pMax array is the answer
        int ans = 1;
        int curr = 0, prev = 0;
        for (int i = 1; i < n; i++) {
            curr = pMax[i];
            prev = pMax[i-1];
            if(curr != prev) ans++;
        }
        System.out.println(ans);
    }
}

/*
what kind of input is valid for this sort of problem.
Please help.
10,20,32,31,28
are these valid inputs?

SOLUTION:

for this type of inputs... we can go in this way

n=int(input())
l=list(map(int,input().split()))
arr=[i for i in l]
for i in range(n-2,-1,-1):
	arr[i]=min(arr[i],arr[i+1])
c=0
i=0
while(i<n):
	for j in range(n-1,i-1,-1):
		if l[i]>=arr[j]:
		    c=c+1
		    break
	i=j+1
print(c)

 */
