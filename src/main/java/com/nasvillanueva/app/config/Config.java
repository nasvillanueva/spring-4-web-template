package com.nasvillanueva.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by NazIsEvil on 4/6/2015.
 */

@Configuration
@ComponentScan("com.nasvillanueva.app")
@EnableWebMvc
@Import(SecurityConfig.class)
public class Config{


}
