package com.example.demo.config;

import com.example.demo.api.entity.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AcmeProperties.class)
public class MyTesConfig {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.hashCode());
        System.out.println(System.identityHashCode(obj));
        String a="123";
        String b = "123";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(obj);
        System.out.println(a.getClass().getCanonicalName());
        System.out.println(a.getClass().getName());
        User user = new User();
        System.out.println(user);
        System.out.println(user.hashCode());
        System.out.println(Integer.toHexString(user.hashCode()));
    }
}
