package vn.com.sky;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import vn.com.sky.HelloReply.Builder;
import vn.com.sky.sys.role.RoleRepo;

@Service
@GrpcService
public class GrpcServerService extends SimpleGrpc.SimpleImplBase {
    @Autowired
    private RoleRepo roleRepo;
    
    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
       
        
        var test = roleRepo.findAll().toStream();
        Builder reply =  HelloReply.newBuilder();
        test.collect(Collectors.toList()).forEach(item -> {
            reply.addItems(RoleItem.newBuilder().setOwnerOrgId(item.getOwnerOrgId()).setName(item.getName()).setCode(item.getCode()));
            
        });
        System.out.println(reply);
        responseObserver.onNext(reply.build());
        responseObserver.onCompleted();
    }

}