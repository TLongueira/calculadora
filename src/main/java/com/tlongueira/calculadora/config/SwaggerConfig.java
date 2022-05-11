package com.tlongueira.calculadora.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tlongueira.calculadora.controller.CalculadoraController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackageClasses = CalculadoraController.class)
public class SwaggerConfig {
private final static String BASE_PACKAGE="com.tlongueira.calculadora";

@Bean
public Docket api() {
	return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
			.paths(PathSelectors.any())
			.build().apiInfo(getApiInfo());
}
	private ApiInfo getApiInfo() {
		return new ApiInfoBuilder()
				.title("Calculadora API")
				.description("API REST para realizar calculos matematicos")
				.termsOfServiceUrl("httt://www.google.com")
				.contact(new Contact("Tiago Longueira","http://tlongueira.com","tiagolongueira@gmail.com"))
				.license("Apache License Version 2.0").licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html") //
				.version("2.0") //
				.build();
	}

}
