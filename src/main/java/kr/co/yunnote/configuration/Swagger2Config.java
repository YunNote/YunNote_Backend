package kr.co.yunnote.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Config {


    //  Docket - Swagger 설정의 핵심 Bean
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                // swagger에서 제공해주는 응답 코드에 대한 기본 메세지 제거 .
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .select()

                // api 스펙이 작성되는 패키지를 지정
                .apis(RequestHandlerSelectors.basePackage("kr.co.yunnote.interfaces"))
                .paths(PathSelectors.ant("/api/v1/**"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("제목 작성")
                .version("버전 작성")
                .description("설명 작성")
                .license("라이센스 작성")
                .licenseUrl("라이센스 URL 작성")
                .build();
    }


}
