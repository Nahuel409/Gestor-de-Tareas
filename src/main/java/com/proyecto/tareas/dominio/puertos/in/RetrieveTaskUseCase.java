package com.proyecto.tareas.dominio.puertos.in;

import com.proyecto.tareas.dominio.modelo.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {

    Optional<Task> getTaskById(Long id);
    List<Task> getAllTasks();
}
