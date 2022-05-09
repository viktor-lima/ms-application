package com.vkl.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vkl.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
