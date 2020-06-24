package vn.com.sky.task.priority;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;

import vn.com.sky.task.model.TskPriority;

@Service
public interface TskPriorityRepo extends ReactiveCrudRepository<TskPriority, Long> {

}
