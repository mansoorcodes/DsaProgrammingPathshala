package M1BeginWithProgramming._1IntroToProg.Theory;

public class _5IncrementOrDecrement {
    /* a++ -----> first return a & then modify
    *  ++a -----> first modify a & then return  */

    public static void main(String[] args) {

        playingWithIncrementDecrement();

        anotherWayOfForLoop();

        reverseAString();


    }

    private static void reverseAString() {
        String str="Java is Great";
        StringBuilder reverse= new StringBuilder();
        for(int i=str.length()-1; i>=0; i--) {   //line1
            reverse.append(str.charAt(i)); // line 2
        }
        System.out.println(reverse);

        for(int j=str.length()-1;j>=0;) {
            int jj = j--;
            reverse.append(str.charAt(jj));
        }
        System.out.println(reverse);
    }

    private static void anotherWayOfForLoop() {
        int k = 0;
        for(; k< 7; ){
            k++;
            System.out.print(k);
        }
        System.out.println(k);
    }

    private static void playingWithIncrementDecrement() {
        int a = 5;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(a);
        System.out.println(a++);

        int y = 4;
        int ans1 = ++y * y++;
        System.out.println(ans1);
        int z = 4;
        int ans2 = z++ * ++z;
        System.out.println(ans2);

        int i=5;
        System.out.println((++i)  +  (++i));
        System.out.println(i);

        int j=5;
        System.out.println(++j  +  ++j);
        System.out.println(j);

        int ii=5;
        System.out.println(ii++ +  ++ii ); //expected->  5 7 =12
        ii = 5;
        System.out.println(++ii +  ii++ ); //expected->  6  6 =12
        ii = 5;
        System.out.println(++ii +  ++ii); //expected->  6  7 =13
        System.out.println("new things");

        int k = 0;
        for(; k< 7; k++){
            System.out.print(k+" ");
        }
        System.out.println(k);

        int h = 0;
        for(; h< 7; ++h){
            System.out.print(h+" ");
        }
        System.out.println(h);

    }
}
