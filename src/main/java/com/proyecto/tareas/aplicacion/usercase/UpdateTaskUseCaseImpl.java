package com.proyecto.tareas.aplicacion.usercase;

import com.proyecto.tareas.dominio.modelo.Task;
import com.proyecto.tareas.dominio.puertos.in.UpdateTaskUseCase;
import com.proyecto.tareas.dominio.puertos.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {
 private final TaskRepositoryPort taskRepositoryPort;


    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }


    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}
