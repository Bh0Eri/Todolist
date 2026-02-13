package senai.todolist.service.taskService;

import senai.todolist.dto.taskDTO.TaskRequestDTO;
import senai.todolist.dto.taskDTO.TaskResponseDTO;
import senai.todolist.entity.Tasks;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskService {

    TaskResponseDTO create(TaskRequestDTO dto);

    Optional<Tasks> showOne(UUID id);

    List<TaskResponseDTO> showAll();

    void delete(UUID id);

    TaskResponseDTO update(UUID id, TaskRequestDTO dto);
}
