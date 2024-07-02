package com.syed.service;

import com.syed.model.Task;
import com.syed.model.TaskStatus;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TaskService {

    Task createTask(Task task, String requesterRole) throws Exception;

    Task getTaskById(Long id) throws Exception;

    List<Task> getAllTask(TaskStatus status);

    Task updateTask(Long id, Task updatedTask, Long userId) throws Exception;

    void deleteTask(Long id) throws Exception;

    Task assignedToUser(Long userId, Long taskId) throws Exception;

    List<Task> assignedUsersTask(Long userId, TaskStatus status);

    Task completedTask(Long taskId) throws Exception;

}
