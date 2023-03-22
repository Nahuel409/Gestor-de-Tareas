package com.proyecto.tareas.dominio.puertos.in;

import com.proyecto.tareas.dominio.modelo.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {

    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
