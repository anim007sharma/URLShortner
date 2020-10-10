package com.anim007sharma.urlshortner.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration{

	private ApiInfo metadata(){
        return new ApiInfoBuilder()
                .title("URL shortener API")
                .description("API reference for use")
                .version("1.0")
                .build();
    }
	
	@Bean
    public Docket urlShortnerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(metadata())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.anim007sharma.urlshortner.controller"))
                .build();
    }
}
