package com.pattern.observer.impl;

import com.pattern.message.Message;
import com.pattern.observer.Observer;

public class FirstMessageSubscriber implements Observer 
{
    public void updateObserver(Message message) {
        System.out.println("Messsage for first subsscriber :: " + message.getMessage());
    }
}