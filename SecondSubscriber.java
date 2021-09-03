package com.pattern.observer.impl;

import com.pattern.message.Message;
import com.pattern.observer.Observer;

public class SecondSubscriber implements Observer 
{
    @Override
    public void updateObserver(Message message) {
        System.out.println("message for Second subscriber :: " + message.getMessage());
    }
}
