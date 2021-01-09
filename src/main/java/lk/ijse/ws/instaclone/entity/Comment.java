package lk.ijse.ws.instaclone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

//@Entity
public class Comment {
    @Id
    private Long id;

    private InstaUser commenter;
    private Post post;
    private String comment;
    private Date time;
}
