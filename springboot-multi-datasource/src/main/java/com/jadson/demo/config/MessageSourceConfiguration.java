package com.jadson.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class MessageSourceConfiguration {

//    @Bean(name = "messageSource")
//    public ReloadableResourceBundleMessageSource messageSource() {
//        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//        messageSource.setBasename("classpath:messages/message");
//        messageSource.setDefaultEncoding("UTF-8");
//        messageSource.setCacheSeconds(3600);
//        return messageSource;
//    }
//
//    @Bean(name = "localeResolver")
//    public LocaleResolver localeResolver() {
//        CookieLocaleResolver localeResolver = new CookieLocaleResolver();
//        localeResolver.setCookieMaxAge(604800);
//        localeResolver.setDefaultLocale(Locale.SIMPLIFIED_CHINESE);
//        localeResolver.setCookieName("Language");
//        return localeResolver;
//    }

}
