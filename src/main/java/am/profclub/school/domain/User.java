package am.profclub.school.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "d_users")
public class User extends BaseEntity {

    @Id
    private String id;
    private String name;
    private String surname;

    @Indexed(unique = true)
    private String username;
    @Indexed(unique = true)
    private String emailAddress;
    private String password;

    private Status status;

    private Address address;
    private Account account;
    private List<String> skills;

}
