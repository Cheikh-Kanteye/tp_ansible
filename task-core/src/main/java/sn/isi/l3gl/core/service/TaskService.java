package sn.isi.l3gl.core.service;

import org.springframework.stereotype.Service;
import sn.isi.l3gl.core.entity.Task;
import sn.isi.l3gl.core.enums.TaskStatus;
import sn.isi.l3gl.core.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        task.setStatus(TaskStatus.TODO);
        return taskRepository.save(task);
    }
}
