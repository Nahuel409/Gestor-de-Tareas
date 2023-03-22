package com.proyecto.tareas.infraestructura.config;


import com.proyecto.tareas.aplicacion.service.TaskService;
import com.proyecto.tareas.aplicacion.usercase.*;
import com.proyecto.tareas.dominio.puertos.in.GetAdditionalTaskInfoUseCase;
import com.proyecto.tareas.dominio.puertos.out.ExternalServicePort;
import com.proyecto.tareas.dominio.puertos.out.TaskRepositoryPort;
import com.proyecto.tareas.infraestructura.adapters.ExternalServiceAdapter;
import com.proyecto.tareas.infraestructura.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {


    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase){
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return new ExternalServiceAdapter();
    }
}
