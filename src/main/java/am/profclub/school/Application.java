package am.profclub.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
