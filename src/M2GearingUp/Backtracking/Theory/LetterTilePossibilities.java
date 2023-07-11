package M2GearingUp.Backtracking.Theory;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LetterTilePossibilities {
    static int cnt;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String tiles = scn.next();
        char [] arr = new char[tiles.length()];
        for (int i = 0; i < tiles.length(); i++) {
            arr[i] = tiles.charAt(i);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tiles.length(); i++) {
            sb.append(arr[i]);
        }
        boolean [] visited = new boolean[tiles.length()];
        cnt = 0;
        System.out.println("My sb is: "+sb);
        dfs(0, sb, visited, new StringBuilder(),new StringBuilder());
        System.out.println(cnt);
    }

    private static void dfs(int len, StringBuilder sb, boolean[] visited, StringBuilder res, StringBuilder prevSB) {
        if(res.length() > 0) cnt++;
        if(len == sb.length()) return;

        char prev = sb.charAt(0);
        for (int i = 0; i < sb.length(); i++) {
            char curr = sb.charAt(i);
            /**
             * if(curr != prev) --> do dfs call.. also for
             * my logic is almost correct this below curr!= prev wala method
             * But only slight modification is needed...!!!
             */

//            if(!visited[i]){
//                if(i == 0 || curr != prev){
//                    visited[i] = true;
//                    res.append(curr);
//                    System.out.println("res: "+res);
//                    System.out.println("visited arr: "+ Arrays.toString(visited));
//                    dfs(len+1, sb, visited, res, prevSB);
//                    res.deleteCharAt(res.length()-1);
//                    visited[i] = false;
//                }
//            }
//            prev = curr;
            if(!visited[i]){
                StringBuilder temp = new StringBuilder(res);
                temp.append(curr);
                if(i == 0 || !temp.toString().equals(prevSB.toString())){
                    visited[i] = true;
                    res.append(curr);
                    System.out.println("res: "+res);
                    System.out.println("visited arr: "+ Arrays.toString(visited));
                    dfs(len+1, sb, visited, res, prevSB);
                    res.deleteCharAt(res.length()-1);
                    visited[i] = false;
                }
                prevSB = new StringBuilder(temp);
            }
        }
    }
}
