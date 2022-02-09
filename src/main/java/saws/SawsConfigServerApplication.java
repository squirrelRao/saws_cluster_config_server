package saws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SawsConfigServerApplication {

    public static void main(String[] args){

        SpringApplication.run(SawsConfigServerApplication.class,args);
    }
}
