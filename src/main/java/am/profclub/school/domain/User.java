package am.profclub.school.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "d_user")
public class User {

    @Id
    private long id;
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

}
