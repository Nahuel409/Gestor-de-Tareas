package com.proyecto.tareas.infraestructura.repositories;

import com.proyecto.tareas.dominio.modelo.Task;
import com.proyecto.tareas.dominio.puertos.out.TaskRepositoryPort;
import com.proyecto.tareas.infraestructura.entities.TaskEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaTaskRepositoryAdapter implements TaskRepositoryPort {

    private final JpaTaskRepository jpaTaskRepository;

    public JpaTaskRepositoryAdapter(JpaTaskRepository jpaTaskRepository) {
        this.jpaTaskRepository = jpaTaskRepository;
    }

    @Override
    public Task save(Task task) {
        TaskEntity taskEntity = TaskEntity.fromDomainModel(task);
        TaskEntity savedEntity = jpaTaskRepository.save(taskEntity);
        return savedEntity.toDomainModel();
    }

    @Override
    public Optional<Task> findById(Long id) {
        return jpaTaskRepository.findById(id).map(TaskEntity::toDomainModel);
    }

    @Override
    public List<Task> findAll() {
        return jpaTaskRepository.findAll().stream()
                .map(TaskEntity::toDomainModel)
                .collect(Collectors.toList());
    }


    @Override
    public Optional<Task> update(Task task) {
        if (jpaTaskRepository.existsById(task.getId())){  // existe la tarea
            TaskEntity taskEntity = TaskEntity.fromDomainModel(task);
            TaskEntity updateTaskEntity= jpaTaskRepository.save(taskEntity);
            return Optional.of(updateTaskEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaTaskRepository.existsById(id)){
            jpaTaskRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
