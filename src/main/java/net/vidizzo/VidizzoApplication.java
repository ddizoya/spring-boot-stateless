package net.vidizzo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
 import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class VidizzoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VidizzoApplication.class, args);
    }

}
