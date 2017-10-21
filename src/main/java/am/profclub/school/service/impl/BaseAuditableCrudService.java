package am.profclub.school.service.impl;

import am.profclub.school.domain.BaseAuditEntity;
import am.profclub.school.dto.BaseDto;
import java.util.Date;

/**
 * Created by admin on 3/22/17.
 */
public class BaseAuditableCrudService<T extends BaseAuditEntity, K extends BaseDto> extends BaseCrudService<T,K> {

	protected void beforeUpdate(T entity) {
		entity.setDateEdited(new Date().getTime());
	}

	protected void beforeAdd(T entity) {
		entity.setDateAdded(new Date().getTime());
	}

	public String create(K model) {
		T entity = modelMapper.map(model, entityClass);
		beforeAdd(entity);
		entity = repository.save(entity);
		return entity.getId();
	}

	public void update(K model) {
		T entity = modelMapper.map(model, entityClass);
		 beforeUpdate(entity);
		repository.save(entity);
	}
}
