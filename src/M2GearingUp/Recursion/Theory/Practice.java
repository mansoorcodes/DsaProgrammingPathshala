package M2GearingUp.Recursion.Theory;

public class Practice {
    public static void main(String[] args) {
        String str = "Programming";
//        behaviourOfStrings(str);
//        System.out.println(str); //3

        StringBuilder sb1 = new StringBuilder("Programming");
        System.out.println(sb1);
        passByvalueSB(sb1);
        System.out.println(sb1);
    }

    private static void passByvalueSB(StringBuilder sb1) {
//        StringBuilder sb2 = new StringBuilder(sb1);
//        sb2.append('F');
        passByValueSB2(new StringBuilder(sb1).append('F'));
    }

    private static void passByValueSB2(StringBuilder sb2) {
        sb2.append(" PathShala");
        System.out.println(sb2);
    }

    private static void behaviourOfStrings(String str) {
        addStrings(str, "Pathshala");
        System.out.println(str); //2
    }

    private static void addStrings(String str, String add) {
        str = str + add;
        System.out.println(str); //1
    }
}
