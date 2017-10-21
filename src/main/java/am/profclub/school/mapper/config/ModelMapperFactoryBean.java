package am.profclub.school.mapper.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * A factory bean that instantiates the {@link ModelMapper} and configures it by delegating to registered
 * {@link ModelMapperConfigurer} instances.
 *
 *
 * Created by admin on 3/22/17.
 */
public class ModelMapperFactoryBean implements FactoryBean<ModelMapper> {

	/**
	 * The class literal.
	 */
	private static final Class<ModelMapper> MODEL_MAPPER_CLASS = ModelMapper.class;

	/**
	 * The list of configurers used for customizing the behaviour of the model mapper.
	 */
	@Autowired(required = false)
	private List<ModelMapperConfigurer> configurers;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelMapper getObject() throws Exception {

		// instantiates new instance of mapper
		final ModelMapper modelMapper = new ModelMapper();

		// configures the mapper
		configure(modelMapper);

		// returns the mapper
		return modelMapper;
	}

	@Override
	public Class<?> getObjectType() {
		return MODEL_MAPPER_CLASS;
	}

	@Override
	public final boolean isSingleton() {
		return true;
	}

	/**
	 * Configures the model mapper instance be delegating toward registered {@link ModelMapperConfigurer} instances.
	 *
	 * @param modelMapper the model mapper
	 */
	private void configure(ModelMapper modelMapper) {
		if (configurers != null) {
			for (ModelMapperConfigurer modelMapperConfigurer : configurers) {
				modelMapperConfigurer.configure(modelMapper);
			}
		}
	}
}