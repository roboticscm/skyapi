package vn.com.sky.task.project;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;

import vn.com.sky.task.model.TskProject;

@Service
public interface TskProjectRepo extends ReactiveCrudRepository<TskProject, Long> {

}
