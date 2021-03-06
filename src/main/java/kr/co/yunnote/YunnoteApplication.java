package kr.co.yunnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

// Swagger2 활성화
@EnableSwagger2
public class YunnoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunnoteApplication.class, args);
    }

}
