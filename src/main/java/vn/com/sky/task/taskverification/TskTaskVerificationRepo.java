package vn.com.sky.task.taskverification;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;

import vn.com.sky.task.model.TskTaskVerification;

@Service
public interface TskTaskVerificationRepo extends ReactiveCrudRepository<TskTaskVerification, Long> {

}
