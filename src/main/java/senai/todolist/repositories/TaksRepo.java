package senai.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senai.todolist.entity.Tasks;

import java.util.UUID;

@Repository
public interface TaksRepo extends JpaRepository<Tasks, UUID> {

    Tasks findTasksByTaskName(String taskName);

}
