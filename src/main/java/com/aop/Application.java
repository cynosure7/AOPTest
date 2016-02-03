package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(PageConfig.class);
        DesktopPage page
                = context.getBean("desktopPage", DesktopPage.class);

        page.doSomething();
    }

}