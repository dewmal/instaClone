package lk.ijse.ws.instaclone.service;

import lk.ijse.ws.instaclone.entity.InstaUser;
import org.springframework.stereotype.Service;

public interface InstaUserService {

    boolean saveUser(InstaUser user);

}
