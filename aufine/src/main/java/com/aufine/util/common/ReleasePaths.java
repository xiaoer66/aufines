package com.aufine.util.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 如果想把配置文件的信息，读取并自动封装成实体类，
 * 可以使用@ConfigurationProperties，
 * 它可以把同类的配置信息自动封装成实体类
 */
@Component
@PropertySource(value = "classpath:config/releasePath.properties")
@ConfigurationProperties(prefix = "rp")
@Getter
@Setter
public class ReleasePaths {
    public String ignoringPaths;
    public String interceptPaths;
}
