package am.profclub.school.domain;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Document(collection = "d_category")
public class Category {

    public static final String PATH_SEPARATOR = "$$";

    @Id
    private String id;
    @Indexed(unique = true)
    @NotEmpty
    private String name;
    private String description;
    private String iconPath;
    @Transient
    private Collection<Category> categories = new HashSet<>();
    private String path;


}
