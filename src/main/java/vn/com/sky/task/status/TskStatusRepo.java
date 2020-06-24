package vn.com.sky.task.status;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;

import vn.com.sky.task.model.TskStatus;

@Service
public interface TskStatusRepo extends ReactiveCrudRepository<TskStatus, Long> {

}
