package com.aufine.util.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource(value = "classpath:config/releasePath.properties")
@ConfigurationProperties(prefix = "rp")
@Getter
@Setter
public class ReleasePaths {
    public String ignoringPaths;
    public String interceptPaths;
}
