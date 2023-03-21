package com.proyecto.tareas.aplicacion.usercase;

import com.proyecto.tareas.dominio.puertos.in.DeleteTaskUseCase;
import com.proyecto.tareas.dominio.puertos.out.TaskRepositoryPort;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {
private final TaskRepositoryPort taskRepositoryPort;


    public DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
