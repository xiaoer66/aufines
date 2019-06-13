package com.aufine.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()  // 选择那些路径和api会生成document
                .apis(RequestHandlerSelectors.any()) // 对所有api进行监控
                //.apis(RequestHandlerSelectors.basePackage("xxx.xxx.xxx"))//api接口包扫描路径
                .paths(PathSelectors.any()) // 对所有路径进行监控
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 设置页面标题
                .title("标题")
                // 设置联系人
                .contact(
                        new Contact("昵称", "网址链接", "邮箱"))
                // 描述
                .description("描述信息")
                // 定义版本号
                .version("版本号").build();
    }
}
