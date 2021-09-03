package com.pattern.subject.impl;

import java.util.HashSet;
import java.util.Set;

import com.pattern.message.Message;
import com.pattern.observer.Observer;
import com.pattern.subject.Subject;
public class MessagePublisher implements Subject {
    
    private Set<Observer> observers = new HashSet<>();
 
    public void register(Observer observer) {
        observers.add(observer);
    }
    public void unregister(Observer observer) {
        observers.remove(observer);
    }
    public void notifyUpdate(Message message) {
        for(Observer observer: observers) {
            observer.updateObserver(message);
        }
    }
}