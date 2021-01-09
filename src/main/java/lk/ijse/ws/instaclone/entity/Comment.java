package lk.ijse.ws.instaclone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Comment {
    @Id
    private Long id;

    @ManyToOne()
    private InstaUser commenter;
    @ManyToOne()
    private Post post;
    private String comment;
    private Date time;
}
