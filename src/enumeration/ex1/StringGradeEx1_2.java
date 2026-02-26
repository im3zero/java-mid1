package enumeration.ex1;


public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();


        //StringGrade 를 사용하세요! -> 문자열을 사용한다고해서
        //문제가 해결되는 것은 아님
        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: "+ vip);

        //오타
        int diammmond = discountService.discount("DIAMMMOND", price);
        System.out.println("DIAMMMOND 등급의 할인 금액: "+ diammmond);

        //소문자 입력
        int gold1 = discountService.discount("gold", price);
        System.out.println("gold1 등급의 할인 금액: "+ gold1);

        }
}
