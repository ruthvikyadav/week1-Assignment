package com.pattern.client;

import com.pattern.message.Message;

import com.pattern.observer.impl.FirstSubscriber;
import com.pattern.observer.impl.SecondSubscriber;
import com.pattern.observer.impl.ThirdSubscriber;
import com.pattern.subject.impl.MessagePublisher;


public class ObserverTest {

	public static void main(String[] args) {
		
		FirstSubscriber firstSubscriber = new FirstSubscriber();
		SecondSubscriber secondSubscriber = new SecondSubscriber();
		ThirdSubscriber thirdSubscriber = new ThirdSubscriber();

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
