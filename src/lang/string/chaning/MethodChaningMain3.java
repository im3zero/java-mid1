package lang.string.chaning;

public class MethodChaningMain3 {
    public static void main(String[] args) {
        ValueAdder adder1 = new ValueAdder();
        ValueAdder adder2 = new ValueAdder();
        adder1.add(1).add(2).add(3).getValue();
        adder2.add(2).add(3).add(4).getValue();

        int result1 = adder1.getValue();
        int result2 = adder2.getValue();

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

    }
}
