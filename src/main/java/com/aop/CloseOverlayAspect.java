package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CloseOverlayAspect {

    @Before("@within(com.aop.CloseOverlay) || @target(com.aop.CloseOverlay)")
    public void closeOverlay() {
        System.out.println("Close Overlay.");
    }
}