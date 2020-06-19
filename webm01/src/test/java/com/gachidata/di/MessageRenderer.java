package com.gachidata.di;

public class MessageRenderer {
	public void render() {
		//MessageProvider mp = new HelloWorldMessageProvider();
		MessageProvider mp = new HiWorldMessageProvider();
		System.out.println(mp.getMessage());
	}

	public static void main(String[] args) {
		MessageRenderer messageRenderer = new MessageRenderer();
		messageRenderer.render();
	}

}
