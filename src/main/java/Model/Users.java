package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class Users {
    @Id
    private String userId;
    private String fullName;
    private String username;
    private String email;
    private String recoveryEmail;
    private String password;
    private Date birthDate;
    private byte[] profilePicture;
    private String phoneNumber;
    private LocalDateTime lastLoginDate;
    private LocalDateTime creationDate;
}
