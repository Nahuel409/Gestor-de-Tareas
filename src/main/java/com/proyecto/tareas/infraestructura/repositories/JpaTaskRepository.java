package com.proyecto.tareas.infraestructura.repositories;

import com.proyecto.tareas.infraestructura.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {

}
