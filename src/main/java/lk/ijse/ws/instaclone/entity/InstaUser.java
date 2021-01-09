package lk.ijse.ws.instaclone.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class InstaUser {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String username;

    @Column
    private String password;

    @OneToMany
    @MapKey(name = "user")
    private List<Post> postList;

    @OneToMany
    @MapKey(name = "reactor")
    private List<React> reactList;

    @OneToMany
    @MapKey(name = "sharedUser")
    private List<Share> shareList;
    
    @OneToMany
    @MapKey(name = "commenter")
    private List<Comment> commentList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
