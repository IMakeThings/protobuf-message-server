package com.github.server;

import java.io.IOException;

import com.github.services.messagingService.MessageService;
import com.github.support.Logger;

import io.grpc.ServerBuilder;



public class Server {

	private final io.grpc.Server server;
	private final int port;
	
	public Server(int port) {
		this.port = port;
		this.server = ServerBuilder.forPort(port).addService(new MessageService()).build();
	}
	
	public void start() throws IOException {
	    server.start();
	    Logger.log("Server start, listening on port " + port);
	    Runtime.getRuntime().addShutdownHook(new Thread() {
	      @Override
	      public void run() {
	        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
	        System.err.println("*** shutting down gRPC server since JVM is shutting down");
	        Server.this.stop();
	        System.err.println("*** server shut down");
	      }
	    });
	}
	
	public void stop() {
	    if (server != null) {
	      server.shutdown();
	    }
	}
	
	 private void blockUntilShutdown() throws InterruptedException {
	    if (server != null) {
	      server.awaitTermination();
	    }
	 }
	 
	 public static void main(String[] args) throws Exception {
	    Server server = new Server(12345);
	    server.start();
	    server.blockUntilShutdown();
	  }

}
