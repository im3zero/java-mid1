package lang.immutable.address;

public class ImmutableAddress {
    private final String value;
    //내부 값이 변경되면 안됨 -> final

    public ImmutableAddress(String value) {
        this.value = value;
    }


    public String getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Address {" +
                "value = '" + value + '\'' +
                '}';
    }
}
