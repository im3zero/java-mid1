package enumeration.ref2;


public class DiscountService {
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;

//        if (grade == Grade.BASIC) {
//            discountPercent = 10;
//        } else if (grade == Grade.GOLD) {
//            discountPercent = 20;
//        } else if (grade == Grade.DIAMOND) {
//            discountPercent = 30;
//        } else {
//            System.out.println("할인 X");
//        }

    }
}
