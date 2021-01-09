package lk.ijse.ws.instaclone.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    private Long id;

    @OneToOne(cascade = CascadeType.ALL,optional = false)
    private InstaUser user;


    private String text;
    private String imageUrl;
    private Date postTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InstaUser getUser() {
        return user;
    }

    public void setUser(InstaUser user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }
}
