package com.pet.spring.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class for application running
 *
 * @author Oleksandr Ivanov
 */
public class AppRun {

    private static Logger LOG = LoggerFactory.getLogger(AppRun.class);

    public static void main(String[] args) {
        new Thread(
                () -> {
                    LOG.info("Hello from lambdas and Log4j2");
                }
        ).start();


    }
}
