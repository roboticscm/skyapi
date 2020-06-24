package vn.com.sky.sys.notification;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;

import vn.com.sky.sys.model.PartNotification;

@Service
public interface NotificationRepo extends ReactiveCrudRepository<PartNotification, Long> {
	
}
