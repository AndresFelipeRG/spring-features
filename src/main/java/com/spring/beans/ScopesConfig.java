package com.spring.beans;

import com.spring.model.HelloMessageGenerator;
import com.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class ScopesConfig {

    @Bean
    @Scope("singleton")
    public Person personSingleton(){
        return new Person();
    }

    @Bean
    @Scope("prototype")
    public Person personPrototype(){
        return new Person();
    }

    @Bean
    @RequestScope
    public HelloMessageGenerator requestScopedBean(){
        return new HelloMessageGenerator();
    }

    @Bean
    @SessionScope
    public HelloMessageGenerator sessionScopedBean(){
        return new HelloMessageGenerator();
    }

    @Bean
    @ApplicationScope
    public HelloMessageGenerator applicationScopedBean(){
        return  new HelloMessageGenerator();
    }
}
