package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMills = System.currentTimeMillis();
        System.out.println("currentTimeMills = " + currentTimeMills);

        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경 변수를 읽는다
        System.out.println("getenv = " + System.getenv());


        //시스템 속성을 읽는다
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " +  System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        //운영체제나 하드웨어 레벨에서 배열을 통째로
        //배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));


        //프로그램 종료
        System.exit(0);
    }
}
