package am.profclub.school;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * This configuration class has three responsibilities:
 * <ol>
 * <li>It enables the auto configuration of the Spring application context.</li>
 * <li>
 * It ensures that Spring looks for other components (controllers, services, and repositories) from
 * the <code>com.assignment.media</code> package.</li>
 * <li>It launches our application in the main() method.</li>
 * </ol>
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    private static Logger LOG = LoggerFactory.getLogger(Application.class);


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
