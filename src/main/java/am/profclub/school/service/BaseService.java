package am.profclub.school.service;

import java.util.List;

public interface BaseService<T, K> extends SequenceConstants {

    K findOne(String id);

    List<K> findAll();

    void update(K model);

    void delete(String id);

    String create(K model);
}
