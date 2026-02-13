package lang.immutable.change;

public class ImmutableObj {
    private final int value;
    //절대 바뀌면 안됨

    public ImmutableObj(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public ImmutableObj add(int addValue){
        int result = value + addValue;
        //본인은 바꾸지 않고 새로운 객체를 생성함
        //그 후 객체를 반환함
        ImmutableObj immutableObj = new ImmutableObj(30);
        return immutableObj;
        //return new ImmutableObj(30);

        //새로 생성한 객체를 출력값으로 줌
    }



}
