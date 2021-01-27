package ru.zettai.spring.aop.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.zettai.spring.aop")
@PropertySource("classpath:myConfig.properties")
@EnableAspectJAutoProxy
public class MyConfig {

}
