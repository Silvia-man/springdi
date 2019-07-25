package com.drama.services;

public class EmailService implements Service {
    @Override
    public boolean send(String msg, String rec){
        System.out.println("Email Sent to " + rec + " with Message = " + msg);
        return true;
    }
}

