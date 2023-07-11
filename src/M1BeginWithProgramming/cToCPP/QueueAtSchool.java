package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class QueueAtSchool {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        int time = scn.nextInt();
        StringBuilder queue = new StringBuilder(scn.next());
        shyGuysAfterSomeTime(queue, time, len);
    }

    private static void shyGuysAfterSomeTime(StringBuilder queue , int time, int len) {
        boolean isOk = true;
        for (int t = 0; t < time; t++) {
            for (int i = 0; i < len-1; i++) {
                char ch = queue.charAt(i);
                if(ch == 'B' && queue.charAt(i+1) == 'G'){
                    swap(queue, i, i+1);
                    isOk = false;
                    i++;
                }
            }
            if(isOk) break;
        }
        System.out.println(queue);
    }

    private static void swap(StringBuilder queue, int i, int i1) {
        // swapping boys and girls
        queue.setCharAt(i, 'G');
        queue.setCharAt(i1, 'B');
    }
}
