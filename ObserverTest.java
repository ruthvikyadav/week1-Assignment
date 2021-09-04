package com.pattern.client;

import com.pattern.message.Message;
import com.pattern.observer.impl.FirstSubscriber;
import com.pattern.observer.impl.SecondSubscriber;
import com.pattern.observer.impl.ThirdSubscriber;
import com.pattern.subject.impl.MessagePublisher;


public class ObserverTest {

	public static void main(String[] args) {
		
		FirstMessageSubscriber firstSubscriber = new FirstMessageSubscriber();
		SecondMessageSubscriber secondSubscriber = new SecondMessageSubscriber();
		ThirdMessageSubscriber thirdSubscriber = new ThirdMessageSubscriber();

		MessagePublisher messagePublisher = new MessagePublisher();

		messagePublisher.register(firstSubscriber);
		messagePublisher.register(secondSubscriber);

		messagePublisher.notifyUpdate(new Message("This   primary notifications"));
		System.out.println("------------------- --------------------------------------------");

		messagePublisher.unregister(firstSubscriber);
	
		messagePublisher.register(thirdSubscriber);

		messagePublisher.notifyUpdate(new Message("This  Second  notification"));
	}
}
