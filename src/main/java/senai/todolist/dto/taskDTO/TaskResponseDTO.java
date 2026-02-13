package senai.todolist.dto.taskDTO;


import lombok.Builder;
import lombok.Data;
import senai.todolist.enums.Status;

import java.util.UUID;

@Data
@Builder
public class TaskResponseDTO {

    private UUID id;
    private String taskName;
    private String description;
    private Status status;

}
