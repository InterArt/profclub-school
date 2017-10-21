package am.profclub.school.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Data
@Document(collection = "d_skills")
public class Skill extends BaseEntity {

    @Indexed(unique = true)
    @NotEmpty
    private String name;
}
