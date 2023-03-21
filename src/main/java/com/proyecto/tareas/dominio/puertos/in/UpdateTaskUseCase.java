package com.proyecto.tareas.dominio.puertos.in;

import com.proyecto.tareas.dominio.modelo.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {

    Optional<Task> updateTask(Long id, Task updateTask);

}
