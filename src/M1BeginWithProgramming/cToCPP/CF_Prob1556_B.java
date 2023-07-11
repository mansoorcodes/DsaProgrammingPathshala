package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

import static M1BeginWithProgramming._2Arrays.BubbleSort.swap;

public class CF_Prob1556_B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int n = scn.nextInt();
            int [] arr = new int[n];
            int evenCnt = 0, oddCnt = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
                if(arr[i] % 2 == 0) evenCnt++;
                else oddCnt++;
            }
            if(oddCnt+1 == evenCnt || oddCnt == evenCnt){
                int steps = 0;
                for (int i = 0; i < (n+1)/2; i++) {
                    // check if our base elem is odd if not make it odd
                    while(arr[i] % 2 == 0){
                        int j = i+1;
                        for (; j < n; j++) {
                            if(arr[j] % 2 == 1) break;
                        }
                        while (j != i){
                            // swapping
                            swap(arr, j, j-1);
                            steps++;
                        }
                    }
                    // now our base place is set an odd number
                    // now try to find an even and bring that next to our base odd
                    int j = i+1;
                    for (;j != n && arr[j] %2 == 1; j++){
                        if(arr[j] %2 == 0) break;
                    }
                    while (arr[i+1] %2 == 1) {
                        swap(arr, j, j-1);
                        j--;
                        steps++;
                        if(j == i+1) break;
                    }
                }
                System.out.println(steps);
            } else if (evenCnt+1 == oddCnt) {

            } else{
                System.out.println(-1);
            }
        }
    }
}
