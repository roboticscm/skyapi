//package vn.com.sky;
//
//import java.io.IOException;
//
//import io.grpc.Server;
//import io.grpc.ServerBuilder;
//
//public class GrpcServer {
//    private static final int PORT = 50051;
//    private Server server;
//
//    public void start() throws IOException {
//        server = ServerBuilder.forPort(PORT)
//                .addService(new HelloWorldServiceImpl())
//                .build()
//                .start();
//    }
//
//    public void blockUntilShutdown() throws InterruptedException {
//        if (server == null) {
//            return;
//        }
//
//        server.awaitTermination();
//    }
//
//    public static void main(String[] args) 
//            throws InterruptedException, IOException {
//        GrpcServer server = new GrpcServer();
//        server.start();
//        server.blockUntilShutdown();
//    }
//}
//
//
//
