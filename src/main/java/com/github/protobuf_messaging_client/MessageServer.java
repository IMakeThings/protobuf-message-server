package com.github.protobuf_messaging_client;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import java.util.ArrayList;
import java.util.Map;

import com.github.support.Logger;
import com.proto.messageServiceGrpc.*;
import com.proto.messageServiceGrpc.messageServiceImplBase;

public class MessageServer extends messageServiceImplBase {
	
	private Map<String, io.grpc.stub.StreamObserver<com.proto.Message>> clients;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void sendMessage(com.proto.Message request,
	        io.grpc.stub.StreamObserver<com.proto.None> responseObserver) {
	      
		
	}
	
	/*
	 * receiveMessages
	 * 
	 * When this service is run from the client, it tells the server that this client would like to subscribe
	 * to receive every other client's messages
	 * 
	 * Request shall have any message and a sender ID for identification.
	 * 
	 * A new thread will then be started, waiting for a leave request
	 */
	@Override
	public void receiveMessages(com.proto.Message request,
	        io.grpc.stub.StreamObserver<com.proto.Message> responseObserver) {
	      clients.put(request.getSender(), responseObserver);
	      Logger.log(request.getMessage());
	      
	}
	
	public void disconnect(com.proto.Message request,
	        io.grpc.stub.StreamObserver<com.proto.Message> responseObserver) {
		
	}

}
