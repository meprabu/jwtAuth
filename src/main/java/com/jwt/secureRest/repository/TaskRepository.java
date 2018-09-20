package com.jwt.secureRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.secureRest.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
