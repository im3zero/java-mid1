package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);

        System.out.println("index = " + index);
        //6번째부터 시작한다


        while (index >= 0 ) {
            index = str.indexOf(key, index + 1);
            //바로 다음칸부터 찾는 것
            //System.out.println("index = " + index);
            count++;
        }
        System.out.println("count = " + count);
    }
}
