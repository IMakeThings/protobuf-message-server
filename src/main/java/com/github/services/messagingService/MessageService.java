package com.github.services.messagingService;

import java.util.ArrayList;
import com.github.client.Client;
import com.github.support.Logger;
import com.proto.Message;
import com.proto.None;
import com.proto.messageServiceGrpc.messageServiceImplBase;

public class MessageService extends messageServiceImplBase {
	
	private ArrayList<Client> clients;
	
	public MessageService() {
		clients = new ArrayList<Client>();
	}
	
	@Override
	public void sendMessage(com.proto.Message request,
	        io.grpc.stub.StreamObserver<com.proto.None> responseObserver) {
	      for(Client c: clients) {
	    	  if(!(c.getUserName().equals(request.getSender()))) {
	    		  c.receiveMessage(request);
	    	  }
	      }
	      
	      Logger.log(String.format("Message from %s received", request.getSender()));
	      
	      responseObserver.onNext(None.getDefaultInstance());
	      responseObserver.onCompleted();
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
		Message joinMessage = Message.newBuilder()
				.setSender(request.getSender())
				.setMessage("has joined the chat!")
				.build();
		for(Client c: clients) {
			c.receiveMessage(joinMessage);
		}
	    clients.add(new Client(responseObserver, request.getSender()));
	      
	      
	    Logger.log(String.format("Client %s subscribed", request.getSender()));
	}
	
	public void disconnect(com.proto.Message request,
	        io.grpc.stub.StreamObserver<com.proto.Message> responseObserver) {
		for(Client c: clients) {
			if(c.getUserName().equals(request.getSender())) {
				c.disconnect();
				clients.remove(c);
			}
		}
		
		Logger.log(String.format("Client %s disconnected", request.getSender()));
		
		responseObserver.onNext(Message.getDefaultInstance());
		responseObserver.onCompleted();
	}

}
