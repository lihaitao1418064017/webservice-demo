package com.example.webservice.demo.service.server;

public class SingleBean {
    private static SingleBean ourInstance = null;

    public static SingleBean getInstance() {
        if (ourInstance==null){
            synchronized (SingleBean.class){
                if (ourInstance==null){
                    ourInstance=new SingleBean();
                    return ourInstance;
                }
            }

        }

        return ourInstance;
    }

    private SingleBean() {
    }
}
