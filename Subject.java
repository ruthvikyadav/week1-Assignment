package com.pattern.subject;
import com.pattern.message.Message;
import com.pattern.observer.Observer;
public interface Subject {
	
	public void register(Observer observer);
	public void unregister(Observer observer);
	public void notifyUpdate(Message message);
}