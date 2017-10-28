package am.profclub.school.config;


import org.springframework.boot.actuate.autoconfigure.security.EndpointRequest;
import org.springframework.boot.autoconfigure.security.StaticResourceRequest;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.filter.CharacterEncodingFilter;
import javax.servlet.ServletContext;

@Configuration
@EnableWebSecurity
@ComponentScan
public class WebConfiguration extends WebSecurityConfigurerAdapter {

    @Bean
    public ServletContextInitializer servletContextInitializer() {
        return (ServletContext servletContext) -> {
            final CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
            characterEncodingFilter.setEncoding("UTF-8");
            characterEncodingFilter.setForceEncoding(false);
        };
    }


    @Override
    public void init(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // 1
                .requestMatchers(EndpointRequest.to("status", "info"))
                .permitAll()
                // 2
                .requestMatchers(EndpointRequest.toAnyEndpoint())
                .hasRole("ACTUATOR")
                // 3
                .requestMatchers(StaticResourceRequest.toCommonLocations())
                .permitAll().and().antMatcher("/v1/**").authorizeRequests().anyRequest().authenticated().mvcMatchers("/**").permitAll();
    }
}
