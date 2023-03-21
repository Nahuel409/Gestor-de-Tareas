package com.proyecto.tareas.aplicacion.usercase;

import com.proyecto.tareas.dominio.modelo.Task;
import com.proyecto.tareas.dominio.puertos.in.CreateTaskUseCase;
import com.proyecto.tareas.dominio.puertos.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;


    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
