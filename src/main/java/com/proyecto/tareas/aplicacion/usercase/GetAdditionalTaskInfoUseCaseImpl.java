package com.proyecto.tareas.aplicacion.usercase;


import com.proyecto.tareas.dominio.modelo.AdditionalTaskInfo;
import com.proyecto.tareas.dominio.puertos.in.GetAdditionalTaskInfoUseCase;
import com.proyecto.tareas.dominio.puertos.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;


    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }


    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
