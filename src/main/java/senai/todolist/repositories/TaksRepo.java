package senai.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senai.todolist.entity.Tasks;

@Repository
public interface TaksRepo extends JpaRepository<Tasks, Long> {

    Tasks findTasksByTaskName(String taskName);

}
