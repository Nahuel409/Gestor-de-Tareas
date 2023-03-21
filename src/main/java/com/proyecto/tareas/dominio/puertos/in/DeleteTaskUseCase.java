package com.proyecto.tareas.dominio.puertos.in;

import com.proyecto.tareas.dominio.modelo.Task;

import java.util.Optional;

public interface DeleteTaskUseCase {
    boolean deleteTask(Long id);
}
