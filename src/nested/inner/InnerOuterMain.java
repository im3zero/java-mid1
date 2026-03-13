package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        //InnerOuter outer2 = new InnerOuter();
        //InnerOuter outer3 = new InnerOuter();
        //어떤 인스턴스랑 연결할지를 알아야됨
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerClass = "  + inner.getClass());

    }
}
