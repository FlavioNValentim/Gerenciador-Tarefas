package com.example.tarefas.repository;

import com.example.tarefas.model.Prioridade;
import com.example.tarefas.model.Status;
import com.example.tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>
{
    List<Tarefa> findByStatus(Status status);
    List<Tarefa>findByPrioridade(Prioridade prioridade);
    List<Tarefa>findByStatusAndPrioridade(Status status, Prioridade prioridade);
}

