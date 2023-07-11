package M1BeginWithProgramming._1IntroToProg.Theory;

import java.util.Scanner;
// Can be solved using Bit Manipulation also.

public class CookingMachine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        //System.out.println(val +" is Power of 2:"+isPowerO2(val));
        while(t>0){
            int val = scn.nextInt();
            int endVal = scn.nextInt();
            // if my val != power of 2 then divide until it becomes power of 2
            int noOfSteps = 0;

            while(!isPowerO2(val)){
                if(val %2 == 0){
                    val /= 2;
                    noOfSteps++;
                }else{
                    val = (val-1)/2;
                    noOfSteps++;
                }
            }
            // now val became power of 2
            // now multiply / divide until val becomes endVal

            if(val <= endVal){
                while(val != endVal){
                    val *= 2;
                    noOfSteps++;
                }
            }else{
                while(val != endVal){
                    val /= 2;
                    noOfSteps++;
                }
            }
            System.out.println(noOfSteps);
            t--;
        }
    }

    private static boolean isPowerO2(int val) {
        if(val == 1) return true;
        int count = 0;
        while(val >1){
            if(val % 2 == 0){
                val /= 2;
                count++;
            }else{
                return false;
            }
        }
        return true;
    }
}


/*  This code looks more different wow

#include <iostream>
using namespace std;

int expPowerTwo(int n){
    //If n = 2^x, eg: n is 4 ==> n = 2^2, in this function returning x+1 i.e for n=4 it will return 3
    //and if n=1 it will return 1. On the other hand if n != 2^x then it will return 0
int exponent = 0;
    while(n){
            if((n%2!=0) && (n!=1)){
            exponent=0;
            break;
            }
            exponent++;
            n /= 2;
            }
            return exponent;
            }

            int main() {
            int t;
            cin>>t;
            while(t){
            int a,b;
            cin>>a>>b;

            int b_exp = expPowerTwo(b);

            int count=0;
            while(!(a==b)){
            if(a%2!=0 && a!=1)     // if a is odd and a is not 1 (because 1 is power of 2)
            a = (a-1)/2;
            else{    // a is even or a is 1
            if(a<=b && expPowerTwo(a)){
            count += (b_exp - expPowerTwo(a));
            break;
            }
            else    // keep dividing 'a' by 2 till either (a become <= b) or (a = 2^x, i.e power of 2)
            a /= 2;
            }
            count++;
            }

            cout<<count<<endl;

            t--;
            }
            return 0;
            }

            */


/* Flow of the program for a = 3 and b = 8  and count = 0

=> a = 3, b = 8, therefore b_exp = 4 (since 8 is 2^3 => b_exp = 3+1 )

Iter_1: 3 is odd and a!=1 => a = (a-1)/2 => a = 1  ==>  count = 1

Iter_2: (i) 1 is odd but a!=1 is false
        (ii) 1<=8 && expPowerTwo(1)  =>  1 && 1 ==> true
        (iii) count = count + (b_exp - expPowerTwo(a))  ==>  count = 1 + (4-1) = 4
        (iv) And because of break it will come out of loop

Output : 4
*/





