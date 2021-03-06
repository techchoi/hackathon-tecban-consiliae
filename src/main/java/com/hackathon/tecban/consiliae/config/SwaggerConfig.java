package com.hackathon.tecban.consiliae.config;


import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.collect.Lists;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.select()
                .apis(RequestHandlerSelectors.basePackage("com.hackathon.tecban.consiliae.controller"))
                .build()
                .apiInfo(apiInfo())
                .enableUrlTemplating(false);
    }


    

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Hackathon Tecban Consiliae")
                .description("API de consiliação de transações")
                .version("1.0")
                .build();
    }
}