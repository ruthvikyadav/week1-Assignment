package com.pattern.client;

import com.pattern.message.Message;

import com.pattern.observer.impl.FirstMessageSubscriber;
import com.pattern.observer.impl.SecondMessageSubscriber;
import com.pattern.observer.impl.ThirdMessageSubscriber;
import com.pattern.subject.impl.MessagePublisher;


public class ObserverTest {

	public static void main(String[] args) {
		
		FirstMessageSubscriber firstSubscriber = new FirstMessageSubscriber();
		SecondMessageSubscriber secondSubscriber = new SecondMessageSubscriber();
		ThirdMessageSubscriber thirdSubscriber = new ThirdMessageSubscriber();

		MessagePublisher messagePublisher = new MessagePublisher();

		messagePublisher.register(firstSubscriber);
		messagePublisher.register(secondSubscriber);

		messagePublisher.notifyUpdate(new Message("This is primary notification"));
		System.out.println("-------------------xxxxxx--------------------------------------------");

		messagePublisher.unregister(firstSubscriber);
	
		messagePublisher.register(thirdSubscriber);

		messagePublisher.notifyUpdate(new Message("This is Secondary notification"));
	}
}