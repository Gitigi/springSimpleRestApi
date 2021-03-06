package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application{
    public static void main(String[] args){
        System.setProperty("spring.devtools.restart.enabled", "true");
        System.setProperty("spring.devtools.livereload.enabled", "true");
        System.setProperty("spring.devtools.restart.additional-paths", "src/main/java/hello");
        SpringApplication.run(Application.class,args);
    }
}