package am.profclub.school.service;

import java.util.List;

public interface BaseService<T, K> extends SequenceConstants {

    K findOne(int id);

    List<K> findAll();

    void update(K model);

    void delete(int id);

    int create(K model);
}
