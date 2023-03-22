package com.proyecto.tareas.infraestructura.controllers;

import com.proyecto.tareas.aplicacion.service.TaskService;
import com.proyecto.tareas.dominio.modelo.AdditionalTaskInfo;
import com.proyecto.tareas.dominio.modelo.Task;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {
    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping
    public ResponseEntity<Task> crearTask(@RequestBody Task task){
    Task nuevaTask = taskService.createTask(task);
    return new ResponseEntity<>(nuevaTask, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id){
        return taskService.getTaskById(id)
                .map(task-> new ResponseEntity<>(task,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Task>>getTareas(){
        List<Task>tasks = taskService.getAllTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task>editTask(@PathVariable Long id, @RequestBody Task task){
    return taskService.updateTask(id, task)
            .map(edit-> new ResponseEntity<>(edit,HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        if(taskService.deleteTask(id)){
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/additional-info/{taskId}")
    public ResponseEntity<AdditionalTaskInfo> getAdditionalTaskInfo(@PathVariable Long taskId) {
        AdditionalTaskInfo additionalTaskInfo = taskService.getAdditionalTaskInfo(taskId);
        return new ResponseEntity<>(additionalTaskInfo, HttpStatus.OK);
    }

}
