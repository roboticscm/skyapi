package vn.com.sky.task.taskqualification;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;

import vn.com.sky.task.model.TskTaskQualification;

@Service
public interface TskTaskQualificationRepo extends ReactiveCrudRepository<TskTaskQualification, Long> {

}
