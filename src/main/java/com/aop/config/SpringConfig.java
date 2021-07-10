package com.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Cjl
 * @date 2021/7/8 19:39
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScans({
        @ComponentScan("com.aop.advice"),
        @ComponentScan("com.aop.config"),
        @ComponentScan("com.aop.service")
})
public class SpringConfig {
}
