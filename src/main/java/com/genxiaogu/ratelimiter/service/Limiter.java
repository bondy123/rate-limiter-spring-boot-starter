package com.genxiaogu.ratelimiter.service;

/**
 * Created by wb-lz260260 on 2017/7/4.
 */
public interface Limiter {

    boolean execute();

    public boolean execute(String route , Integer limit) ;

    public boolean execute(String route , Integer limit , String obj) ;
}
