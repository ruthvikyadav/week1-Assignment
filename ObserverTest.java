package com.pattern.client;

import com.pattern.message.Message;
import com.pattern.observer.impl.FirstMessageSubscriber;
import com.pattern.observer.impl.SecondMessageSubscriber;
import com.pattern.observer.impl.ThirdMessageSubscriber;
import com.pattern.subject.impl.MessagePublisher;


public class ObserverTest {

	public static void main(String[] args) {
		
		FirstMessageSubscriber firstMessageSubscriber = new FirstMessageSubscriber();
		SecondMessageSubscriber secondMessageSubscriber = new SecondMessageSubscriber();
		ThirdMessageSubscriber thirdMessageSubscriber = new ThirdMessageSubscriber();

		MessagePublisher messagePublisher = new MessagePublisher();

		messagePublisher.register(firstMessageSubscriber);
		messagePublisher.register(secondMessageSubscriber);

		messagePublisher.notifyUpdate(new Message("This is primary notification"));
		System.out.println("-------------------xxxxxx--------------------------------------------");

		messagePublisher.unregister(firstMessageSubscriber);
	
		messagePublisher.register(thirdMessageSubscriber);

		messagePublisher.notifyUpdate(new Message("This is Secondary notification"));
	}
}