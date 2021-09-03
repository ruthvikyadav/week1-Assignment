package com.pattern.observer.impl;

import com.pattern.message.Message;
import com.pattern.observer.Observer;

public class ThirdMessageSubscriber implements Observer 
{
    @Override
    public void updateObserver(Message message) {
        System.out.println("Messsage for Third subsscriber :: " + message.getMessage());
    }
}