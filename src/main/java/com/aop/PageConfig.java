package com.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class PageConfig {
    @Bean
    public DesktopPage desktopPage() {
        return new DesktopPage();
    }

    @Bean
    public CloseOverlayAspect closeOverlayAspect() {
        return new CloseOverlayAspect();
    }
}
