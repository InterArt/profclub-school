package am.profclub.school.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "d_subject")
public class Subject extends BaseEntity {

    private String name;
    private String description;

    private Category category;

}
