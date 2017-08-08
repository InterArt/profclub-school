package am.profclub.school.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "d_subject")
public class Subject {

    @Id
    private String id;
    private String name;
    private String description;

}
