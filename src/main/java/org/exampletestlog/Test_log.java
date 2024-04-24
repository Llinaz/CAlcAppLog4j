package org.exampletestlog;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Test_log {
    private static final Logger log = LogManager.getLogger(Test_log.class);
    public static void main(String[] args) {
        log.info("Это информационное сообщение!");
        log.error("это сообщение ошибки");
    }
}
