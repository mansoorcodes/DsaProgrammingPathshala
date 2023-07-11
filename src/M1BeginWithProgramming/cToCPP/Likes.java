package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class Likes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int time = scn.nextInt();
            int likes = 0, dislikes = 0;
            for (int i = 0; i < time; i++) {
                int a = scn.nextInt();
                if(a> 0) likes++;
                else dislikes++;
            }
            maxLikes(likes, dislikes);
            System.out.println();
            minLikes(likes, dislikes);
            System.out.println();
        }
    }

    private static void minLikes(int likes, int dislikes) {
        int i = 0;
        likes -= dislikes;
        while (dislikes-- >0) {
            System.out.print(1 + " " + 0 + " ");
        }
        while (likes-- >0){
            System.out.print(++i+" ");
        }
    }

    private static void maxLikes(int likes, int dislikes) {
        int i = 0;
        while (likes-- >0){
            System.out.print(++i+" ");
        }
        while (dislikes-- >0){
            System.out.print(--i+" ");
        }

    }
}
