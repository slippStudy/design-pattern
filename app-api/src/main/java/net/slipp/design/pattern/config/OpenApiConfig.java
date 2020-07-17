package net.slipp.design.pattern.config;

import com.google.common.collect.Sets;
import java.util.Collections;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Slf4j
@Configuration
public class OpenApiConfig {

  @Bean
  public Docket swaggerDocket() {
    var docket =
        new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("net.slipp.design.pattern"))
            .build();

    docket.produces(Sets.newHashSet(MediaType.APPLICATION_JSON_VALUE));
    docket.useDefaultResponseMessages(false);
    docket.apiInfo(apiInfo());

    return docket;
  }

  private ApiInfo apiInfo() {
    var contact = new Contact("이태훈", "https://whois.tailer.dev", null);
    return new ApiInfo(
        "디자인패턴 학습용 연습사이트",
        "",
        "1.0",
        "",
        contact,
        "",
        "",
        Collections.emptySet());
  }
}
