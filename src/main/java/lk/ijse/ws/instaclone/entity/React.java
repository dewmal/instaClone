package lk.ijse.ws.instaclone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

//@Entity
public class React {

    @Id
    private Long id;
    private InstaUser reactor;
    private Post post;
    private ReactionEnum reaction;
    private Date time;
}
