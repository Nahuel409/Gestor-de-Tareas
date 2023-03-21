package com.proyecto.tareas.aplicacion.usercase;


import com.proyecto.tareas.dominio.modelo.Task;
import com.proyecto.tareas.dominio.puertos.in.RetrieveTaskUseCase;
import com.proyecto.tareas.dominio.puertos.out.TaskRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase {
    private final TaskRepositoryPort tasktRepositoryPort;


    public RetrieveTaskUseCaseImpl(TaskRepositoryPort tasktRepositoryPort) {
        this.tasktRepositoryPort = tasktRepositoryPort;
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return tasktRepositoryPort.findkById(id);
    }

    @Override
    public List<Task> getAllTask() {
        return tasktRepositoryPort.findAll();
    }
}
