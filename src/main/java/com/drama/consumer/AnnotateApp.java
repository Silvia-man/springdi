package com.drama.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.drama.services.Service;

@Component
public class AnnotateApp {
    private Service service;
    @Autowired
    public AnnotateApp(Service service) {
        this.service = service;
    }

    public boolean process(String msg, String rec) {
        return this.service.send(msg, rec);
    }
}
