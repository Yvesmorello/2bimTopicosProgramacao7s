package com.example.atividadeTaskJWT.repository;

import com.example.atividadeTaskJWT.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
