package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"), BAD_REQUEST(400, "Bad Request"), NOT_FOUND(404, "Not Found"), INTERNAL_SERVER_ERROR(500, "Internal Server Error");
    private final int code;
    private final String message;



    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int httpCodeInput) {
/*      public → 어디서든 접근 가능
        static → 객체 생성 없이 클래스명으로 호출 가능
        HttpStatus → 반환 타입 (enum 타입)
        findByCode → 메서드 이름
        int httpCodeInput → 찾고 싶은 HTTP 상태 코드 (예: 200, 404 등)
*/
        for (HttpStatus status :values()) {
            if(status.code == httpCodeInput) {
                return status;
            }
        }
        return null;
    }

    public boolean isSuccess(){
        if (200 <= code && code <= 299){
            return true;
        }
        return false;
    }
}
