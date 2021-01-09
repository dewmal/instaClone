package lk.ijse.ws.instaclone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

//@Entity
public class Share {

    @Id
    private Long id;
    private InstaUser sharedUser;
    private Post post;
    private Date time;
}
