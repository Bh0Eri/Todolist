package senai.todolist.dto.taskDTO;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import senai.todolist.enums.Status;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskRequestDTO {

    @NotBlank(message = "Task need to have a name")
    private String taskName;

    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    @NotNull(message = "User ID is required")
    private UUID userId;


}
