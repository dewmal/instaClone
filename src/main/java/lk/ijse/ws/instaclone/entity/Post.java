package lk.ijse.ws.instaclone.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Post {

    @Id
    private Long id;

    @ManyToOne
    private InstaUser user;
    private String text;
    private String imageUrl;
    private Date postTime;

    @OneToMany
    @MapKey(name = "post")
    private List<Comment> commentList;
    @OneToMany
    @MapKey(name = "post")
    private List<React> reactList;
    @OneToMany
    @MapKey(name = "post")
    private List<Share> shareList;

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
