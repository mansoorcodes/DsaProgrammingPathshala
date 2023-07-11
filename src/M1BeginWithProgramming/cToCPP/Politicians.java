package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class Politicians {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int people = scn.nextInt();
            int topics = scn.nextInt();
            String [] str = new String [topics];
            for (int i = 0; i < people; i++) {
                str[i] = scn.next();
            }

            char [][] opinions = new char [people][topics];
            for (int i = 0; i < people; i++) {
                opinions [i] = str[i].toCharArray();
            }

            int peopleRemaining = -1;
            for (int col = 0; col < topics; col++) {
                int totalYes = 0, totalNo = 0;
                char myOpinion = opinions [0][col];
                for (int row = 0; row < people && opinions [row][col] != '@'; row++) {
                    char ch = opinions [row][col];
                    if(ch == '+') totalYes++;
                    else if(ch == '-') totalNo++;
                }
                if(totalNo == totalYes) {
                    peopleRemaining = 0;
                    break;
                }else{
                    peopleRemaining = (myOpinion == '+'? totalYes: totalNo);
                }

                for (int row = 0; row < people && col < topics -1 && opinions [row][col] != '@'; row++) {
                    if(opinions [row][col] != myOpinion) opinions[row][col] = '@';
                }
            }
            System.out.println(peopleRemaining);
        }
    }
}
