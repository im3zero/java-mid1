package enumeration.test.ex1;



public class AuthGradeMain2 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("grade = " + value.name() + ", Level = " + value.getLevel() + ", 설명 = " + value.getDescription());
        }
    }
}
