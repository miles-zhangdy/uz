package org.uz.resources.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;  
  
@Configuration  
@ImportResource({ "classpath:spring-dubbo.xml" })  
public class DubboConfig {  
  
}  