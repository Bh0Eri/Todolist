package senai.todolist.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;
import senai.todolist.dto.taskDTO.TaskRequestDTO;
import senai.todolist.dto.taskDTO.TaskResponseDTO;
import senai.todolist.entity.Tasks;
import senai.todolist.service.taskService.TaskService;
import senai.todolist.service.taskService.TaskServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("todo/")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;


    @PostMapping(value = "create")
    public TaskRequestDTO createTask(@RequestBody TaskRequestDTO task) {
        taskService.create(task);
        return task;
    }

    @GetMapping(value = "show")
    public Optional<Tasks> showTask(@RequestParam UUID id) {
        return taskService.showOne(id);
    }

    @GetMapping(value = "showAll")
    public List<TaskResponseDTO> showAllTasks() {
        return taskService.showAll();
    }

    @DeleteMapping(value = "delete")
    public void deleteTask(@RequestParam UUID id) {
        taskService.delete(id);
    }

    @PostMapping(value = "update")
    public TaskRequestDTO updateTask(@RequestBody UUID id, TaskRequestDTO task) {
        if (taskService.showOne(id).isPresent()) {
            taskService.update(id, task);
            return task;
        }
        return null;
    }

}
