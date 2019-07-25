package com.drama.consumer;

import com.drama.services.Service;

public class XMLApp {
    private Service service;
    public void setService(Service service) {
        this.service = service;
    }
    public boolean process(String msg, String rec) {
        return this.service.send(msg, rec);
    }
}
