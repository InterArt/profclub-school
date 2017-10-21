package am.profclub.school.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class UserDto extends BaseDto {

    private String firstName;
    private String lastName;

    private String username;
    private String emailAddress;
    private String password;

    private StatusDto status;
    private AddressDto address;
    private AccountDto account;
}
