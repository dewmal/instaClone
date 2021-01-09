package lk.ijse.ws.instaclone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Share {

    @Id
    private Long id;
    @ManyToOne()
    private InstaUser sharedUser;
    @ManyToOne()
    private Post post;
    private Date time;
}
