package com.cier.chapter02.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.cier.chapter02.soundsystem") // 默认扫描与配置类相同的包,括号内设置扫描包的路径
//@ComponentScan(basePackages = "com.cier.chapter02.soundsystem") // 更加清楚的指定基础包
//@ComponentScan(basePackages = {"com.cier.chapter02.soundsystem","video"}) // 设置多个基础包
@ComponentScan(basePackageClasses = {CompactDisc.class,SgtPeppers.class})
public class CDPlayerConfig {
}
