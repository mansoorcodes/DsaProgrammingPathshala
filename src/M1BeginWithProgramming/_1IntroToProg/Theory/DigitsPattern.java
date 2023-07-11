package M1BeginWithProgramming._1IntroToProg.Theory;

public class DigitsPattern {
    public static void main(String[] args) {
        /*
        *num = 1234
        * o/p
        * 1234
        * 123
        * 12
        * 1
        *
        * another problem print in reverse order of the first o/p
        * o/p
        * 1
        * 12
        * 123
        * 1234
        *
         */

        // second problem
        // Another student solution for Reverse Digits pattern
/*


#include <iostream>

        using namespace std;

        int main() {

            //  Reverse Digits pattern

            int n;

            cin>>n;

            int count=0,num=n;

            //  count number of Digits

            while(num>9)

            {

                num=num/10;

                count++;

            }

            int div=1;

            while(count--)

                div*=10;



            // printing reverse Digits pattern

            num=n;

            while(div)

            {

                n=n/div;

                cout<<n<<endl;

                n=num;

                div=div/10;

            }



            return 0;

        }

 */
    }
}
