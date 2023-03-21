package com.proyecto.tareas.dominio.puertos.in;

import com.proyecto.tareas.dominio.modelo.Task;

public interface CreateTaskUseCase {

    Task createTask(Task task);

}
