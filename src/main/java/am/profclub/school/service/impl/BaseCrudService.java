package am.profclub.school.service.impl;

import am.profclub.school.domain.BaseAuditEntity;
import am.profclub.school.domain.BaseEntity;
import am.profclub.school.dto.BaseDto;
import am.profclub.school.repositories.BaseRepository;
import am.profclub.school.service.BaseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by admin on 3/22/17.
 */
public class BaseCrudService<T extends BaseEntity, K extends BaseDto> implements BaseService<T,K> {

	@Autowired
	protected BaseRepository<T> repository;

	@Autowired
	protected ModelMapper modelMapper;

	protected Class<T> entityClass;
	protected Class<K> modelClass;

	@SuppressWarnings("unchecked")
	public BaseCrudService() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
		this.modelClass = (Class<K>) genericSuperclass.getActualTypeArguments()[1];
	}

	public K findOne(String id) {
		Optional<T> entity = repository.findById(id);
		return modelMapper.map(entity, modelClass);
	}

	public List<K> findAll() {
		List<K> result = new ArrayList<>();
		List<T> entities = repository.findAll();
		for (T entity : entities)
		{
			result.add(modelMapper.map(entity, modelClass));
		}
		return result;
	}

	public void update(K model) {
		T entity = modelMapper.map(model, entityClass);
		repository.save(entity);
	}

	public void delete(String id) {
		Optional<T> entity = repository.findById(id);
		repository.delete(entity.get());
	}

	public String create(K model) {
		T entity = modelMapper.map(model, entityClass);
		entity = repository.save(entity);
		return entity.getId();
	}
}
