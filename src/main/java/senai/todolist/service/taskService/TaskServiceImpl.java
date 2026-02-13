package senai.todolist.service.taskService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import senai.todolist.Mapper.TaskMapper;
import senai.todolist.dto.taskDTO.TaskRequestDTO;
import senai.todolist.dto.taskDTO.TaskResponseDTO;
import senai.todolist.entity.Tasks;
import senai.todolist.repositories.TaksRepo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService{


    private final TaksRepo taskRepo;

    @Override
    public TaskResponseDTO create(TaskRequestDTO dto) {

        Tasks task = TaskMapper.toEntity(dto);
        Tasks saved = taskRepo.save(task);

        return TaskMapper.toDto(saved);
    }

    @Override
    public Optional<Tasks> showOne(UUID id) {
        return taskRepo.findById(id);
    }

    @Override
    public List<TaskResponseDTO> showAll() {
        return taskRepo.findAll()
                .stream()
                .map(TaskMapper::toDto)
                .toList();
    }

    @Override
    public void delete(UUID id) {
        if (!taskRepo.existsById(id)){
            throw new RuntimeException("Task not found");
        }
        taskRepo.deleteById(id);
    }

    @Override
    public TaskResponseDTO update(UUID id, TaskRequestDTO dto) {
        Tasks task = taskRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        task.setTaskName(dto.getTaskName());
        task.setDescription(dto.getDescription());
        task.setStatus(dto.getStatus());

        Tasks update = taskRepo.save(task);

        return TaskMapper.toDto(update);
    }
}
