package enumeration.ex0;

public class DiscountService {
    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade == "BASIC") {
            discountPercent = 10;
        } else if (grade == "GOLD") {
            discountPercent = 20;
        } else if (grade == "DIAMOND") {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인 X");
        }
        // 10000 * (20/100) -> 2000
        return price * discountPercent / 100;
    }
}
