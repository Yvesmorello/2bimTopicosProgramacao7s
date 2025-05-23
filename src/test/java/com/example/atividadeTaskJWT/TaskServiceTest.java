package com.example.atividadeTaskJWT;

import com.example.atividadeTaskJWT.model.Task;
import com.example.atividadeTaskJWT.enums.StatusEnum;
import com.example.atividadeTaskJWT.service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskServiceTest {

    @Autowired
    private TaskService taskService;

    @Test
    void testCreateAndFindAll() {
        Task newTask = new Task();
        newTask.setTitulo("Teste");
        newTask.setDescricao("Descrição de Teste");
        newTask.setStatus(StatusEnum.PENDENTE);

        Task savedTask = taskService.create(newTask);

        assertNotNull(savedTask.getId());
        assertEquals("Teste", savedTask.getTitulo());

        List<Task> tasks = taskService.findAll();
        assertFalse(tasks.isEmpty());
    }

    @Test
    void testUpdate() {
        Task task = new Task();
        task.setTitulo("Tarefa");
        task.setDescricao("Atualização");
        task.setStatus(StatusEnum.PENDENTE);

        Task saved = taskService.create(task);
        saved.setStatus(StatusEnum.CONCLUIDA);

        Task updated = taskService.update(saved.getId(), saved);
        assertEquals(StatusEnum.CONCLUIDA, updated.getStatus());
    }

    @Test
    void testDelete() {
        Task task = new Task();
        task.setTitulo("Apagar");
        task.setDescricao("Para deletar");
        task.setStatus(StatusEnum.PENDENTE);

        Task saved = taskService.create(task);
        Long id = saved.getId();

        taskService.delete(id);
        List<Task> tasks = taskService.findAll();
        assertTrue(tasks.stream().noneMatch(t -> t.getId().equals(id)));
    }
}