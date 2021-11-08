package users;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
    private static int last_ID = 0;
    private int ID;
    private String status;
    public void update(){
        this.status = "";
    }

    public User(){
        this.ID = last_ID;
        last_ID++;
    }
}
