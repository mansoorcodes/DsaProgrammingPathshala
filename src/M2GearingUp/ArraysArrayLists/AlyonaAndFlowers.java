package M2GearingUp.ArraysArrayLists;

// this is not my code Someone's code in CODE FORCES...
// https://codeforces.com/problemset/problem/740/B
import java.io.*;
import java.util.Scanner;

public class AlyonaAndFlowers {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // prefix Sum[]
        int [] pSum = new int[n];
        pSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pSum[i] = arr[i] + pSum[i-1];
        }

        int ansMax = 0;
        for (int i = 0; i < k; i++) {
            int li = scn.nextInt(); // left idx of Suggested subArray
            int ri = scn.nextInt();
            int sumOfSubArray =(li == 1 ? pSum[ri-1] : pSum[ri-1]-pSum[li-2]);
            ansMax = Math.max(sumOfSubArray+ansMax, ansMax);
            // this line is the shortest possible and most optimised version of
            // doing recursion over all sub arrays and selecting some in the Suggested sub Arrays
            // which means going through all possible subsequences of suggested Sub Arrays and
            // selecting some sub arr such that their sum is MAXIMUM
            // this is nothing but DP[] but most optimised...
        }
        System.out.println(ansMax);
    }
}

/*

// this exception should be there if not it's showing error(at main method)
// public static void main(String[] args) throws IOException { // like this../\..
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int r=Integer.parseInt(s[1]);
        int arr[]=new int[n];
        int pmax[]=new int[n];
        String s1[]=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s1[i]);
            if(i==0){
                pmax[i]=arr[i];
            }
            else{
                pmax[i]=pmax[i-1]+arr[i];
            }
        }
        int l=0,ri=0;
        int res=0;
        for(int i=0;i<r;i++){
            String s2[]=br.readLine().split(" ");
            l=Integer.parseInt(s2[0]);
            ri=Integer.parseInt(s2[1]);
            if(l==1){
                res=Math.max(res,(res+pmax[ri-1]));
            }
            else{
                res=Math.max(res,(res+pmax[ri-1]-pmax[l-2]));
            }
        }
        System.out.println(res);
 */
