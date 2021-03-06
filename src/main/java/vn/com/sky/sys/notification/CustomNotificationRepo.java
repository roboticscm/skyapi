package vn.com.sky.sys.notification;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import vn.com.sky.base.BaseR2dbcRepository;

@Service
public class CustomNotificationRepo extends BaseR2dbcRepository {

    /*
	-- Module: System (sys)
	-- Section: Notification
	-- Function Description: Find notifications list by user id and filter
	-- Params:
	--  userId
	--  textSearch
	*/
    public Mono<String> findNotifications(Long userId, String type, String textSearch) {
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();

        var ret =
            this.databaseClient()
                .execute(genSql(methodName, "userId", "type", "textSearch"))
                .bind("userId", userId);

        if (type == null)
        	ret = ret.bindNull("type", String.class);
        else 
        	ret = ret.bind("type", type);
        
        if (textSearch == null)
        	ret = ret.bindNull("textSearch", String.class);
        else 
        	ret = ret.bind("textSearch", textSearch);

        return ret.as(String.class).fetch().first();
    }
}
