package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruitsSplit = fruits.split(",");

        for (String result : fruitsSplit) {
            System.out.println(result);
            //이거는 그냥 출력부분
        }

        String result2 = String.join(" -> ", fruitsSplit);

        System.out.println("\njoined String = " + result2);

    }
}
