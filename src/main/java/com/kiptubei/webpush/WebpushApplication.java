package com.kiptubei.webpush;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WebpushApplication {

    public final static Logger logger = LoggerFactory.getLogger(WebpushApplication.class);
    
	public static void main(String[] args) {
		SpringApplication.run(WebpushApplication.class, args);
	}

}
