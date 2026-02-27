package enumeration.test.ex1;

public enum AuthGrade {

    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private final int Level;
    private final String description;

    AuthGrade(int level, String description) {
        Level = level;
        this.description = description;
    }

    public int getLevel() {
        return Level;
    }

    public String getDescription() {
        return description;
    }
}
