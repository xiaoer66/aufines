package com.web.zuul;

import com.web.zuul.zuulfilter.CustomZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
        System.out.println("启动了zuul");
    }

    @Bean
    public CustomZuulFilter getFilter() {
        return new CustomZuulFilter();
    }

}
