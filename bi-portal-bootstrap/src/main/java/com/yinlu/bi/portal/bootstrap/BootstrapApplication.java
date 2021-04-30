package com.yinlu.bi.portal.bootstrap;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import org.apache.coyote.Request;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
    "com.yinlu.bi.portal.*"
})
public class BootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapApplication.class, args);
    }

}
