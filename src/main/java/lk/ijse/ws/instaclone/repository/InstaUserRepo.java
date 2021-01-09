package lk.ijse.ws.instaclone.repository;

import lk.ijse.ws.instaclone.entity.InstaUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstaUserRepo extends CrudRepository<InstaUser, Long> {
}
