package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {

        //기본형 -> 래퍼
        int value = 7;
        Integer boxedValue = value; //오토박싱


        //래퍼 -> 기본형
        int unboxedValue = boxedValue; //오토언박싱

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

    }
}
