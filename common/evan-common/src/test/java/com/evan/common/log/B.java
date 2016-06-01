package com.evan.common.log;

import com.evan.common.log.base.Parent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class B extends Parent{
    public static void main(String[] args) {
        getLog().info("helleo");
       // print();
    }
private static Logger log =getLog();
    public static void print(){
        getLog().error("go");
        getLog().error("go");
        Exception ex = new RuntimeException("dfdf");
        getLog().error("fdf{}12{}3",ex);
    }
}