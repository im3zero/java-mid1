package lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {

        LottoGenerator generator = new LottoGenerator();
        int [] lottoNumbers = generator.generate();

        //생성된 로또 번호 출력
        System.out.println("로또 번호");
        for (int s : lottoNumbers) {
            //iter은 배열 정보를 프린트해줌
            System.out.print(s + " ");
        }
    }
}
