package M2GearingUp.Recursion.DivideAndConquer;

public class PracticeOfFunctionPassByR {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Manic");
        func1(sb1);
        System.out.println("after func: "+sb1);
    }
    private static void func1(StringBuilder sb1) {

        sb1 = new StringBuilder("Bhai");
        System.out.println("Inside func: "+sb1);
    }
}
