package lang.wrapper;

public class MyInteger {


    private final int value;
    //나의 값이랑 비교하는 것


    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        //compareTo => 외부 메서드 사용
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
        //숫자를 문자로 반환해줌
    }
}