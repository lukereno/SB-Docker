package io.luke;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        log.info("servicecall");
        return "Hello Docker World";
    }

    public static void main(String[] args) {
        log.info("starting");
        SpringApplication.run(Application.class, args);
    }

}