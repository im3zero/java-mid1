package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    //private 생략 Grade(int discountPercent)
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    //추가
    //할인율
    //계산 로직 추가
    public int discount(int price){
        return discountPercent * price /100;
    }
}
