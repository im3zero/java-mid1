package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;
    //cmd + n
    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj){
//        UserV2 user = (UserV2) obj;
//        return id.equals(user.id);
//        //string 끼리의 비교는 equals
//
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}
