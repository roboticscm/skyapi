package vn.com.sky.sys.humanororg;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springdoc.core.annotations.RouterOperation;
import org.springdoc.core.annotations.RouterOperations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;
import vn.com.sky.base.GenericREST;
import vn.com.sky.util.MyServerResponse;

@Configuration
@AllArgsConstructor
public class HumanOrOrgTestREST extends GenericREST {
    private CustomHumanOrOrgTestRepo customRepo;
    
    @Bean
    @RouterOperations({ @RouterOperation(path = "/api/sys/human-or-org/find-human-or-org", beanClass = CustomHumanOrOrgTestRepo.class, beanMethod = "findHumanOrOrg")})
    public RouterFunction<?> humanOrOrgTestRoutes() {
        return route(GET(buildURL("human-or-org", this::findHumanOrOrg)), this::findHumanOrOrg);
    }
    
    private Mono<ServerResponse> findHumanOrOrg(ServerRequest request) {
        // SYSTEM BLOCK CODE
        // PLEASE DO NOT EDIT
        if (request == null) {
            String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
            return Mono.just(new MyServerResponse(methodName));
        }
        // END SYSTEM BLOCK CODE
        Long page = 1L, pageSize = 20L;
        try {
            page = getLongParam(request, "page");
            pageSize = getLongParam(request, "pageSize");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return  customRepo.findHumanOrOrg(page, pageSize).flatMap(val -> ok(val, String.class));
    }
}
