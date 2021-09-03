package com.pattern.observer.impl;

import com.pattern.message.Message;
import com.pattern.observer.Observer;

public class SecondMessageSubscriber implements Observer 
{
    @Override
    public void updateObserver(Message message) {
        System.out.println("Messsage for Second subsscriber :: " + message.getMessage());
    }
}