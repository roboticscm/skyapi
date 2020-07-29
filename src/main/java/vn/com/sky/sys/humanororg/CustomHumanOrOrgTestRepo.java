package vn.com.sky.sys.humanororg;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;
import vn.com.sky.base.BaseR2dbcRepository;

@Service
public class CustomHumanOrOrgTestRepo extends BaseR2dbcRepository{
    public Mono<String> findHumanOrOrg(Long page, Long pageSize) {
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();

        var ret = this.databaseClient()
                .execute(genSql(methodName, "page", "pageSize"))
                .bind("page", page)
                .bind("pageSize", pageSize);

        return ret.as(String.class)
                .fetch()
                .first();
    }
}
