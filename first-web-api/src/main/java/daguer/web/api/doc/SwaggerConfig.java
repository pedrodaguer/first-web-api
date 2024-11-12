package daguer.web.api.doc;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private Contact contato() {
        return new Contact(
                "Daguer",
                "pedrodaguer.com.br",
                "pepedavila1308@gmail.com");
    }

    private ApiInfoBuilder apiInfo() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("First Web API");
        apiInfoBuilder.description("API RESTful with Spring Boot");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Terms of service");
        apiInfoBuilder.contact(this.contato());
        return apiInfoBuilder;
    }

    @Bean
    public Docket detalheApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("daguer.web.api.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.apiInfo().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;

    }

}
