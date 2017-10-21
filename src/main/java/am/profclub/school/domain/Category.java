package am.profclub.school.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.HashSet;

@Data
@Document(collection = "d_category")
public class Category extends BaseEntity {

    public static final String PATH_SEPARATOR = "$$";

    @Indexed(unique = true)
    @NotEmpty
    private String name;
    private String description;
    private String iconPath;
    @Transient
    private Collection<Category> categories = new HashSet<>();
    private String path;


}
