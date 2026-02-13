package senai.todolist.Mapper;

import senai.todolist.dto.taskDTO.TaskRequestDTO;
import senai.todolist.dto.taskDTO.TaskResponseDTO;
import senai.todolist.entity.Tasks;

public class TaskMapper {

    public static Tasks toEntity(TaskRequestDTO dto){

        return Tasks.builder()
                .taskName(dto.getTaskName())
                .description(dto.getDescription())
                .status(dto.getStatus())
                .build();
    }

    public static TaskResponseDTO toDto(Tasks tasks){

        return TaskResponseDTO.builder()
                .id(tasks.getId())
                .taskName(tasks.getTaskName())
                .description(tasks.getDescription())
                .status(tasks.getStatus())
                .build();
    }
}
