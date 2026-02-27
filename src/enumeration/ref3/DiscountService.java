package enumeration.ref3;

public class DiscountService {
    public int discount(Grade grade, int price) {
        return grade.discount(price);
        //이 계산 로직이 이제 필요 없음 !

        //할인율 계산에 사용
        //grade 안에 할인율 들어가있음
    }
}
