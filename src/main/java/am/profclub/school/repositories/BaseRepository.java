package am.profclub.school.repositories;

import am.profclub.school.domain.BaseEntity;
import org.springframework.data.mongodb.repository.*;
import org.springframework.data.repository.*;

/**
 * Created by admin on 3/22/17.
 */
@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends MongoRepository<T, String> {

}