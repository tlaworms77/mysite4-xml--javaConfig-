package com.douzone.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.douzone.config.web.FileUploadConfig;
import com.douzone.config.web.MVCConfig;
import com.douzone.config.web.MessagesConfig;
import com.douzone.config.web.SecurityConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.douzone.mysite.controller", "com.douzone.mysite.exception", "com.douzone.mysite.aspect"})
@Import(value= {MVCConfig.class, SecurityConfig.class, MessagesConfig.class, FileUploadConfig.class})
public class WebConfig {
	
}
