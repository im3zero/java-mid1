package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);
        //반환값이 없으면 결과가 바뀌지 않음


        System.out.println("obj1 = " + obj1.getValue());
        //아무것도 처리되지 않능 것처럼 보이지만 객체가 만들어지고 없어진 것임
    }
}
