package com.proyecto.tareas.dominio.puertos.out;

import com.proyecto.tareas.dominio.modelo.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    Task save(Task task);
    Optional<Task> findkById(Long id);
    List<Task> findAll();

    Optional<Task> update(Task task);
    boolean deleteById(Long id);
}

