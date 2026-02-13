package senai.todolist.dto.userDTO;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.resilience.annotation.EnableResilientMethods;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserRequestDTO {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    private String Email;

    @Size(min = 6, max = 20, message = "Password is required")
    private String password;
}
