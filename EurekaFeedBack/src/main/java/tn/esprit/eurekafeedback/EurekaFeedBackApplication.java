package tn.esprit.eurekafeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaFeedBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeedBackApplication.class, args);
    }

}
