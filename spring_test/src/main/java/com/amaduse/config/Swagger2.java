package com.amaduse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class Swagger2 {

//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                // 自行修改为自己的包Controller路径
//                .apis(RequestHandlerSelectors.basePackage("com.amaduse.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }

    @Bean
    public Docket apiUser() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("user")
                .apiInfo(apiInfoUser())
                .select()
                // 自行修改为自己的包Controller路径
                .apis(RequestHandlerSelectors.basePackage("com.amaduse.controller"))
                .paths(PathSelectors.ant("/user/**"))
                .build();
    }
    @Bean
    public Docket apiPerson() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("person")
                .apiInfo(apiInfoPerson())
                .select()
                // 自行修改为自己的包Controller路径
                .apis(RequestHandlerSelectors.basePackage("com.amaduse.controller"))
                .paths(PathSelectors.ant("/person/**"))
                .build();
    }
    private ApiInfo apiInfoUser() {
        return new ApiInfoBuilder()
                .title("api文档")
                .description("restfun 风格接口")
                //服务条款网址
                //.termsOfServiceUrl("http://blog.csdn.net/forezp")
                .version("1.0")
                //.contact(new Contact("帅呆了", "url", "email"))
                .build();
    }

    private ApiInfo apiInfoPerson() {
        return new ApiInfoBuilder()
                .title("api文档")
                .description("restfun 风格接口")
                //服务条款网址
                //.termsOfServiceUrl("http://blog.csdn.net/forezp")
                .version("1.0")
                //.contact(new Contact("帅呆了", "url", "email"))
                .build();
    }
}
