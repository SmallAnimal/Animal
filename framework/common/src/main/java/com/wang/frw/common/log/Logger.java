package com.wang.frw.common.log;

/**
 * Created by chao.wang2 on 2017/12/4.
 */
public interface Logger {

    void debug(String format,Object... args);

    void debug(String msg,Throwable t);

    void info(String format,Object... args);

    void info(String msg,Throwable t);

    void info(LogMessage<?> msg,String collectType);

    void warn(String format,Object... args);

    void warn(String msg,Throwable t);

    void error(String format,Object... args);

    void error(String msg,Throwable t);



}
