package am.profclub.school.mapper.config;

import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by admin on 3/22/17.
 */
@Configuration
@ConditionalOnClass(ModelMapper.class)
public class ModelMapperAutoConfiguration {

	/**
	 * Defines the {@link ModelMapperFactoryBean} instance.
	 *
	 * @return {@link ModelMapperFactoryBean}
	 */
	@Bean
	@ConditionalOnMissingBean(ModelMapperFactoryBean.class)
	public ModelMapperFactoryBean modelMapperFactoryBean() {

		return new ModelMapperFactoryBean();
	}
}