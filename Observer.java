package com.pattern.observer;

import com.pattern.message.Message;

public interface Observer {
    public void updateObserver(Message message);
}