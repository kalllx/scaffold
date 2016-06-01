package com.evan.common.log.base;

import org.apache.logging.log4j.Level;
import org.apache.logging.slf4j.Log4jLogger;
import org.omg.CORBA.Object;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by caizx on 2016/5/25.
 */
public class Parent {
    protected static final Logger log = LoggerFactory.getLogger(Object.class);

    protected static Logger getLog(){
        StackTraceElement[] ss = new Exception().getStackTrace();
        for(StackTraceElement e:ss){
            System.out.println(e.getClassName());
        }
        System.out.println("=========================");
        return LoggerFactory.getLogger(new Exception().getStackTrace()[2].getClassName());
    }
   /* public static final String FQCN = Log4jLogger.class.getName();
    public void info(String msg) {
        log.logMessage(FQCN, Level.INFO, (org.apache.logging.log4j.Marker)null, format);
    }*/
}
