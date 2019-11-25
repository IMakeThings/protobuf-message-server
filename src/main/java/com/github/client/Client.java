package com.github.client;

public class Client {
	private io.grpc.stub.StreamObserver<com.proto.Message> responseObserver;
	private String userName;
	
	public Client(io.grpc.stub.StreamObserver<com.proto.Message> responseObserver, String userName) {
		this.responseObserver = responseObserver;
		this.userName = userName;
	}
	
	public void disconnect() {
		responseObserver.onCompleted();
	}
	
	public void receiveMessage(com.proto.Message message) {
		responseObserver.onNext(message);
	}
	
	public String getUserName() {
		return userName;
	}
	
}
