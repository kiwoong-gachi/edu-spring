package com.gachidata.di;

public class MessageRenderer {
	private MessageProvider messageProvider; // setter di
	
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
	
	public void render() {
		//MessageProvider mp = new HelloWorldMessageProvider();
		//MessageProvider mp = new HiWorldMessageProvider();
		//System.out.println(mp.getMessage());
		System.out.println(messageProvider.getMessage()); 
	}

	public static void main(String[] args) {
		MessageRenderer messageRenderer = new MessageRenderer();
		
		// setter 방식으로 provider를 변경
		messageRenderer.setMessageProvider(new HelloWorldMessageProvider());
		messageRenderer.render();
		
		messageRenderer.setMessageProvider(new HiWorldMessageProvider());
		messageRenderer.render();
		
	}

}
