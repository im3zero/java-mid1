package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] result = email.split("@");
        String result1 = result[0];
        String result2 = result[1];


        System.out.println("ID : " + result1);
        System.out.println("domain : " + result2);
    }
}
