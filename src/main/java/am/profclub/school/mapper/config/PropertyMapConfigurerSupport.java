package am.profclub.school.mapper.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

/**
 * An {@link PropertyMap} model mapper configurer. This template method class allows to specify
 * the {@link PropertyMap} that will be registered within the model mapper.
 *
 * @param <S> the source object type
 * @param <D> the destination object type
 *
 * Created by admin on 3/22/17.
 */
public abstract class PropertyMapConfigurerSupport<S, D> implements ModelMapperConfigurer {

	/**
	 * Allows to specify the specific property mapping between two different objects.
	 *
	 * @return the property map
	 */
	public abstract PropertyMap<S, D> mapping();

	/**
	 * Configures the passed {@link ModelMapper} instance by registering the {@link PropertyMap} defined by
	 * {@link #mapping()} method.
	 *
	 * @param modelMapper {@link ModelMapper} instance to be configured
	 */
	@Override
	public void configure(ModelMapper modelMapper) {

		modelMapper.addMappings(mapping());
	}
}