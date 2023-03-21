package com.proyecto.tareas.dominio.puertos.out;

import com.proyecto.tareas.dominio.modelo.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
