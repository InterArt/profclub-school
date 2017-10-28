package am.profclub.school.controller.web.interceptors.layout;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Layout {

    String value() default "layout/default";

    String titleKey() default "title.page.default";
}