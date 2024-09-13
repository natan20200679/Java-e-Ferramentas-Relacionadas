package dio.phonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication

/* Habilita o Feign na aplicação */ 
@EnableFeignClients
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

}
