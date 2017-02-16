package ufcg.edu.br.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ufcg.edu.br.domain.ListTask;
import ufcg.edu.br.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long>{
	 List<Task> findAll();
}
